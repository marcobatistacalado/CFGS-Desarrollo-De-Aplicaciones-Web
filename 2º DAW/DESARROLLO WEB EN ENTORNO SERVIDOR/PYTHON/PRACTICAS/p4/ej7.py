n=0
lista = []
while (n!="-1"):
    n = input("Introduce nombres. Para finalizas (-1): ")
    if (n!="-1"):
        lista.append(n.strip()) #limpiar espacios

print(lista)

lista.sort()#ordenar alfabeticamente para que sea mas optimo el siguiente procedimiento:

i = 0
while(i<len(lista)):
    vecesAparece = lista.count(lista[i])
    print(str(lista[i])+": "+str(vecesAparece))
    i += vecesAparece #me salto todas las veces que esta repetida esa palabra

