personas = {}

def agregarGusto():
    p = input("Introduce nombre persona: ").lower()
    g = input("Introduce el gusto: ").lower()
    if p in personas:
        if g in personas[p]:
            print("La persona ya tiene ese gusto")
        else:
            personas[p].append(g)
            print("Se añadió el gusto a esa persona")
    else:
        personas[p] = [g]
        print("Se ha creado a la persona y se ha añadido el gusto")

def main():
    continuar = "s"  # Variable para controlar si continuar o no
    while continuar != "*":  # Se continuará hasta que el usuario introduzca '*'
        agregarGusto()
        continuar = input("Si no quieres continuar introduce '*', de lo contrario presiona cualquier tecla: ").lower()
    
    # Mostrar todos los gustos al final
    for persona, gustos in personas.items():
        print("Nombre: " + persona)
        print("Gustos: " + str(gustos))

main()
