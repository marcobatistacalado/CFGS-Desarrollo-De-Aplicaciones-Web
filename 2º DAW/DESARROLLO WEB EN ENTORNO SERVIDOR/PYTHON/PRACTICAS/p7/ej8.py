saludos = ['hola', 'hello', 'hi']
nombres = ['ana', 'antonio', 'bea']

lista = [(x, y) for x in saludos for y in nombres]

print(lista)