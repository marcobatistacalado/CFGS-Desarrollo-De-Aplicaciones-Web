# tarea.py

class Tarea:
    """
    Representa una tarea dentro del sistema.
    
    :param descripcion: Descripción de la tarea.
    :type descripcion: str
    :param completada: Estado de la tarea (completada o no).
    :type completada: bool
    """
    
    def __init__(self, descripcion):
        """
        Inicializa una nueva tarea con la descripción proporcionada.

        :param descripcion: Descripción de la tarea.
        :type descripcion: str
        """
        self.descripcion = descripcion
        self.completada = False

    def completar(self):
        """
        Marca la tarea como completada.
        """
        self.completada = True

    def __str__(self):
        """
        Devuelve una representación en cadena de la tarea.
        
        :return: Descripción de la tarea y su estado.
        :rtype: str
        """
        return f"{self.descripcion} - {'Completada' if self.completada else 'Pendiente'}"
