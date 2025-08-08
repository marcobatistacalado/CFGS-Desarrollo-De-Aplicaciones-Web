# modelos/beca_fp.py
from modelos.beca import Beca, calcular_edad

class BecaFP(Beca):
    contador_fp = 1

    def __init__(self, nif, localidad, renta, fecha_nacimiento):
        super().__init__(nif, renta, fecha_nacimiento)
        self.localidad = localidad
        self.codigo = f"FP{BecaFP.contador_fp}"
        BecaFP.contador_fp += 1

    def puntuar_beca(self):
        puntos = 0
        edad = calcular_edad(self.fecha_nacimiento)

        # Puntuar según la localidad
        if self.localidad.lower() == "madrid":
            puntos += 1

        # Puntuar según renta
        if self.renta < 6000:
            puntos += 2
        elif 6000 <= self.renta <= 10000:
            puntos += 1

        # Puntuar según edad
        if edad > 21:
            puntos += 2

        return puntos

    def __str__(self):
        return f"Beca FP - {self.codigo}: {super().__str__()}, Localidad: {self.localidad}"
