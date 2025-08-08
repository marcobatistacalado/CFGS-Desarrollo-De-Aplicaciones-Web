# main.py

from modelos.lista import Lista

def main():
    # Crear una instancia de Lista
    mi_lista = Lista([1, 2, 3, 4, 5])

    print("Lista original:")
    mi_lista.mostrar()

    print("\nSuma de 3 a cada elemento:")
    resultado_suma = mi_lista + 3
    resultado_suma.mostrar()

    print("\nResta de 2 a cada elemento:")
    resultado_resta = mi_lista - 2
    resultado_resta.mostrar()

    print("\nMultiplicación por 2 a cada elemento:")
    resultado_multiplicacion = mi_lista * 2
    resultado_multiplicacion.mostrar()

    print("\nDivisión de cada elemento entre 2:")
    resultado_division = mi_lista / 2
    resultado_division.mostrar()

if __name__ == "__main__":
    main()
