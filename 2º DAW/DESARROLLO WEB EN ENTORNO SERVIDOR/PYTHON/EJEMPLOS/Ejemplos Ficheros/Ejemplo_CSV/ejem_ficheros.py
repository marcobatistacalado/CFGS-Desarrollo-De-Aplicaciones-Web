import csv


#fichero=open("resources/AlumnosFP.csv","r",encoding="latin-1")
#datos=list(csv.reader(fichero,delimiter=";"))
#print(datos)

with open("resources/AlumnosFP.csv","r",encoding="latin-1") as fichero:
    datos=csv.reader(fichero,delimiter=";")
    for row in datos:
        print(row[0] , " - " , row[1])
        print("---------------------------------------------------")


with open("resources/AlumnosFP.csv","r",encoding="latin-1") as fichero:
    datos=csv.reader(fichero,delimiter=";")
    encabezados=next(datos)
    print(encabezados) #si no pongo esta línea no se escriben los encabezados
    for row in datos:
        print(row[0] , " - " , row[1])
        print("---------------------------------------------------")

