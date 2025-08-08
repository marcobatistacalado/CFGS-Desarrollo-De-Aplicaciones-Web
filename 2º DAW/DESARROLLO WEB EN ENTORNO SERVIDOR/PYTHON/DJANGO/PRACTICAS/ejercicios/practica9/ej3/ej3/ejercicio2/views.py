'''
Motrar la fecha y hora actuales con un template. Pasarle a la plantilla el
objeto fecha que nos retorna python y acceder al día, mes y año para
mostrar la fecha en formato dia/mes/año
'''
from django.shortcuts import render
from datetime import datetime

def fecha(request):
    contexto = {'fecha':datetime.now()}
    return render(request, 'fechaActual.html', contexto)