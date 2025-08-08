from modelos.cuenta import Cuenta

class CuentaAhorro(Cuenta):
    def __init__(self, nombre, apellidos, saldo):
        super().__init__(nombre, apellidos, saldo)
        self.id += f"AH{Cuenta.contador_cuentas}"  # Añade AH y el número de cuenta

    def mostrar_informacion(self):
        return super().mostrar_informacion()
