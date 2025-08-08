from django.http import HttpResponse
from django.shortcuts import render


# Clase Persona
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

# Vista de saludo
def saluda(request):
    p = Persona('Rosa', 34)
    contexto = {
        'nombre': "Rosa",
        'mensaje': ", estoy saludando a la clase: HOLA DAW2!!!!!!",
        'l': [6, 7, 3, 4],
        'person': p
    }
    return render(request, 'index.html', contexto)

# Vista de despedida
def despedida(request):
    return render(request, 'salir.html')