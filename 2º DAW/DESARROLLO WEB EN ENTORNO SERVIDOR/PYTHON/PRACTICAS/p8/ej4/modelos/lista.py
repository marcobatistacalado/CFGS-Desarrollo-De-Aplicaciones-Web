class Lista:
    def __init__(self, lista):
        if isinstance(lista, list):
            self.lista = lista
        else:
            raise ValueError("El argumento debe ser una lista")

    # Redefinir el operador +
    def __add__(self, valor):
        if isinstance(valor, int):
            nueva_lista = [x + valor for x in self.lista]
            return Lista(nueva_lista)
        else:
            raise ValueError("El valor debe ser un número entero")

    # Redefinir el operador -
    def __sub__(self, valor):
        if isinstance(valor, int):
            nueva_lista = [x - valor for x in self.lista]
            return Lista(nueva_lista)
        else:
            raise ValueError("El valor debe ser un número entero")

    # Redefinir el operador *
    def __mul__(self, valor):
        if isinstance(valor, int):
            nueva_lista = [x * valor for x in self.lista]
            return Lista(nueva_lista)
        else:
            raise ValueError("El valor debe ser un número entero")

    # Redefinir el operador /
    def __truediv__(self, valor):
        if isinstance(valor, int):
            if valor == 0:
                raise ValueError("No se puede dividir entre cero")
            nueva_lista = [x / valor for x in self.lista]
            return Lista(nueva_lista)
        else:
            raise ValueError("El valor debe ser un número entero")

    # Método para mostrar la lista de forma legible
    def mostrar(self):
        print(self.lista)

