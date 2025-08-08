inmuebles = [
    {'año': 2000, 'metros': 100, 'habitaciones': 3, 'garaje': True, 'zona': 'A'},
    {'año': 2012, 'metros': 60, 'habitaciones': 2, 'garaje': True, 'zona': 'B'},
    {'año': 1980, 'metros': 120, 'habitaciones': 4, 'garaje': False, 'zona': 'A'},
    {'año': 2005, 'metros': 75, 'habitaciones': 3, 'garaje': True, 'zona': 'B'},
    {'año': 2015, 'metros': 90, 'habitaciones': 2, 'garaje': False, 'zona': 'A'}
]

def anyadir_precio(inmuebles):
    for i in inmuebles:
        zona = i["zona"]
        garaje = 0
        if i["garaje"]:
            garaje = 15000
        if zona == "A":
            precio = round((i["metros"]*1000 + i["habitaciones"] * 5000 + garaje ) * (i["año"]/100), 1)
        elif i["zona"] == "B":
            precio = round(((i["metros"]*1000 + i["habitaciones"] * 5000 + garaje ) * (i["año"]/100))*1.5, 1)
        i["precio"] = precio
        
    return inmuebles    

def mostrarListaDeDiccionarios():
    for inmueble in inmuebles:
        print(inmueble)

mostrarListaDeDiccionarios()
inmuebles = anyadir_precio(inmuebles)
print("-----------------------------------")
mostrarListaDeDiccionarios()

print("+++++++++++++++++++++BUSQUEDA POR PRECIO:")
precioLeido = float(input("Introduce un precio de busqueda: "))
busqueda = filter(lambda x : x["precio"] <= precioLeido, inmuebles)
for inmueble in list(busqueda):
        print(inmueble)