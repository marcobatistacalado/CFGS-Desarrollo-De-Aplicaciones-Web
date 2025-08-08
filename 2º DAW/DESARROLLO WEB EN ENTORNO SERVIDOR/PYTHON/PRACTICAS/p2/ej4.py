import random
r = random.randint(1, 10) #investigar

while(1 == 1):
    intr = int(input("Numero introducido:"))
    if intr > r:
        print("El numero a adivinar es menor")
    elif intr < r:
        print("El numero a adivinar es mayor")
    else:
        print("HAS ACERTADO")
        break