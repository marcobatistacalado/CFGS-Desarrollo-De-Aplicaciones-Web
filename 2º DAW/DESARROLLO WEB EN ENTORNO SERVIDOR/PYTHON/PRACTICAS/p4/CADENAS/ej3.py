def encontrarSubcadena(cadena, subcadena):
    if  (cadena.index(subcadena)==-1):
        print("La subcadena no se encuentra en la cadena principal")
    else:
        print("La subcadena se encontró en la cadena principal")
        
def ordenarCadenas(cadena, subcadena):
    arr = [cadena,subcadena]
    arr.sort()
    print("Orden:" +str(arr[0])+","+str(arr[1]))
cadena = input("Introduce cadena: ")
subcadena = input("Introduce subcadena: ")
encontrarSubcadena(cadena,subcadena)
ordenarCadenas(cadena,subcadena)