# Función para comprobar si el nombre ya está en la lista de tuplas
def existe_en_tuplas(nombre, lista_tuplas):
    for tupla in lista_tuplas:
        if tupla[0] == nombre:  # Si el nombre ya está en alguna tupla
            return True
    return False

n = ""
lista_nombres = []
tuplas_frecuencia = []

while n != "-1":
    n = input("Introduce nombres. Para finalizar (-1): ")
    if n != "-1":
        lista_nombres.append(n.strip())

print("Lista introducida:", lista_nombres)

# Recorremos la lista de nombres
for nombre in lista_nombres:
    # Si el nombre no está ya en la lista de tuplas, contamos su frecuencia y lo añadimos
    if not existe_en_tuplas(nombre, tuplas_frecuencia):
        veces_aparece = lista_nombres.count(nombre)  # Contar cuántas veces aparece el nombre
        tuplas_frecuencia.append((nombre, veces_aparece))  # Añadir la tupla (nombre, frecuencia)

# Mostrar las tuplas de (nombre, frecuencia)
print("Tuplas de (nombre, frecuencia):", tuplas_frecuencia)
