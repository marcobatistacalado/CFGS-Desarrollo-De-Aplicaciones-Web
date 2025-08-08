'''def construirTriangulo1(car):
    for i in range(0, altura):
        print(car*i)
def construirTriangulo2(car):
    for i in range(altura, 0, -1):
        print(car*i)
        
altura = int(input("Introduce altura: "))
construirTriangulo1("*")
construirTriangulo2("*")'''

#VERSION MEJORADA:
anchura = int(input("Introduce altura: "))
for i in range(1,anchura+1):
    print("*"*i)
for i in range(1,anchura+1):
    print("*"*(anchura-i))