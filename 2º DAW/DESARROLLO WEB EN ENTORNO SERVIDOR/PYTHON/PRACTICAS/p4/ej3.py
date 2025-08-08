lista1 = ["Hola", "que", "tal"]
cad = input("Introduce una cadena: ")

if cad in lista1:
    print("Apariciones: " + str(lista1.count(cad))) 
    cad_sustitucion = input("Introduce una cadena a sustituir: ")
    
    lista1[lista1.index(cad)] = cad_sustitucion  # Sustituir directamente
    print(f"La cadena '{cad}' ha sido sustituida por '{cad_sustitucion}' en la lista.")
    
    lista1.remove(cad)  # Elimina la cadena original
    print(f"La cadena '{cad}' ha sido eliminada de la lista.")
else:
    print("La cadena no está en la lista.")

# Mostrar el estado final de la lista
print("Estado final de la lista:", lista1)
