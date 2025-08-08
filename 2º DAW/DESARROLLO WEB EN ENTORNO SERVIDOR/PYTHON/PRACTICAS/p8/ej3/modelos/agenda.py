class Agenda:
    def __init__(self):  # Constructor
        self.contactos = []

    def añadir_contacto(self, contacto):
        if contacto not in self.contactos:
            self.contactos.append(contacto)
            print(f"Contacto añadido: {contacto}")
        else:
            print("El contacto ya existe en la agenda.")

    def buscar_contacto(self, criterio, valor):
        lista = []
        if criterio == "nombre":
            lista = [c for c in self.contactos if c.nombre.lower() == valor.lower()]
        elif criterio == "telefono":
            lista = [c for c in self.contactos if c.telefono == valor]
        elif criterio == "email":
            lista = [c for c in self.contactos if c.email.lower() == valor.lower()]
        return lista

    def eliminar_contacto(self, telefono):
        self.contactos = list(filter(lambda c: c.telefono != telefono, self.contactos))
        print(f"Contacto eliminado con teléfono: {telefono}")

    def transformar_a_diccionario(self):
        """
        Transforma la lista de contactos en un diccionario donde las claves son los nombres.
        Si hay contactos con el mismo nombre, solo se conservará el último.
        """
        return {c.nombre: c for c in self.contactos}

    def __str__(self):
        return "\n".join([str(c) for c in self.contactos]) if self.contactos else "No hay contactos en la agenda."