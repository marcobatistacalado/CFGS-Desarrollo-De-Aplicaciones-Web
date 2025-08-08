import re

def validar_dni(dni):
    patron = r'^\d{8}[A-Za-z]$'  # 8 dígitos seguidos de una letra
    if re.match(patron, dni):
        return True
    else:
        print("DNI no válido. El formato debe ser 8 números seguidos de una letra.")
        return False

def validar_edad(edad):
    if edad.isdigit():
        if int(edad) >= 18:
            return True
        else:
            print("La edad debe ser al menos 18 años.")
            return False
    else:
        print("Por favor, introduce un número válido para la edad.")
        return False
