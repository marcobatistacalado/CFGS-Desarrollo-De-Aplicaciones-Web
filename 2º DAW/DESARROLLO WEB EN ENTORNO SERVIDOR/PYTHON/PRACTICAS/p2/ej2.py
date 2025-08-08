def validarMes(mes):
    # Verificar si el mes está fuera de rango
    if mes < 1 or mes > 12:
        print("No has introducido un mes correcto.")
        return
    
    # Verificar los meses con 31 días
    if mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12:
        print("El mes tiene 31 días.")
    # Verificar los meses con 30 días
    elif mes == 4 or mes == 6 or mes == 9 or mes == 11:
        print("El mes tiene 30 días.")
    # Verificar febrero
    elif mes == 2:
        print("Febrero tiene 28 días excepto si es año bisiesto, que tiene 29 días.")

# Solicitar al usuario el mes
mes_usuario = int(input("Introduce el mes (número del 1 al 12): "))
validarMes(mes_usuario)
