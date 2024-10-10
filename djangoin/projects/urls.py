from django.contrib import admin
from django.urls import path
from .  import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path("index",views.index,name="index"),
    path("signup",views.signup,name="signup"),
    path("signin",views.signin,name="signin"),
    path("homepage",views.homepage,name="homepage"),



    path('create_user', views.create_user, name='create-user'),  # to point out the create_user method
    path('signin_user', views.signin_user, name='signin-user'),  # to point out the create_user method
]
