# modulos/utils.py
from excepciones import SolicitudNoExisteError
from modelos.beca_fp import BecaFP
from modelos.beca_libros import BecaLibros

# Lista global de solicitudes (mantenida en utils.py)
solicitudes = []

# Función para buscar una beca por NIF
def buscar_beca_por_nif(nif):
    for beca in solicitudes:
        if beca.nif == nif:
            return beca
    raise SolicitudNoExisteError(f"No se encontró ninguna solicitud con NIF: {nif}")

# Función para mostrar todas las becas
def mostrar_becas():
    for beca in solicitudes:
        print(beca)

# Función para eliminar becas con 0 puntos
def eliminar_becas_con_0_puntos():
    global solicitudes
    solicitudes = [beca for beca in solicitudes if beca.puntuar_beca() > 0]

# Función para sumar 1 punto a becas FP de Madrid
def sumar_punto_fp_madrid():
    for beca in solicitudes:
        if isinstance(beca, BecaFP) and beca.localidad.lower() == "madrid":
            beca.renta += 1  # La renta no tiene mucho sentido para sumar puntos, podrías sumar un punto a otro atributo
