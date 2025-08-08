def search():
    dic = {}
    personas = []
    with open("personas.txt", "r") as f: #cuidado con la terminal donde estamos colocados para ejecutar!
        for i in f.readlines():
            array = i.split(";")
            dic = {
                'id' : array[0],
                'nombre' : array[1],
                'apellido' : array[2],
                'fecha' : array[3][0:-1] #quitar salto de linea
            }
            personas.append(dic)
        print(personas)

search()