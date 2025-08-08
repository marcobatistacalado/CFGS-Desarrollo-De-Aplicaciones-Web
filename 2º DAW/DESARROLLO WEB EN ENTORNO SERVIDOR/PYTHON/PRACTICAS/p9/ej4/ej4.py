caracteres = ['"', '.', ';', ',', ':', '!', '?', '(', ')']

def palabraMax():
    with open("texto.txt", "r", encoding="utf-8") as f:
        array = []
        for linea in f.readlines():
            palabras = linea.split(" ")
            for palabra in palabras:
                #limpiar los caracteres especiales!!!!!
                if palabra and palabra[0] in caracteres:
                    palabra = palabra[1:]
                if palabra and palabra[-1] in caracteres:
                    palabra = palabra[:-1]
                array.append(palabra.lower())
        
        print("Palabras procesadas:", array)

        max_count = 1
        max_palabra = ""

        for palabra in array:
            if array.count(palabra) > max_count:
                max_palabra = palabra
                max_count = array.count(palabra)

        print(f"La palabra que más se repite es: '{max_palabra}' con {max_count} repeticiones.")
        print("La palabra que mas se repite es: "+max_palabra+" y se repite: "+max_count)
            
palabraMax()
