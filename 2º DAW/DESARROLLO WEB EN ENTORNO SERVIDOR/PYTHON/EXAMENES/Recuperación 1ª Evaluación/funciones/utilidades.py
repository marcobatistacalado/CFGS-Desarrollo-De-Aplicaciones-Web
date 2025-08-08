import json

def get_datos():
    with open("assets/charlas.json", "r") as f:
        datos = json.load(f)
        return datos
        
def get_charlas_aforo(lista_salas, porcentaje):
    
    diccionarioFinal = {}
    for sala in lista_salas:
        charlas = []
        charlas_filtradas = []
        for charla in sala["charlas"]:
            charlas.append(charla)
            
        charlas_filtradas = list(filter(lambda x : x["entradasvendidas"] < (porcentaje * sala["aforo"])/100, charlas))
        diccionarioFinal[sala["numero_sala"]] = charlas_filtradas
    
    return diccionarioFinal

def venta_entradas(tema, num_entradas, lista_salas):
    for sala in lista_salas:
        charlas = []
        charlas_filtradas = []
        for charla in sala["charlas"]:
            charlas.append(charla)
            
        charlas_filtradas = list(filter(lambda x : x["tema"] == tema, charlas))
        if (charlas_filtradas != []):
            aforo = sala["aforo"]
            vendidas = charlas_filtradas[0]["entradasvendidas"]
            disponibles = aforo - vendidas
            precio = charlas_filtradas[0]["precio"]
            print(vendidas)
            break
        
    if (num_entradas < disponibles):
        return True
        #FALTA ESCRIBIR EN EL JSON: cambiar el numero de entradas vendidas de esa charla y la recaudacion de la sala (vendidas*precio)
        #ESTO YA ES DEMASIADO.... xd
    else:
        return False
    

def genera_csv(lista_salas, archivo_csv):
    import csv

    with open("assets/salida.csv", mode='w', newline='', encoding='utf-8') as file:
        writer = csv.writer(file)
        writer.writerow(["Numero Sala", "Numero de Charlas", "Recaudacion"])

        for sala in lista_salas:
            numero_sala = sala['numero_sala']
            num_charlas = len(sala['charlas'])
            recaudacion = sala['recaudacion']
            writer.writerow([numero_sala, num_charlas, recaudacion])