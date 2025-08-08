from modelos.contacto import Contacto
from modelos.agenda import Agenda
from menus.menus import mostrar_menu_principal, mostrar_menu_busqueda
from menus.validacion import validar_opcion, validar_telefono
from excepciones.invalid_format import InvalidFormat
from excepciones.out_range import OutRange

def main():
    agenda = Agenda()

    while True:
        mostrar_menu_principal()
        opcion = input("Seleccione una opción: ")

        try:
            opcion = validar_opcion(opcion, 1, 5)
        except (InvalidFormat, OutRange) as e:
            print(e)
            continue

        if opcion == 1:  # Añadir contacto
            nombre = input("Nombre: ")
            telefono = input("Teléfono: ")
            email = input("Email: ")
            try:
                validar_telefono(telefono)
                contacto = Contacto(nombre, telefono, email)
                agenda.añadir_contacto(contacto)
            except InvalidFormat as e:
                print(e)

        elif opcion == 2:  # Buscar contacto
            mostrar_menu_busqueda()
            criterio = input("Seleccione un criterio: ")

            try:
                criterio = validar_opcion(criterio, 1, 3)
                criterios = {1: "nombre", 2: "telefono", 3: "email"}
                valor = input(f"Ingrese el {criterios[criterio]}: ")
                resultados = agenda.buscar_contacto(criterios[criterio], valor)
                if resultados:
                    for r in resultados:
                        print(r)
                else:
                    print("No se encontraron contactos.")
            except (InvalidFormat, OutRange) as e:
                print(e)

        elif opcion == 3:  # Listar contactos
            print("\nContactos:")
            print(agenda)

        elif opcion == 4:  # Eliminar contacto
            telefono = input("Teléfono del contacto a eliminar: ")
            try:
                validar_telefono(telefono)
                agenda.eliminar_contacto(telefono)
            except InvalidFormat as e:
                print(e)

        elif opcion == 5:  # Salir
            print("Saliendo de la agenda...")
            break

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