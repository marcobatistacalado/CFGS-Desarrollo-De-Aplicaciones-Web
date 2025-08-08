import random

# Entradas de los jugadores
jA = input("Introduce tu nombre de jugador A: ")
jB = input("Introduce tu nombre de jugador B: ")

# Atributos de ataque y defensa aleatorios
ataqueA = random.randint(1, 10)
defensaA = random.randint(1, 15)

ataqueB = random.randint(1, 10)
defensaB = random.randint(1, 15)

# Personajes en forma de lista [nombre, ataque, defensa, vidas]
personajes = [
    [jA, ataqueA, defensaA, 3],
    [jB, ataqueB, defensaB, 3]  # vidas = 3
]

# Determinar quién empieza primero
turno = random.randint(0, 1)
print("Empieza: " + personajes[turno][0])
print("---------------------------------------------------------")

# Bucle de juego basado en vidas restantes
while personajes[0][3] > 0 and personajes[1][3] > 0: 
    atacante = personajes[turno]
    defensor = personajes[1 - turno]

    realizarAtaque = random.randint(1, atacante[1])  # Ataque aleatorio basado en el poder de ataque del atacante
    print("Atacante: " + str(atacante[0] + " - Ataque: " + str(realizarAtaque) + " dp"))

    # Reducir la defensa del defensor con el ataque realizado
    defensor[2] -= realizarAtaque
    print("Defensor: " + str(defensor[0] + " - Puntos defensa restantes: " + str(defensor[2])))

    if defensor[2] <= 0:
        defensor[3] -= 1  # El defensor pierde una vida
        print("Defensor: " + str(defensor[0]) + " ha perdido una vida. Vidas restantes: " + str(defensor[3]))

        if defensor[3] <= 0:
            print(str(defensor[0]) + " ha perdido todas sus vidas. " + str(atacante[0]) + " es el ganador!")
            break
        else:
            # Reiniciar la defensa y el ataque del defensor
            defensor[2] = random.randint(1, 15)  # Reiniciar defensa aleatoria
            defensor[1] = random.randint(1, 10)  # Reiniciar ataque aleatorio
            print(str(defensor[0]) + " reinicia con " + str(defensor[2]) + " puntos de defensa y " + str(defensor[1]) + " puntos de ataque.")

    # Cambiar el turno
    turno = 1 - turno
    print("---------------------------------------------------------")

'''
while True: 
    atacante = personajes[turno]
    defensor = personajes[1-turno]
        
    realizarAtaque = random.randint(1, atacante[1]) #realizar ataque aleatorio
    print("Ataque de "+str(realizarAtaque)+"dp hecho por "+str(atacante[0]))
    atacante[1]-=realizarAtaque
    defensor[2] -= realizarAtaque
    print("El defensor: "+str(defensor[0])+" se queda a: "+str(defensor[2]))
    if defensor[2] < 0:
        print("Ha perdido "+str(defensor[0]))
        break
    turno = 1 - turno #alternar de turno'''
    
        