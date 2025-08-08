from django.shortcuts import render
from models.asignatura import Asignatura

def home(request):
    # Crear las asignaturas
    asignaturas = [
        Asignatura("Programación", "Juan Pérez", 5),
        Asignatura("Bases de Datos", "María Gómez", 4),
        Asignatura("Desarrollo Web", "Carlos Ruiz", 6),
        Asignatura("Sistemas Informáticos", "Ana Sánchez", 3),
    ]

    # Pasar el diccionario con las asignaturas a la plantilla
    return render(request, 'asignaturas.html', {'asignaturas': asignaturas})
