from django.conf.urls import *
from tutorial import views
urlpatterns = [
    url(r'^login/',views.login, name = 'login'),
    url(r'^index/',views.index, name = 'index'),
    url(r'^register/',views.register, name = 'register'),
]