def filtrar_Palabras(lista, num):
    for s in lista:
        if (len(s)==num):
            print(s)

lista = ["hola", "como", "estas"]
filtrar_Palabras(lista, 4)