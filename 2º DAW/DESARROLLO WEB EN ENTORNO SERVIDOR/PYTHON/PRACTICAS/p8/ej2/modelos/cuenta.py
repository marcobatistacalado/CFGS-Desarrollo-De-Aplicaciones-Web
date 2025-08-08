class Cuenta:
    contador_cuentas = 0  # Variable de clase para el número de cuentas creadas

    def __init__(self, nombre, apellidos, saldo):
        self.nombre = nombre
        self.apellidos = apellidos
        self.saldo = saldo
        Cuenta.contador_cuentas += 1  # Incrementa el contador de cuentas
        self.id = self.generar_identificador()

    def generar_identificador(self):
        nombre_inicial = self.nombre[:2].upper()  # Dos primeras letras del nombre
        apellido_final = self.apellidos.split()[-1][-2:].upper()  # Dos últimas letras del último apellido
        return f"{nombre_inicial}{apellido_final}"

    def mostrar_informacion(self):
        return f"Titular: {self.nombre} {self.apellidos}, Saldo: {self.saldo}, ID: {self.id}"
