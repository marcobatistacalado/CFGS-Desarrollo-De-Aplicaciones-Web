cadena = input("Cadena: ")

ar = cadena.split(' ')

mostrar = ""
for i in ar:
    mostrar += (i[0])

print(mostrar)

mostrar = ""
for i in ar:
    mostrar += str(i[0]).upper()+i[1:]+" " #slice como el substr en otros lenguajes
    
print(mostrar)

mostrar = ""
for i in ar:
    if str(i[0]) == "a" or str(i[0]) == "A":
        mostrar += i+" "
        
print(mostrar)

#esto con funciones mejor pero que pereza