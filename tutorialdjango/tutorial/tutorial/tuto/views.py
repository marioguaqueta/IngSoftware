from django.shortcuts import render, redirect,render_to_response
from .forms import *
from django.contrib.auth import authenticate



def login(request):
    loginuser=LoginForm()
    if request.method == "POST":
        loginpost = LoginForm(request.POST)
        if loginpost.is_valid():
           user = authenticate(username=loginpost.data['username'], password=loginpost.data['password'])
           print(user)
           if user is not None:
               print("Login OK")
               request.session['id'] = user.id
               return redirect('index')
           else:
               print("Login not OK")
        else:
            print("Not Is Valid")
    return render (request, 'tuto/login.html',{'loginuser':loginuser})


def index(request):

    user = User.objects.filter(id=request.session['id'])
    print(user)
    return render (request, 'tuto/index.html',{'usuario':user[0]})    