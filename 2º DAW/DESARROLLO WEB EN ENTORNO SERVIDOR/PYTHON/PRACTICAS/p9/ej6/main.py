'''
6. El fichero calificaciones.csv contiene las calificaciones de un curso. Durante el curso
se realizaron dos exámenes parciales de teoría y un examen de práctica. Los
alumnos que tuvieron menos de 4 en alguno de estos exámenes pudieron repetirlo
al final del curso (convocatoria ordinaria). Escribir un programa que contenga las
siguientes funciones:

b) Una función que reciba una lista de diccionarios como la que devuelve la
función anterior y añada a cada diccionario un nuevo par con la nota final del
curso. El peso de cada parcial de teoría en la nota final es de un 30% mientras
que el peso del examen de prácticas es de un 40%.

c) Una función que reciba una lista de diccionarios como la que devuelve la
función anterior y devuelva dos listas, una con los alumnos aprobados y otra
con los alumnos suspensos. Para aprobar el curso, la asistencia tiene que ser
mayor o igual que el 75%, la nota de los exámenes parciales y de prácticas
mayor o igual que 4 y la nota final mayor o igual que 5.

'''
import csv


'''
a) Una función que reciba el fichero de calificaciones y devuelva una lista de
diccionarios, donde cada diccionario contiene la información de los exámenes y
la asistencia de un alumno. La lista tiene que estar ordenada por apellidos.
'''
def funcion1(fichero):
    lista = []
    
    with open(fichero, "r", encoding="UTF-8") as f:
        lector = csv.DictReader(f)
        for fila in lector:
            apellidos = fila["Apellidos"]
            nombre = fila["Nombre"]
            asistencia = fila["Asistencia"][0:2]

            examenes = {
                "Parcial1": float(fila["Parcial1"]) if fila["Parcial1"] else 0,
                "Parcial2": float(fila["Parcial2"]) if fila["Parcial2"] else 0,
                "Ordinario1": float(fila["Ordinario1"]) if fila["Ordinario1"] else 0,
                "Ordinario2": float(fila["Ordinario2"]) if fila["Ordinario2"] else 0
            }

            
            diccionario = {
                "apellidos" : apellidos,
                "nombre" : nombre,
                "asistencia" : asistencia,
                "examenes" : examenes
            }
            
            lista.append(diccionario)
            
            lista_ordenada = sorted(lista, key=lambda x: x["apellidos"])
        '''
        # Imprimir la lista ordenada
        for fila in lista_ordenada:
            apellidos = fila["apellidos"]
            nombre = fila["nombre"]
            asistencia = fila["asistencia"]
            examenes = fila["examenes"]
                
            print(f"Nombre: {nombre} {apellidos}")
            print(f"Asistencia: {asistencia}")
            print("Exámenes:")
            for examen, calificacion in examenes.items():
                print(f"  {examen}: {calificacion}")
                print("-" * 40)  # Separador entre alumnos
        '''
        return lista_ordenada


'''
b) Una función que reciba una lista de diccionarios como la que devuelve la
función anterior y añada a cada diccionario un nuevo par con la nota final del
curso. El peso de cada parcial de teoría en la nota final es de un 30% mientras
que el peso del examen de prácticas es de un 40%.
'''
def funcion2(lista):
    for alumno in lista:

        parcial1 = alumno["examenes"]["Parcial1"]
        parcial2 = alumno["examenes"]["Parcial2"]
        ordinario1 = alumno["examenes"]["Ordinario1"]
        ordinario2 = alumno["examenes"]["Ordinario2"]
        
        # Calculamos la nota final
        #nota_final = (parcial1 * 0.30) + (parcial2 * 0.30) + (ordinario1 * 0.40)
        nota_final = (parcial1 * 0.30) + (parcial2 * 0.30) + ((ordinario1 + ordinario2) / 2 * 0.40)

        # Añadimos la nota final al diccionario del alumno
        alumno["nota_final"] = round(nota_final, 2)
        
    return lista


# Lista de alumnos que devuelve la funcion1
alumnos = funcion1("calificaciones.csv")

# Añadimos la nota final de cada alumno
alumnos_con_notas_finales = funcion2(alumnos)

# Imprimimos los resultados
for alumno in alumnos_con_notas_finales:
    print(f"Nombre: {alumno['nombre']} {alumno['apellidos']}")
    print(f"Nota final: {alumno['nota_final']}")
    print("-" * 40)
    
  
print("-"*100)  
def funcion3(lista):
    aprobados = []
    suspensos = []
    
    for alumno in lista:
        # Obtener las notas y asistencia del alumno
        asistencia = float(alumno["asistencia"])
        parcial1 = alumno["examenes"]["Parcial1"]
        parcial2 = alumno["examenes"]["Parcial2"]
        ordinario1 = alumno["examenes"]["Ordinario1"]
        ordinario2 = alumno["examenes"]["Ordinario2"]
        nota_final = alumno["nota_final"]
        
        # Comprobar si cumple las condiciones para aprobar
        if asistencia >= 75 and parcial1 >= 4 and parcial2 >= 4 and ordinario1 >= 4 and ordinario2 >= 4 and nota_final >= 5:
            aprobados.append(alumno)
        else:
            suspensos.append(alumno)
    
    return aprobados, suspensos


# Lista de alumnos con las notas finales calculadas por funcion2
alumnos_con_notas = funcion2(alumnos)

# Llamada a la funcion3 para clasificar a los aprobados y suspensos
aprobados, suspensos = funcion3(alumnos_con_notas)

# Imprimir resultados
print("Aprobados:")
for alumno in aprobados:
    print(f"{alumno['nombre']} {alumno['apellidos']} - Nota Final: {alumno['nota_final']}")

print("\nSuspensos:")
for alumno in suspensos:
    print(f"{alumno['nombre']} {alumno['apellidos']} - Nota Final: {alumno['nota_final']}")
