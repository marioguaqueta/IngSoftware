from django.conf.urls import *
from tuto import views
urlpatterns = [
    url(r'^login/',views.login, name = 'login'),
    url(r'^index/',views.index, name = 'index'),
]
