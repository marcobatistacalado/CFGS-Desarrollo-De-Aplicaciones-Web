from modelos.contacto import Contacto
from modelos.agenda import Agenda
from menus.menus import mostrar_menu_principal, mostrar_menu_busqueda
from menus.validacion import validar_opcion, validar_telefono
from excepciones.invalid_format import InvalidFormat
from excepciones.out_range import OutRange

def main():
    agenda = Agenda()

    while True:
        mostrar_menu()
        try:
            opcion = int(input("Selecciona una opción: "))
            if opcion == 1:
                nombre = input("Introduce el nombre: ")
                telefono = input("Introduce el teléfono: ")
                email = input("Introduce el email: ")
                agenda.añadir_contacto(Contacto(nombre, telefono, email))
            elif opcion == 2:
                print("Criterios de búsqueda: nombre, telefono, email")
                criterio = input("Introduce el criterio de búsqueda: ").lower()
                valor = input("Introduce el valor: ")
                resultados = agenda.buscar_contacto(criterio, valor)
                if resultados:
                    print("Resultados:")
                    for contacto in resultados:
                        print(contacto)
                else:
                    print("No se encontraron contactos.")
            elif opcion == 3:
                telefono = input("Introduce el teléfono del contacto a eliminar: ")
                agenda.eliminar_contacto(telefono)
            elif opcion == 4:
                print("\nContactos en la agenda:")
                print(agenda)
            elif opcion == 5:
                print("\nContactos en formato diccionario:")
                diccionario_contactos = agenda.transformar_a_diccionario()
                for nombre, contacto in diccionario_contactos.items():
                    print(f"{nombre}: {contacto}")
            elif opcion == 6:
                print("¡Hasta luego!")
                break
            else:
                print("Opción no válida. Intenta de nuevo.")
        except ValueError:
            print("Debes introducir un número. Intenta de nuevo.")

if __name__ == "__main__":
    main()

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
