import csv

f=open("data/datos.csv","r")
contenido=csv.reader(f,delimiter=",")

print(contenido)
print("----------------------------")

l=list(contenido) 
"""Pierdo contenido, se vacía"""
print(l)
print("----------------------------")

for item in l:
    #print(item)
    nombre=""
    for i in item:
        nombre=nombre+" " + i
    print(str(item) + " - " +nombre)   
f.close()

print("----------------------------") 

f=open("data/datos.csv","r")
contenido=csv.reader(f)
for row in contenido:
    print(contenido.line_num,":",row)
    #print(row)
   
f.close()


f=open("data/datos2.csv","r")
d=csv.DictReader(f,delimiter=',')
print(d)
for i in d:
    print(i)