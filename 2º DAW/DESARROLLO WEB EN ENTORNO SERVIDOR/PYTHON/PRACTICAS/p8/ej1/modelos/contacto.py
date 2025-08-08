class Contacto:

    def __init__(self, nombre, telefono, email):  # Constructor
        self.__nombre = nombre #atributos privados
        self.__telefono = telefono
        self.__email = email
    
    #GETTERS
    @property
    def nombre(self):
        return self.__nombre
    
    @property
    def telefono(self):
        return self.__telefono
    
    @property
    def email(self):
        return self.__email
    
    # SETTERS
    @telefono.setter
    def telefono(self, telefono):
        self.__telefono = telefono

    @email.setter
    def email(self, email):
        self.__email = email
        
    # Método especial __eq__
    def __eq__(self, other):
        return self.telefono == other.telefono

    def __str__(self):
        return f"Nombre: {self.nombre}, Teléfono: {self.telefono}, Email: {self.email}"
