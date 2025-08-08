import csv

def listarCorreos():
    lista = []
    with open("AlumnosFP.csv", "r", encoding="UTF-8") as f:
        lector = csv.DictReader(f, delimiter=",")
        for fila in lector:
            lista.append(fila["Usuario"])
    return lista

def addAlumno(correo):
    with open("AlumnosFP.csv", "a", encoding = "UTF-8") as f:
        f.write(correo+"\n")
    

with open("ListadoAlumnosFP.csv", "r", encoding="UTF-8") as f:
    lector = csv.DictReader(f, delimiter=";")
    for fila in lector:
        correo = (fila["Nombre"]+"."+fila["Apellido1"]+"@plazacastilla.salesianas.org").lower()
        listaCorreos = listarCorreos()
        if correo in listaCorreos:
            correo = (fila["Nombre"]+"."+fila["Apellido1"]+"."+fila["Apellido2"]+"@plazacastilla.salesianas.org").lower()
            
        cadenaCompleta = fila["Nombre"]+" "+fila["Apellido1"]+","+correo+","+"password,"+"Ventajas de uso de Microsoft 365 A3 para estudiantes"
        addAlumno(cadenaCompleta)