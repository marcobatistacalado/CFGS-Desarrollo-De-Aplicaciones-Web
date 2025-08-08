from django.db import models
from django.core.exceptions import ValidationError

# Create your models here.
class Categoria (models.Model):
    nombre = models.CharField(max_length=50, primary_key=True)  
    descripcion = models.CharField(max_length = 100, null=True, blank =True)

def validar_precio(valor):
    if valor > 50:
        raise ValidationError("el precio no puede ser mayor de 50")
    
class Producto  (models.Model):
     idProducto = models.AutoField(primary_key=True)
     nombre = models.CharField(max_length=50)  
     descripcion = models.CharField(max_length = 100, null=True, blank =True)
     precio = models.DecimalField(max_digits=4, decimal_places=2, validators=[validar_precio])
     fecha_creacion = models.DateTimeField(auto_now_add = True, null = True)
     categoria = models.CharField(max_length=50)
     
class Usuario(models.Model):
    email = models.CharField(max_length=80, primary_key=True)  
    nombre = models.CharField(max_length=100)
    password = models.CharField(max_length = 16)  
    
