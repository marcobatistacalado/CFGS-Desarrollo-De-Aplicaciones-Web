import modulos as m

#OPCIONES
print("OPCIONES APP:")
print("1) Añadir cliente:")
print("2) Consultar cliente")
print("3) Borrar cliente")
opc = input("Elige una opción")

if opc == "1":
    #AÑADIR CLIENTE
    nombre = input("Introduce el nombre: ")
    telefono = input("Introduce el telefono:")
    m.addClient(nombre, telefono)
elif opc == "2":
    #CONSULTAR NUMERO
    nombre = input("Introduce el nombre: ")
    resultado = m.searchClient(nombre)
    print(resultado)
elif opc == "3":
    #ELIMINAR TELEFONO DE CLIENTE
    telefono = input("Introduce el número de teléfono a eliminar: ")
    resultado = m.deleteNumberClient(telefono)
    print(resultado)

else:
    print("opcion no valida")
    

