def printarFichero(ruta):
    f=open(ruta,"r")
    for linea in f:
        print(linea[0:-1])
    f.close()
        
def escribeFichero(ruta,lista):
    f=open(ruta,"w")
    f.writelines(lista)
    f.close()