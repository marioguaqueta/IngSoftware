from django import forms
from .models import *
from django.contrib.auth.models import User
from crispy_forms.helper import FormHelper
from crispy_forms.layout import Layout, Fieldset, ButtonHolder, Submit,Button,Div
from crispy_forms.bootstrap import Field, InlineRadios, TabHolder, Tab,FormActions,StrictButton



#Formulario para el ingreso de usuario
class LoginForm(forms.Form):

    username = forms.CharField(label = 'Nombre de usuario')
    password = forms.CharField(label = 'Contraseña', widget = forms.PasswordInput)

    def __init__(self, *args, **kwargs):
        super(LoginForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_tag = False
        self.helper.layout = Layout(
            Field('username',css_class='container-fluid'),
            Field('password',css_class='container-fluid'),
            )
        self.fields['username'].required=True
        self.fields['password'].required=True


class UserForm(forms.ModelForm):
    class Meta:
        model = User 
        fields = ['first_name', 'last_name','username','email','password']
        labels = {'first_name':'Nombres',
        'last_name':'Apellidos',
        'username':'Nombre de usuario',
        'email':'Email',
        'password':'Contraseña',
        }

    def __init__(self, *args, **kwargs):
        super(UserForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_tag = False
        self.helper.layout = Layout(
            Div(
                Field('first_name',css_class="form-control"),
                Field('last_name',css_class="form-control"),
                Field('username',css_class="form-control"),
                Field('email',css_class="form-control"),
                Field('password',css_class="form-control"),
                css_class='container-fluid'
                ),
            ButtonHolder(
                    Submit('submit', 'Registarse', css_class='button white'),
                ),
        )


