cadena = input("Introduce cadena: ").lower().split()
diccionario = {}
for i in cadena:
    if i in diccionario:
        diccionario[i]+=1 #si existe le sumamos uno
    else:
        diccionario[i] = 1 #sino lo creamos

print(diccionario)