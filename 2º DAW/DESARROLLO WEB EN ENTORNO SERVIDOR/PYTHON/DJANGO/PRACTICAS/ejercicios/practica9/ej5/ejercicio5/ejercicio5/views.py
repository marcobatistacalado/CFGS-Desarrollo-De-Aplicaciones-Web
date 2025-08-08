from django.shortcuts import render
from .models.lenguaje import Lenguaje

def lenguaje(request):
    # Lista de lenguajes que sabemos
    lenguajes_sabidos = [
        Lenguaje("Python", 1991, "Python es un lenguaje de programación interpretado, de alto nivel y propósito general."),
        # Otros lenguajes pueden ser añadidos aquí...
    ]
    
    # Pasar la lista de lenguajes a la plantilla
    return render(request, 'lenguajeFav.html', {'lenguajes': lenguajes_sabidos})
