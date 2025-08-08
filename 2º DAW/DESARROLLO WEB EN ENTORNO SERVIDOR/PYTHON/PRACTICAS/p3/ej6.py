def convertirTiempo(segundos, **kwargs):
    if 'horas' in kwargs and 'minutos' in kwargs:
        horas = kwargs['horas']
        minutos = kwargs['minutos']
        total_segs = (horas * 3600) + (minutos * 60) + segundos
        return total_segs
    elif segundos is not None:
        horas = segundos // 3600  
        minutos = (segundos % 3600) // 60  
        segundos_restantes = segundos % 60  
        return horas, minutos, segundos_restantes
    else:
        return "Error: Se necesita al menos el parámetro 'segundos'."

# Caso 1: Convierte horas, minutos y segundos a segundos
total_segundos = convertirTiempo(segundos=30, horas=2, minutos=30)
print("Total en segundos:", total_segundos)

# Caso 2: Convierte solo segundos a horas, minutos y segundos
horas, minutos, segundos_restantes = convertirTiempo(segundos=9300)
print(f"9300 segundos son {horas} horas, {minutos} minutos y {segundos_restantes} segundos.")
