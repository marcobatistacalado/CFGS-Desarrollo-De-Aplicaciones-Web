def crearTextoCentrado(cadena):
    columnas = 80
    c = "-"
    s = " "
    g = "-"
    espacio = (40-len(cadena)//2)*s
    print (g*columnas)
    print (espacio+cadena)
    print (espacio+(g*len(cadena)))
    
crearTextoCentrado("Hola, que tal")