def cantidadSegundos(horas, minutos, segundos):
    total_segs = (horas*(60*60))+(minutos*60)+segundos
    return total_segs

horas = int(input("Introduce nº de horas: "))
minutos = int(input ("Introduce nº de minutos: "))
segundos = int(input("Introduce u nº de segundos: "))

print("Total segundos:"+str(cantidadSegundos(horas,minutos,segundos)))

def convertir_tiempo(segundos):
    horas = segundos // 3600 #division entera
    minutos = (segundos % 3600) // 60
    segundos_restantes = segundos % 60
    return horas, minutos, segundos_restantes

total_segundos = int(input("Introduce la cantidad de segundos: "))
horas, minutos, segundos_restantes = convertir_tiempo(total_segundos)

print(f"{total_segundos} segundos son {horas} horas, {minutos} minutos y {segundos_restantes} segundos.")
