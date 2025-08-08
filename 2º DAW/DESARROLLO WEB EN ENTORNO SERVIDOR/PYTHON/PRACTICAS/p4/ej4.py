def verificarListaOrdenada(lista):
    if lista == sorted(lista):  # Usamos sorted() para obtener una lista nueva ordenada
        print("Está ordenada")
    else:
        print("No está ordenada")
        
lista1 = [7,4,2,6,2]
verificarListaOrdenada(lista1)
lista2 = [1,2,3,4,5]
verificarListaOrdenada(lista2)

