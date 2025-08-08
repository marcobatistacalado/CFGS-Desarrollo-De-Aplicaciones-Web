# modelos/beca.py
from datetime import datetime

# Función para calcular la edad a partir de la fecha de nacimiento
def calcular_edad(fecha_nacimiento):
    fecha_nacimiento = datetime.strptime(fecha_nacimiento, "%d-%m-%Y")
    hoy = datetime.today()
    edad = hoy.year - fecha_nacimiento.year - ((hoy.month, hoy.day) < (fecha_nacimiento.month, fecha_nacimiento.day))
    return edad

# Clase base para la Beca
class Beca:
    def __init__(self, nif, renta, fecha_nacimiento):
        self.nif = nif
        self.renta = renta
        self.fecha_nacimiento = fecha_nacimiento
        self.codigo = None

    def puntuar_beca(self):
        raise NotImplementedError("Este método debe ser implementado por las subclases.")

    def __str__(self):
        return f"NIF: {self.nif}, Renta: {self.renta}, Fecha de Nacimiento: {self.fecha_nacimiento}"
