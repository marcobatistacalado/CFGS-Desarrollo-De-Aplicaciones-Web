import json

with open("resources/imagenes.json","r") as fichero:
    datos=json.load(fichero)
    print(datos)
    for row in datos:
        print("----------------------------------------")
        for item in row:
            #print(item[0],":",item[1])
            print(item , ":" , row[item])
        print("----------------------------------------")
        

