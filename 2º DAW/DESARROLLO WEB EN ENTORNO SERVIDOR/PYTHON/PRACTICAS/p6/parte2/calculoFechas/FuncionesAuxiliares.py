"""
Funciones auxiliares para reutilizar más tarde
"""


def extraer_anio(fecha):
    # Convertimos a string y extraemos los primeros 4 dígitos
    return str(fecha)[0:4]


def extraer_mes(fecha):
    return str(fecha)[4:6]


def extraer_dia(fecha):
    return str(fecha)[6:8]


def year(fecha):
    return extraer_anio(fecha)


def es_mes_valido(mes):
    mes_como_entero = int(mes)
    if mes_como_entero <= 0 or mes_como_entero > 12:
        return False
    else:
        return True


def es_bisiesto(anio):
    return anio % 4 == 0 and (anio % 100 != 0 or anio % 400 == 0)


def obtener_dias_del_mes(mes, anio):
    mes_entero = int(mes)
    anio_entero = int(anio)
    # Abril, junio, septiembre y noviembre tienen 30
    if mes_entero in [4, 6, 9, 11]:
        return 30
    # Febrero depende de si es o no bisiesto
    if mes_entero == 2:
        if es_bisiesto(anio_entero):
            return 29
        else:
            return 28
    else:
        # En caso contrario, tiene 31 días
        return 31


def es_dia_valido(anio, mes, dia):
    dia_entero = int(dia)
    dias_del_mes = obtener_dias_del_mes(mes, anio)
    if dia_entero <= 0 or dia_entero > dias_del_mes:
        return False
    else:
        return True


def extraer_fechas(fechas):
    lista = []
    fechas_string = str(fechas)
    cantidad_fechas = int(len(fechas_string) / 8)
    for i in range(cantidad_fechas):
        fecha_extraida = fechas_string[i * 8:(i * 8) + 8]
        lista.append(fecha_extraida)
    return lista