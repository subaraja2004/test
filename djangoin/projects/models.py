from django.db import models

class ProjectsUsers(models.Model):
    username = models.TextField()
    password = models.TextField(default='defautpasswordfortesting')
    email = models.TextField(blank=True)
    
    class Meta:
            db_table = ''
