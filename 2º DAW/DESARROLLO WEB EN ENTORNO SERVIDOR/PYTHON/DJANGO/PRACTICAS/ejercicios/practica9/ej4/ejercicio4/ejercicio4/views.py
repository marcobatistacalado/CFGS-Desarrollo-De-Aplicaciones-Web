from django.shortcuts import render
from .models.lenguaje import Lenguaje

def lenguaje(request):
    # Crear el objeto Lenguaje con los datos de tu lenguaje de programación favorito
    lenguaje_favorito = Lenguaje(
        nombre="Python",
        año=1991,
        descripcion="Python es un lenguaje de programación interpretado, de alto nivel y propósito general."
    )
    
    # Pasar el objeto lenguaje_favorito a la plantilla
    return render(request, 'lenguajeFav.html', {'lenguaje': lenguaje_favorito})
