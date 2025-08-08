def rectangulo(altura, anchura):
    cad = "*"
    for i in range(0, altura):
        print(cad*4)
        
altura = int(input("Introduce altura: "))
anchura = int(input("Introduce anchura: "))
rectangulo(altura, anchura)

