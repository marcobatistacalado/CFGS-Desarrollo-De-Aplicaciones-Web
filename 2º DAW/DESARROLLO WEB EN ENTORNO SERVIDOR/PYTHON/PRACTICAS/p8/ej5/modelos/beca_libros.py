# modelos/beca_libros.py
from modelos.beca import Beca, calcular_edad

class BecaLibros(Beca):
    contador_libros = 1

    def __init__(self, nif, nota, renta, fecha_nacimiento):
        super().__init__(nif, renta, fecha_nacimiento)
        self.nota = nota
        self.codigo = f"LI{BecaLibros.contador_libros}"
        BecaLibros.contador_libros += 1

    def puntuar_beca(self):
        puntos = 0
        edad = calcular_edad(self.fecha_nacimiento)

        # Puntuar según nota
        if 7 <= self.nota <= 8:
            puntos += 1
        elif 9 <= self.nota <= 10:
            puntos += 2

        # Puntuar según renta
        if self.renta < 6000:
            puntos += 2

        # Puntuar según edad
        if edad <= 20:
            puntos += 2

        return puntos

    def __str__(self):
        return f"Beca Libros - {self.codigo}: {super().__str__()}, Nota: {self.nota}"
