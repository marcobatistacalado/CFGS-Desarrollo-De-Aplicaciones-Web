import funciones.utilidades as ut

print("APARTADO 1--------------------------------------")
lista_salas = ut.get_datos()
print(lista_salas)

print()
print("APARTADO 2--------------------------------------")
dicc_charlas_aforo = ut.get_charlas_aforo(lista_salas, 20)
for clave, valor in dicc_charlas_aforo.items():
    print(str(clave)+": "+str(valor))


print()
print("APARTADO 3--------------------------------------")
print(ut.venta_entradas("Realidad Virtual y Aumentada",10,lista_salas))

print()
print("APARTADO 4--------------------------------------")
ut.genera_csv(lista_salas, 'assets/salas_resumen.csv')