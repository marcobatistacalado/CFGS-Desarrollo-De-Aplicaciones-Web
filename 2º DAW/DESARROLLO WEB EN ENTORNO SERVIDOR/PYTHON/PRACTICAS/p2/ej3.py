def comprobarCaracter(caracter):
    if len(caracter) != 1:
        print("Por favor, introduce solo un carácter.")
    else:
        # Comprobar si es una letra mayúscula
        if caracter.isupper():
            print("El carácter es una letra mayúscula.")
        # Comprobar si es una letra minúscula
        elif caracter.islower():
            print("El carácter es una letra minúscula.")
        # Comprobar si es un dígito
        elif caracter.isdigit(): #investigar
            print("El carácter es un dígito.")
        else:
            print("El carácter no es una letra ni un dígito.")  


caract = input("Introduce caracter:")
comprobarCaracter(caract)