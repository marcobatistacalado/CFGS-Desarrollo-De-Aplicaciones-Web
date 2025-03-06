# gestor.py
from tarea import Tarea

class GestorTareas:
    """
    Clase para gestionar una lista de tareas.
    
    :param tareas: Lista de tareas a gestionar.
    :type tareas: list
    """
    
    def __init__(self):
        """
        Inicializa el gestor de tareas con una lista vacía.
        """
        self.tareas = []

    def agregar_tarea(self, tarea):
        """
        Agrega una tarea a la lista de tareas.
        
        :param tarea: La tarea a agregar.
        :type tarea: Tarea
        """
        if isinstance(tarea, Tarea):
            self.tareas.append(tarea)

    def mostrar_tareas(self):
        """
        Muestra todas las tareas en la lista.
        
        :return: Lista de tareas con su estado.
        :rtype: list
        """
        return [str(tarea) for tarea in self.tareas]

    def completar_tarea(self, index):
        """
        Marca una tarea como completada dado su índice en la lista.
        
        :param index: El índice de la tarea a completar.
        :type index: int
        :return: True si la tarea fue completada, False si no existe.
        :rtype: bool
        """
        if 0 <= index < len(self.tareas):
            self.tareas[index].completar()
            return True
        return False
