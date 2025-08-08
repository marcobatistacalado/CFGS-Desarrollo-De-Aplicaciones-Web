from excepciones.invalid_format import InvalidFormat
from excepciones.out_range import OutRange

def validar_opcion(opcion, minimo, maximo):
    try:
        opcion = int(opcion)
        if opcion < minimo or opcion > maximo:
            raise OutRange("Opción fuera del intervalo.")
        return opcion
    except ValueError:
        raise InvalidFormat("Debe ingresar un número válido.")

def validar_telefono(telefono):
    if not telefono.isdigit() or len(telefono) != 9 or not telefono.startswith("6"):
        raise InvalidFormat("El teléfono debe comenzar con '6' y tener 9 dígitos.")
