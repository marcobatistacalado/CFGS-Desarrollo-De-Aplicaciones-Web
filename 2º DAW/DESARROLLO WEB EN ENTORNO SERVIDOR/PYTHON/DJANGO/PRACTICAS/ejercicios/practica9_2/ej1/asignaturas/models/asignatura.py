class Asignatura:
    def __init__(self, nombre, profesor, horas_semanales, imagen):
        self.__nombre = nombre
        self.__profesor = profesor
        self.__horas_semanales = horas_semanales
        self.__imagen = imagen  

    @property
    def nombre(self):
        return self.__nombre

    @property
    def profesor(self):
        return self.__profesor

    @property
    def horas_semanales(self):
        return self.__horas_semanales

    @property
    def imagen(self):  
        return self.__imagen
