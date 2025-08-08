"""
nombre = "hola"
nombre = 5
print(type(nombre))
letra = nombre[0]
print(letra)
dni = '51495937H'
letra = dni[-1]
print(letra)
codigo="28039"
ciudad = codigo[0:2] #substring: VER ESTO COMO FUNCIONA
poblacion = codigo[2:3]
barrio=codigo[-2:]
"""

#importante indentar de forma adecuada
x=-7
if x<0:
    x+=2
    print(x)
elif x==0:
    print("nulo")
else:
    x=-2
    print(x)

#for
for i in range(0,10,2): #coge de 2 en 2
    print("genial")

l_nombres = ['aaa','bbb','ccc', 'ddd']
l_notas=[7,6,8]
for p,n in zip(l_nombres, l_notas): #recorre ambas listas a la vez
    print(p+" - "+n)
    
