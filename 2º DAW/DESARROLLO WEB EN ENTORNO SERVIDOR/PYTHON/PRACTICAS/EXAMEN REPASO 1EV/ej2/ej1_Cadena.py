# La cadena de texto proporcionada
directorio = """
nif;nombre;email;teléfono;descuento
01234567;Luis González;luisgonzalez@mail.com;656343576;12.5
71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2
98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7
"""

# Dividimos el texto en líneas
lineas = directorio.strip().split('\n')

# La primera línea contiene los nombres de los campos
campos = lineas[0].split(';')

# Creamos el diccionario de clientes
clientes = {}

# Iteramos sobre las líneas restantes
for linea in lineas[1:]:
    datos = linea.split(';')
    nif = datos[0]  # El NIF es la primera columna
    cliente_info = {
        campos[1]: datos[1],  # Nombre
        campos[2]: datos[2],  # Email
        campos[3]: datos[3],  # Teléfono
        campos[4]: float(datos[4])  # Descuento, convertido a float
    }
    clientes[nif] = cliente_info

# Imprimimos el diccionario de clientes
for nif, info in clientes.items():
    print(f"'{nif}': {info}")
