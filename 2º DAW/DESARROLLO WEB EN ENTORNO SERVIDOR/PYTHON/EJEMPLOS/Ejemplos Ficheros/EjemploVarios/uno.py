f=open("EjemplosFicheros/data/ejemplo1.txt","r")

print("\n\nPRIMERA FORMA")
print("-------------\n")
for linea in f:
    print(linea)

f.seek(0)
for linea in f.readlines():
    print(linea)
    
    
print("\n\nSEGUNDA FORMA")
print("-------------\n")
f.seek(0)
print(f.readlines())


print("\n\nTERCERA FORMA")
print("-------------\n")
f.seek(0)
eof=False
while not eof:
    linea=f.readline()
    if not linea:
        eof=True
    print(linea)



print("\n\nQUITANDO SALTO LÍNEA")
print("-------------------------\n")
f.seek(0)
for linea in f:
    print(linea[0:-1])

f.close()
    




