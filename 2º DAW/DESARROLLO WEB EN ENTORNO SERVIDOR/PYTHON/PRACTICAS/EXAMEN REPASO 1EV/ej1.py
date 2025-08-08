def esVocal(letra):
    vocales = ["a", "e", "i", "o", "u"]
    if letra.lower() in vocales:
        return True
    return False

def estaEnLista(letra, lista):
    for i in lista:
        if i[0] == letra:
            return lista.index(i)
    return -1

def transformar(lista):
    listaTuplas =[]
    for i in lista:
        tupla = (i[0], i[1])
        listaTuplas.append(tupla)
    return listaTuplas
    
#lista1 = [ ['E', 3] , ['A', 1]]

#print(estaEnLista("A", lista1))
#print(estaEnLista("E", lista1))

'''
listaTransformada = transformar(lista1)
print("LISTA TRANSFORMADA:")
print(listaTransformada)
listaOrdenada = sorted(listaTransformada, key=lambda x: x[1], reverse=True)
print("LISTA ORDENADA:")
print(listaOrdenada)
'''

# MAIN
cadena = "Hola que tal me llamo Marco y soy de Portugal."
listaDeListas = [['A', 0], ['E', 0], ['I', 0], ['O', 0], ['U', 0]]

# Actualizar la lista con las frecuencias de vocales
for i in cadena.upper():
    if esVocal(i):
        pos = estaEnLista(i, listaDeListas)
        if pos != -1:
            listaDeListas[pos][1] += 1

listaTransformada = transformar(listaDeListas)

# Ordenar la lista de tuplas por el segundo elemento (frecuencia) de mayor a menor
listaOrdenada = sorted(listaTransformada, key=lambda x: x[1], reverse=True)

print("Lista de tuplas ordenada de mayor a menor frecuencia:")
print(listaOrdenada)