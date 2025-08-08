from django.shortcuts import render
from asignaturas.models.asignatura import Asignatura

def vista_asignaturas(request):
    # Crear las asignaturas
    asignaturas = [
        Asignatura("Programación", "Juan Pérez", 5, "asignaturas/img/programacion.png"),
        Asignatura("Bases de Datos", "María Gómez", 4, "asignaturas/img/bbdd.png"),
        Asignatura("Desarrollo Web", "Carlos Ruiz", 6, "asignaturas/img/dw.png"),
        Asignatura("Sistemas Informáticos", "Ana Sánchez", 3, "asignaturas/img/si.png"),
    ]

    # Pasar el diccionario con las asignaturas a la plantilla
    return render(request, 'asignaturas/asignaturas.html', {'asignaturas': asignaturas})
