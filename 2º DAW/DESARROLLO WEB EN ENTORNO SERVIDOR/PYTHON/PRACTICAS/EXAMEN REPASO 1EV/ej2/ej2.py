import csv

def obtenerClientes(fichero):
    clientes = {}
    with open(fichero, "r", encoding="UTF-8") as f:
        lector = csv.DictReader(f, delimiter=';')
        for fila in lector:
            clientes[fila["nif"]] = {
                "nombre": fila["nombre"],
                "email": fila["email"],
                "telefono": fila["teléfono"],
                "descuento": float(fila["descuento"])
            }
        return clientes
        
clientes = obtenerClientes("clientes.csv")

for nif, cliente in clientes.items():
    print("----------------------------------------")
    print("Cliente - "+nif)
    print(cliente)