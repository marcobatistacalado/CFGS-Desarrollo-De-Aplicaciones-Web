def inicializar(argumento=""):
    try:
        # Abrir el archivo en modo lectura
        with open("contador.txt", "r") as f:
            content = f.read().strip()

        # Si está vacío, lo inicializamos a 0
        if content == "":
            num = 0
        else:
            num = int(content)

        # Incrementar, decrementar o mostrar según el argumento
        if argumento == "inc":
            num += 1
        elif argumento == "dec":
            num -= 1
        elif argumento == "":
            print(f"Esto es lo que hay: {num}")
            return

        # Guardar el nuevo valor en el archivo
        with open("contador.txt", "w") as f:
            f.write(str(num))

    except FileNotFoundError:
        # Si el archivo no existe, lo creamos con valor 0
        with open("contador.txt", "w") as f:
            f.write("0")

# Probar la función
# inicializar("dec")  # Decrementar
#inicializar("inc")  # Incrementar
inicializar("")     # Mostrar el contenido
