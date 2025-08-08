import mipaquete.modulo1 as m
import mipaquete.modulo2 as m2
usuarios = {}

user = input("Introduce usuario: ")

while (user != "*"):
    
    while (m.validarUsuarios(user) == False):
        user = input("Introduce usuario: ")
        if user == "*":
            break
        
    if user == "*":
        break
        
    password = input("Introduce la contraseña: ")
    while (m.validarPassword(password) == False):
        password = input("Introduce la contraseña: ")
        
    dni = input("Introduce el dni: ")
    while (m2.validar_dni(dni) == False):
        dni = input("Introduce el dni: ")
        
    edad = input("Introduce la edad : ")
    while (m2.validar_edad(edad) == False):
        edad = input("Introduce la edad: ")
    
    if user in usuarios:
        print("El usuario ya existe.")
    else:
    # mirar si la contraseña es l a misma
        password_existe = False
        for usuario_data in usuarios.values():
            if usuario_data['password'] == password:
                password_existe = True
                break

    if password_existe:
        print("La contraseña ya existe.")
    else:
        usuarios[user] = {
            "password": password,
            "dni": dni,
            "edad": edad
        }
    print("Usuario dado de alta.")
    print("---------------------------------------")
    user = input("Introduce usuario: ")

print("")
print("Todos los usuarios a continuación:")
for usuario, datos in usuarios.items():
    print(f"Usuario: {usuario}, Contraseña: {datos['password']}, DNI: {datos['dni']}, Edad: {datos['edad']}")