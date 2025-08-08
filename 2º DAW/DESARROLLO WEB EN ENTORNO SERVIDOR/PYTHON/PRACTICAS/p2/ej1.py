# Función para calcular la comisión del cajero automático
def calcular_comision(retiro):
    if retiro < 1000:
        return 10  # Comisión mínima
    else:
        # Calculamos la comisión según el múltiplo de 1000€
        comision = 10 * ((retiro // 1000) + 1)
        return comision

# Solicitar al usuario el monto de retiro
retiro = float(input("Introduce la cantidad que deseas retirar: "))

# Calcular la comisión
comision = calcular_comision(retiro)

# Mostrar el resultado
print(f"La comisión por retirar {retiro}€ es de {comision}€.")
