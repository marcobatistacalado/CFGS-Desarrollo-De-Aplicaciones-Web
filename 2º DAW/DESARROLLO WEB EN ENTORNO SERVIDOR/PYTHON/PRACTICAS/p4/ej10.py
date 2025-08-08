import random
from colorama import Fore, Style, init  # Importar para mostrar colores en la consola

# Inicializa colorama
init(autoreset=True)

def generar_combinacion():
    colores = ["R", "A", "Z", "V", "N", "B", "F"]  
    combinacion = []  
    
    # combinación de 5 colores con un máximo de 2 fichas por color
    while len(combinacion) != 5:
        r = random.randint(0, len(colores) - 1)
        color = colores[r]
        if combinacion.count(color) < 2:  # NO más de 2 colores iguales
            combinacion.append(color) 
    
    return combinacion  

# Generar la combinación secreta
c = generar_combinacion()  
print("Combinación secreta (para pruebas):", c)  # Mostrar para pruebas
intentos = 6  # El jugador tiene 6 intentos

while intentos != 0:
    # Solicitar la combinación al jugador
    u = input("Introduce combinación posible separada por espacios (ejemplo: R V N B A): ").upper().split(" ") 
    
    if len(u) != 5: 
        print("Debes introducir exactamente 5 colores separados por espacios.")
        continue  # volver a pedir la combinación si no es válida
    else:
        resultado = ["-"] * 5  # Inicializar la lista de resultados con guiones ("-")
        
        # Primer paso: Comprobar aciertos exactos (color y posición correctos)
        for i in range(len(c)):
            if u[i] == c[i]:  # Si el color está en la posición correcta
                resultado[i] = Fore.GREEN + u[i] + Style.RESET_ALL  # Marcamos en verde el acierto completo
        
        # Segundo paso: Comprobar si el color está en la combinación pero en una posición incorrecta
        for i in range(len(u)):
            if resultado[i] == "-":  # Solo comprobar si no se acertó ya el color y posición
                if u[i] in c and u.count(u[i]) <= c.count(u[i]):  # Comprobar si está en la combinación
                    resultado[i] = Fore.YELLOW + "O" + Style.RESET_ALL  # Marcamos con una "O" en amarillo
        
        print("Resultado: ")
        for res in resultado:
            print(res, end=" ")  # Mostrar cada símbolo por separado
        print()  # salto de línea
        
        # Comprobar si ha ganado
        if resultado == [Fore.GREEN + c[i] + Style.RESET_ALL for i in range(5)]:  # Si ha acertado todo
            print("¡Has ganado!")
            break
    
    intentos -= 1  
    print("INTENTOS DISPONIBLES: " + str(intentos)) 

if intentos == 0:
    print("Te has quedado sin intentos. La combinación era:", c)  
