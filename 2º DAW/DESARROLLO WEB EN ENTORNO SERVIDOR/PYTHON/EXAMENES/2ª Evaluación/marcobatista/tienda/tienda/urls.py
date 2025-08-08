"""
URL configuration for tienda project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/5.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from productos import views

urlpatterns = [
    path('', views.Home, name="home"),
    path('login/', views.Login, name="login"),
    path('categorias/', views.Categorias, name="categorias"),
    path('ver_productos/<str:categoria>/', views.VerProductos, name="ver_productos"),
    path('eliminar_producto/<str:producto>/', views.EliminarProducto, name="eliminar_producto"),
    path('editar_producto/<str:producto>/', views.EditarProducto, name="editar_producto"),
    path('crear_producto/', views.CrearProducto, name="crear_producto")
]
