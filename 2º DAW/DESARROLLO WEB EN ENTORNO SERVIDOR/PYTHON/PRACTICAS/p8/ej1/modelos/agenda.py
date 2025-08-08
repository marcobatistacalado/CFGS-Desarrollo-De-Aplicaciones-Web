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
        valor = valor.lower()  # Convertimos el valor a minúsculas para comparar de forma insensible a mayúsculas/minúsculas
        if criterio == "nombre":
            for c in self.contactos:
                if c.nombre.lower() == valor:
                    lista.append(c)
        elif criterio == "telefono":
            for c in self.contactos:
                if c.telefono == valor:  # Los teléfonos son números o cadenas que no deben ser comparados con `.lower()`
                    lista.append(c)
        elif criterio == "email":
            for c in self.contactos:
                if c.email.lower() == valor:
                    lista.append(c)
        return lista
    
    def eliminar_contacto(self, telefono):
        contactos_filtrados = list(filter(lambda c: c.telefono != telefono, self.contactos))
        if len(contactos_filtrados) < len(self.contactos):  # Si se eliminó algo, las listas tendrán tamaños distintos
            self.contactos = contactos_filtrados
            print(f"Contacto eliminado con teléfono: {telefono}")
        else:
            print("No se encontró ningún contacto con ese teléfono.")
    
    def __str__(self):
        return "\n".join([str(c) for c in self.contactos]) if self.contactos else "No hay contactos en la agenda."
