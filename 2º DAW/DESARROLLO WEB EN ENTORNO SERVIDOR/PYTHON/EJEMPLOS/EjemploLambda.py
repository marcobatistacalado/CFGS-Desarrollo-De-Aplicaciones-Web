suma = lambda x,y:x+y
s = suma(3,4)
lista = [('Bea', 19), ('Ana', 23), ('Juan', 7)]
#lista.sort(key=lambda t:t[1],reverse=True)
lista.sort(key=lambda t:t[0]) #ordenar alfabeticamente
print(lista)

#map: modificar cada uno de los elementos de la lista
l = list(map (lambda t:(t[0], t[1]+1), lista)) #este devuelve el valor por eso tengo que coger los elementos
print(l)

#filter
l = list(filter(lambda t: t[1]>=18, lista)) #aqui devuelve la tupla entera
print(l)