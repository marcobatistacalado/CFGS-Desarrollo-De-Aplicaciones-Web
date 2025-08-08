alumnos_notas = {
    "Ana": 8.5,
    "Luis": 7.0,
    "María": 9.2,
    "Pedro": 6.8,
    "Lucía": 8.0,
    "Juan": 4.5,
    "Sofía": 9.0,
    "Carlos": 7.5
}

suspensos = list(filter(lambda t : t[1]<5, alumnos_notas.items()))
aprobados = list(filter(lambda t : t[1]>5, alumnos_notas.items()))
nota = input("Nota minima:")
notaIntroducida = list(filter(lambda t : t[1]>nota, alumnos_notas.items()))
print("SUSPENSOS:"+suspensos)
print("APROBADOS: "+aprobados)
print("POR NOTA: "+notaIntroducida)
