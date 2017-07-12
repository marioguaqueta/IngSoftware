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
    return render (request, 'tutorial/login.html',{'loginuser':loginuser})



def index(request):

    user = User.objects.filter(id=request.session['id'])
    print(user)
    return render (request, 'tutorial/index.html',{'user':user[0]})    


def register(request):
    registerform=UserForm()
    if request.method == "POST":
        registerpost = UserForm(request.POST)
        if registerpost.is_valid():
            registerpost.save()
            return redirect('login')
    return render (request, 'tutorial/register.html',{'registerform':registerform})