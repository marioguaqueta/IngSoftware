from django import forms
from .models import *
from django.contrib.auth.models import User
from crispy_forms.helper import FormHelper
from crispy_forms.layout import Layout, Fieldset, ButtonHolder, Submit,Button,Div
from crispy_forms.bootstrap import Field, InlineRadios, TabHolder, Tab,FormActions,StrictButton



class LoginForm(forms.Form):

    username = forms.CharField(label = 'Nombre de usuario')
    password = forms.CharField(label = 'Contraseña', widget = forms.PasswordInput)

    def __init__(self, *args, **kwargs):
        super(LoginForm, self).__init__(*args, **kwargs)
        self.helper = FormHelper()
        self.helper.form_tag = False
        self.helper.layout = Layout(
            Field('username',css_class='col-xs-4'),
            Field('password',css_class='col-xs-4'),
            )
        self.fields['username'].required=True
        self.fields['password'].required=True