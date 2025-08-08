import calculoFechas.FuncionesAuxiliares as f


# Ejemplo de extraer el año de una fecha (en formato YYYYMMDD)
fecha = 20200901
anio = f.extraer_anio(fecha)
print(f"Año: {anio}")  # Output: Año: 2020

# Ejemplo de extraer el mes de una fecha (en formato YYYYMMDD)
mes = f.extraer_mes(fecha)
print(f"Mes: {mes}")  # Output: Mes: 09

# Ejemplo de extraer el día de una fecha (en formato YYYYMMDD)
dia = f.extraer_dia(fecha)
print(f"Día: {dia}")  # Output: Día: 01

# Ejemplo de la función year, que utiliza extraer_anio
anio_year = f.year(fecha)
print(f"Año desde 'year': {anio_year}")  # Output: Año desde 'year': 2020

# Ejemplo de la validación del mes con es_mes_valido
mes_valido = f.es_mes_valido(mes)
print(f"El mes es válido: {mes_valido}")  # Output: El mes es válido: True

# Ejemplo de la validación de si un año es bisiesto
anio_bisiesto = 2020
anio_no_bisiesto = 2021
print(f"¿Es bisiesto el año {anio_bisiesto}? {f.es_bisiesto(anio_bisiesto)}")  # Output: ¿Es bisiesto el año 2020? True
print(f"¿Es bisiesto el año {anio_no_bisiesto}? {f.es_bisiesto(anio_no_bisiesto)}")  # Output: ¿Es bisiesto el año 2021? False

# Ejemplo de obtener los días de un mes (febrero, considerando bisiesto)
dias_febrero_bisiesto = f.obtener_dias_del_mes('02', anio_bisiesto)
print(f"Días en febrero (bisiesto): {dias_febrero_bisiesto}")  # Output: Días en febrero (bisiesto): 29

# Ejemplo de obtener los días de un mes (febrero, no bisiesto)
dias_febrero_no_bisiesto = f.obtener_dias_del_mes('02', anio_no_bisiesto)
print(f"Días en febrero (no bisiesto): {dias_febrero_no_bisiesto}")  # Output: Días en febrero (no bisiesto): 28

# Ejemplo de validar si un día es válido para un mes y año dado
dia_valido = f.es_dia_valido(anio_bisiesto, '02', '29')
print(f"¿Es válido el día 29 de febrero en 2020? {dia_valido}")  # Output: ¿Es válido el día 29 de febrero en 2020? True

dia_invalido = f.es_dia_valido(anio_no_bisiesto, '02', '29')
print(f"¿Es válido el día 29 de febrero en 2021? {dia_invalido}")  # Output: ¿Es válido el día 29 de febrero en 2021? False

# Ejemplo de extraer fechas de un número con varias fechas
fechas_varias = 20200901202010250301041520210217
fechas_extraidas = f.extraer_fechas(fechas_varias)
print(f"Fechas extraídas: {fechas_extraidas}")  
# Output: Fechas extraídas: ['20200901', '20201025', '20210301', '20210217']
