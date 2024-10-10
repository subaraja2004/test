from django.shortcuts import render
from . models import ProjectsUsers
from django.http import JsonResponse
def index(request):
    return render(request,"index.html")

def signup(request):
    return render(request,"signup.html")


def homepage(request):
     return render(request,"homepage.html")



def create_user(request): # in request have fd data
    try:
            user_record = ProjectsUsers()
            un = request.POST.get('username', 'dummyusername')
            pwd = request.POST.get('password', 'dummypassword')
            em = request.POST.get('email', 'dummyemail')
            # Smarket_user_record = SmarketUsers.objects.create
            # (
            # username=un,
            # password=pwd,
            # email=em
            # )
            user_record.username=un
            user_record.password=pwd
            user_record.email=em
            user_record.save()
            data = {"status_code":"your account created successfully with the name:"+un }
            payload = {
                'usersignupresponse': data
            }
    except:
       
        data = {"status_code":"error in account creation"}
        payload = {
            'usersignupresponse': data
        }
    return JsonResponse(payload)




def signin(request):
    return render(request,"signin.html")
         


def signin_user(request): # to capture and verify the entered username and password  against user table entry
   
    text_message = "empty"
    try:
            
            Smarket_user_record = ProjectsUsers()
           
            un_em = request.POST.get('username_or_email', 'dummyusername_dummyemail')
            
            pwd = request.POST.get('password', 'dummypassword')
            
          
         
            if ProjectsUsers.objects.filter(username=un_em).count()>0 :
                
                Smarket_user_record= ProjectsUsers.objects.get(username=un_em)
                
                text_message= Smarket_user_record.password
               
                if Smarket_user_record.password==pwd:
                    
                     
                    data = {"status_code":"1","status_message":"Signin success"}
                    
                    payload = {
                    'usersignupresponse': data
                 }
                    return JsonResponse(payload)
                else:
                    
                    data = {"status_code":"0","status_message":"Signin failed and Password Wrong"}
                    payload = {
                    'usersignupresponse': data
                    }
                    return JsonResponse(payload)
            else:
                
                data = {"status_code":"0","status_message":"Username wrong and not available  "+un_em}
                payload = {
                'usersignupresponse': data
                }
                return JsonResponse(payload)
                         
    
    except:
       
        data = {"status_code":"error in account creation", "text_message":text_message+","+un_em  }
        payload = {
            'usersignupresponse': data
        }
    return JsonResponse(payload)




