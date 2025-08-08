# ejercicio1/models/lenguaje.py

class Lenguaje:
    def __init__(self, nombre, año, descripcion):
        self.__nombre = nombre
        self.__año = año
        self.__descripcion = descripcion

    @property
    def nombre(self):
        return self.__nombre

    @property
    def año(self):
        return self.__año

    @property
    def descripcion(self):
        return self.__descripcion
