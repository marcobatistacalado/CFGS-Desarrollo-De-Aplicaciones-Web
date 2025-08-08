from modelos.cuenta import Cuenta

class PlazoFijo(Cuenta):
    def __init__(self, nombre, apellidos, saldo, plazo, interes):
        super().__init__(nombre, apellidos, saldo)
        self.plazo = plazo
        self.interes = interes
        self.id += f"FJ{Cuenta.contador_cuentas}"  # Añade FJ y el número de cuenta

    def calcular_interes(self):
        return self.saldo * self.interes / 100

    def mostrar_informacion(self):
        base_info = super().mostrar_informacion()
        return f"{base_info}, Plazo: {self.plazo} meses, Interés: {self.interes}%"
