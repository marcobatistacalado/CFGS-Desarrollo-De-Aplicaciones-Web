# main.py
from modelos.beca_fp import BecaFP
from modelos.beca_libros import BecaLibros
from modulos.utils import buscar_beca_por_nif, mostrar_becas, eliminar_becas_con_0_puntos, sumar_punto_fp_madrid, solicitudes
from excepciones import SolicitudNoExisteError

def menu():
    while True:
        print("\nMenu:")
        print("1. Registrar Beca FP")
        print("2. Registrar Beca Libros")
        print("3. Buscar Beca y Modificar Renta")
        print("4. Mostrar todas las Becas")
        print("5. Eliminar Becas con 0 puntos")
        print("6. Sumar punto a becas FP de Madrid")
        print("7. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            nif = input("Introduce el NIF: ")
            localidad = input("Introduce la localidad: ")
            renta = float(input("Introduce la renta per cápita: "))
            fecha_nacimiento = input("Introduce la fecha de nacimiento (dd-mm-YYYY): ")
            solicitud = BecaFP(nif, localidad, renta, fecha_nacimiento)
            solicitudes.append(solicitud)  # Añadir solicitud a la lista

        elif opcion == "2":
            nif = input("Introduce el NIF: ")
            nota = float(input("Introduce la nota: "))
            renta = float(input("Introduce la renta per cápita: "))
            fecha_nacimiento = input("Introduce la fecha de nacimiento (dd-mm-YYYY): ")
            solicitud = BecaLibros(nif, nota, renta, fecha_nacimiento)
            solicitudes.append(solicitud)  # Añadir solicitud a la lista

        elif opcion == "3":
            nif = input("Introduce el NIF para buscar la solicitud: ")
            try:
                beca = buscar_beca_por_nif(nif)
                nueva_renta = float(input("Introduce la nueva renta: "))
                beca.renta = nueva_renta
            except SolicitudNoExisteError as e:
                print(e)

        elif opcion == "4":
            mostrar_becas()

        elif opcion == "5":
            eliminar_becas_con_0_puntos()

        elif opcion == "6":
            sumar_punto_fp_madrid()

        elif opcion == "7":
            break

        else:
            print("Opción no válida. Intente de nuevo.")

if __name__ == "__main__":
    menu()
