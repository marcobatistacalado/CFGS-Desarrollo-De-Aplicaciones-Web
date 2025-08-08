from functools import reduce
cadena = "hola que tal".split()
mayus = [x.title() for x in cadena]
print(mayus) #devuelve el array
#quiero pasar a cadena de nuevo: Join o Reduce??
traducir = reduce(lambda x,y : x+" "+y, mayus)
print(traducir)
