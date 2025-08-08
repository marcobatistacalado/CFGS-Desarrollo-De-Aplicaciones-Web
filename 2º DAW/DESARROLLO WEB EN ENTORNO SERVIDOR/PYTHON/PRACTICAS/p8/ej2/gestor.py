from modelos.plazo_fijo import PlazoFijo
from modelos.cuenta_ahorro import CuentaAhorro

class GestorCuentas:
    def __init__(self):
        self.cuentas = []

    def añadir_cuenta(self, cuenta):
        self.cuentas.append(cuenta)
        print(f"Cuenta añadida: {cuenta.mostrar_informacion()}")

    def mostrar_todas_cuentas(self):
        if not self.cuentas:
            print("No hay cuentas registradas.")
        else:
            print("Información de todas las cuentas:")
            for cuenta in self.cuentas:
                print(cuenta.mostrar_informacion())

    def mostrar_cuentas_por_tipo(self, tipo):
        cuentas_tipo = [cuenta for cuenta in self.cuentas if isinstance(cuenta, tipo)]
        if not cuentas_tipo:
            print(f"No hay cuentas del tipo {tipo.__name__}.")
        else:
            print(f"Información de cuentas del tipo {tipo.__name__}:")
            for cuenta in cuentas_tipo:
                print(cuenta.mostrar_informacion())

    def buscar_cuentas_por_titular(self, titular):
        cuentas_titular = [cuenta for cuenta in self.cuentas if titular.lower() in f"{cuenta.nombre} {cuenta.apellidos}".lower()]
        if not cuentas_titular:
            print(f"No se encontraron cuentas para el titular {titular}.")
        else:
            print(f"Cuentas para el titular {titular}:")
            for cuenta in cuentas_titular:
                print(cuenta.mostrar_informacion())

    def calcular_interes_por_id(self, id_cuenta):
        for cuenta in self.cuentas:
            if cuenta.id == id_cuenta and isinstance(cuenta, PlazoFijo):
                interes = cuenta.calcular_interes()
                print(f"El interés de la cuenta con ID {id_cuenta} es: {interes}")
                return
        print(f"No se encontró una cuenta de tipo Plazo Fijo con el ID {id_cuenta}.")
