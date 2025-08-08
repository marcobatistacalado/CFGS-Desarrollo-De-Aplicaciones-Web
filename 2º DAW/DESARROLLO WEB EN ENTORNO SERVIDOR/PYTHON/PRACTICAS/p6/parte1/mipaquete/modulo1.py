import re

def validarUsuarios(user):
    if len(user) < 6:
        print("El nombre de usuario debe contener al menos 6 caracteres")
        return False
    
    if len(user) > 12:
        print("El nombre de usuario no puede contener más de 12 caracteres")
        return False
        
    if not user.isalnum():
        print("El nombre de usuario puede contener solo letras y números")
        return False
    
    return True
    
def validarPassword(password):
    if len(password) < 8:
        print("La password debe contener un mínimo de 8 caracteres")
        return False

    # Expresión regular que valida los requisitos
    patron = r'^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*\W)(?!.*\s).{8,}$'

    # Comprobamos si la contraseña cumple con los requisitos usando fullmatch
    if not re.fullmatch(patron, password):
        print("La contraseña elegida no es segura")
        return False

    return True
