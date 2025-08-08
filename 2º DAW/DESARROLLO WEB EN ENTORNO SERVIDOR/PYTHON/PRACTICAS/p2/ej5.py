import random
r = random.randint(1, 10) #investigar
i = 0

while(1 == 1):
    intr = int(input("Numero introducido:"))
    if intr > r:
        print("El numero a adivinar es menor")
        i+=1
    elif intr < r:
        print("El numero a adivinar es mayor")
        i+=1
    else:
        i+=1
        print("HAS ACERTADO después de "+str(i)+" intentos.")#importante
        break