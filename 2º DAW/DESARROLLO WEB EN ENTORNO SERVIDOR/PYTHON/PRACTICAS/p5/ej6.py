facturas = {}

def introducir(cod, valor):
    if cod not in facturas:
        facturas[cod] = valor
    else:
        print("Ya existe esa factura y no se modifica.")

def pagar(cod):
    if cod in facturas:
        p = facturas.pop(cod)  # Elimina la factura y obtiene su valor
        return p
    else:
        print("No existe esa factura")
        return 0

def main():
    pagado = 0 
    opcion = ""  # Variable para controlar la opción del usuario
    
    while opcion != '3':  # Continuar hasta que el usuario seleccione salir
        print("\nOpciones:")
        print("1. Introducir nueva factura")
        print("2. Pagar factura existente")
        print("3. Salir")
        opcion = input("Selecciona una opción: ")
        
        if opcion == '1':
            cod = input("Introduce código de la factura: ")
            valor = float(input("Introduce el coste de la factura: ")) 
            introducir(cod, valor)
        elif opcion == '2':
            cod = input("Introduce código de la factura a pagar: ")
            pagado += pagar(cod)  # Sumar lo pagado
        elif opcion == '3':
            print("Saliendo del programa.")
        else:
            print("Opción no válida. Intenta de nuevo.")
        
        pendiente = sum(facturas.values())  # Total pendiente es la suma de las facturas en el diccionario
        print(f"Total pagado: {pagado:.2f}")
        print(f"Total pendiente: {pendiente:.2f}")

main()
