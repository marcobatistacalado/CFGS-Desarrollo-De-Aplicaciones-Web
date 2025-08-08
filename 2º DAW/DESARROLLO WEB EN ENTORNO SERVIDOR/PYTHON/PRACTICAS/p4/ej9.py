import random

# Paso a) Dibujar el boleto (pedir los números del usuario)
def pedir_boletos():
    boleto = []
    print("Introduce 6 números diferentes entre 1 y 49:")
    while len(boleto) < 6:
        try:
            num = int(input(f"Introduce el número {len(boleto) + 1}: "))
            if num < 1 or num > 49:
                print("El número debe estar entre 1 y 49.")
            elif num in boleto:
                print("Ya has elegido ese número. Elige otro.")
            else:
                boleto.append(num)
        except ValueError:
            print("Por favor, introduce un número válido.")
    return boleto

# Paso b) Realiza el sorteo
def realizar_sorteo():
    return random.sample(range(1, 50), 6)

# Paso c) Comprobar los aciertos
def comprobar_aciertos(boleto, sorteo):
    aciertos = set(boleto) & set(sorteo)  # Intersección entre boleto y sorteo
    return aciertos

# Simulación del juego
def jugar_loteria():
    print("----- Lotería Primitiva -----")
    
    # Boleto del usuario
    boleto_usuario = pedir_boletos()
    print("\nTu boleto es:", boleto_usuario)

    # Realizar el sorteo
    sorteo = realizar_sorteo()
    print("\nNúmeros sorteados:", sorteo)
    
    # Comprobar aciertos
    aciertos = comprobar_aciertos(boleto_usuario, sorteo)
    print(f"\nHas acertado {len(aciertos)} número(s): {sorted(aciertos)}")

# Iniciar el juego
jugar_loteria()
