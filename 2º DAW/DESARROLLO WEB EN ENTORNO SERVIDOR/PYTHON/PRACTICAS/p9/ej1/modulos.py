
def addClient(nombre, numero):
    with open("1 EJERCICIOS FUNDAMENTOS DEL LENGUAJE/PRACTICA9/ej1/listin.txt", "a", encoding="UTF-8") as f:
        f.write(nombre+","+numero)
        print("Cliente añadido!")
        
def searchClient(nombre):
    with open("1 EJERCICIOS FUNDAMENTOS DEL LENGUAJE/PRACTICA9/ej1/listin.txt", "r") as f:
        for i in f.readlines():
            if i.startswith(nombre):
                return "NUMERO DE TELEFONO: "+i.split(" ")[1]
        return "Telefono no encontrado!"

def deleteNumberClient(numero):
    found = False
    with open("1 EJERCICIOS FUNDAMENTOS DEL LENGUAJE/PRACTICA9/ej1/listin.txt", "r", encoding="UTF-8") as f:
        lines = f.readlines()
    with open("1 EJERCICIOS FUNDAMENTOS DEL LENGUAJE/PRACTICA9/ej1/listin.txt", "w", encoding="UTF-8") as f:
        for line in lines:
            if numero not in line.strip():
                f.write(line)
            else:
                found = True
    return "Número eliminado correctamente." if found else "Número no encontrado en el listín."
