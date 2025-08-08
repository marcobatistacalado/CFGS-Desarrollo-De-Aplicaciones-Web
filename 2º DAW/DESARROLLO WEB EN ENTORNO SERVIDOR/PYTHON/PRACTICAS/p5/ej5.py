diccionario={}
def crearDiccionario():
    while (True):
        esp = input("Palabra español:")
        if (esp == '*'):
            break
        en = input("Palabra ingles:")
        if esp not in diccionario:
            diccionario[esp] = en
    
def traduccir(cad):
    traduccion = ""
    cad = cad.split(" ")
    for i in cad:
        if i in diccionario:
            traduccion += diccionario[i]
        else:
            traduccion += i
        traduccion+=" "
    print (traduccion)

crearDiccionario()
cadena = input("Introduce frase español:")
traduccir(cadena)