n=0
lista = []
while n>=0:
   n = int(input ("Introduce un numero:"))
   if (n>=0):
       lista.append(n)
else:
    print("Has introducido un numero negativo")
    
    print("Max: "+ max(lista))
    for i in lista:
        if (i%2==0):
            print("Numero par: "+i)