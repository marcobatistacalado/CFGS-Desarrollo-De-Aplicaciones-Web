diccionario_1=dict()
diccionario_2={}
diccionario_3={'Francia':'francés', 'España':'español'}
diccionario_4={'España':['Madrid', 777777777, 6666]}
#la lista entera
print (diccionario_4['España'])

#la capital
print (diccionario_4['España'][0])
#cambio la poblacion
diccionario_4['España'][1]=490000000
diccionario_5={
    'España':{'capital':'Madrid',
              'poblacion':490000000,
              'superficie':88888
              },
    'Francia':{'capital':'París',
              'poblacion':6666666,
              'superficie':8885588
              }
}
#ver cuantas claves hay
len(diccionario_4)
#ver cuantos datos guarda España
len(diccionario_4['España'])


pais = ("Introduce un pais europeo")
if pais in diccionario_5:
    print("Ya existe")
else:
    print("No esta")
    
#escribo los nombres de los paises
for p in diccionario_5:
    print(p)
for p in diccionario_5.keys():
    print(p)

#escribto todos los datos de cada pais
for p in diccionario_5:
    print(diccionario_5[p])
    
for p in diccionario_5.values():
    print(p)
  
#escribir todo clave y valor  
for p in diccionario_5.items():
    print(p)

#la poblacion de todos los paises
for p in diccionario_5:
    print(p + " - "+str(diccionario_5[p]['poblacion']))

for p in diccionario_5.items(): #me devuelve una tupla
    print(p[0]+" - "+ p[1]['poblacion'])

for c,v, in zip(diccionario_5.keys(), diccionario_5.values()):
    print(str(c)+" - "+str(v['poblacion']))
    

for p in diccionario_5:
    if 'playas' in diccionario_5[p]:
        print(str(p)+" tiene "+diccionario_5[p]['playas']+" playas")
    else:
        print(p +" no tiene playas")