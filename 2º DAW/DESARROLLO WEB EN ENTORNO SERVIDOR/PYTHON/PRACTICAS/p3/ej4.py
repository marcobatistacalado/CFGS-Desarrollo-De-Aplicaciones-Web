def ConvertirEspaciado(cadena, nE):
    espacio = " " * nE
    resultado = ""
    for i in range(len(cadena)): 
        resultado += cadena[i] + espacio

    print(resultado.strip())  #eliminar el último espacio extra

ConvertirEspaciado("Hola, tú", 1)
