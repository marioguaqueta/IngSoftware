from django.db import models
from django.contrib.auth.models import User

# Create your models here.


class UserModel(models.Model):

    user = models.OneToOneField(
        'auth.User',
        verbose_name = u'Perfil de usuario',
    )

    identification  = models.CharField(
        max_length=100,
        verbose_name=u'Número de identificacion',
        null = True,
    )

    direction = models.CharField(
        max_length=300,
        verbose_name=u'Direccion',
        null = True,
    )

    phone = models.CharField(
        max_length=50,
        verbose_name=u'Teléfono Fijo',
        null = True,
    )

    cellphone = models.CharField(
        max_length=80,
        verbose_name=u'Número de celular',
        null = True,
    )


    def __str__(self):
        return self.user.email

    class Meta:
        verbose_name = u'Usuario'
        verbose_name_plural = u'Usuarios'