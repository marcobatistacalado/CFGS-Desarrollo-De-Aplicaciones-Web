from gestor import GestorCuentas
from modelos.plazo_fijo import PlazoFijo
from modelos.cuenta_ahorro import CuentaAhorro

def menu():
    gestor = GestorCuentas()

    while True:
        print("\nMenú:")
        print("1. Añadir una nueva cuenta")
        print("2. Mostrar información de todas las cuentas")
        print("3. Mostrar información de todas las cuentas de un tipo")
        print("4. Mostrar información de una cuenta concreta (por titular)")
        print("5. Calcular interés de una cuenta (por ID)")
        print("6. Salir")

        try:
            opcion = int(input("Elige una opción: "))
        except ValueError:
            print("Por favor, introduce un número válido.")
            continue

        if opcion == 1:
            nombre = input("Introduce el nombre del titular: ")
            apellidos = input("Introduce los apellidos del titular: ")
            saldo = float(input("Introduce el saldo inicial: "))
            tipo = input("¿Qué tipo de cuenta deseas añadir? (ahorro/plazofijo): ").lower()

            if tipo == "ahorro":
                cuenta = CuentaAhorro(nombre, apellidos, saldo)
                gestor.añadir_cuenta(cuenta)
            elif tipo == "plazofijo":
                plazo = int(input("Introduce el plazo (en meses): "))
                interes = float(input("Introduce el interés (%): "))
                cuenta = PlazoFijo(nombre, apellidos, saldo, plazo, interes)
                gestor.añadir_cuenta(cuenta)
            else:
                print("Tipo de cuenta no válido.")

        elif opcion == 2:
            gestor.mostrar_todas_cuentas()

        elif opcion == 3:
            tipo = input("¿Qué tipo de cuenta deseas mostrar? (ahorro/plazofijo): ").lower()
            if tipo == "ahorro":
                gestor.mostrar_cuentas_por_tipo(CuentaAhorro)
            elif tipo == "plazofijo":
                gestor.mostrar_cuentas_por_tipo(PlazoFijo)
            else:
                print("Tipo de cuenta no válido.")

        elif opcion == 4:
            titular = input("Introduce el nombre o apellidos del titular: ")
            gestor.buscar_cuentas_por_titular(titular)

        elif opcion == 5:
            id_cuenta = input("Introduce el ID de la cuenta: ")
            gestor.calcular_interes_por_id(id_cuenta)

        elif opcion == 6:
            print("Saliendo del programa.")
            break

        else:
            print("Opción no válida. Intenta de nuevo.")

if __name__ == "__main__":
    menu()
'''¿Qué hace if __name__ == "__main__":?
__name__ es una variable especial en Python:

Cuando ejecutas un archivo Python directamente, el valor de __name__ se establece automáticamente en "__main__".
Si el archivo se importa como módulo en otro archivo, el valor de __name__ será el nombre del módulo (es decir, el nombre del archivo sin la extensión .py).
if __name__ == "__main__": verifica cómo se ejecuta el archivo:

Si el archivo se ejecuta directamente, el código dentro de este bloque se ejecutará.
Si el archivo se importa, el código dentro del bloque no se ejecutará automáticamente.

La línea if __name__ == "__main__": es un mecanismo en Python que se utiliza para asegurarse de que un bloque de código solo se ejecutará cuando el archivo se ejecute directamente como un programa y no cuando se importe como un módulo en otro archivo.

Aquí está el desglose:
'''