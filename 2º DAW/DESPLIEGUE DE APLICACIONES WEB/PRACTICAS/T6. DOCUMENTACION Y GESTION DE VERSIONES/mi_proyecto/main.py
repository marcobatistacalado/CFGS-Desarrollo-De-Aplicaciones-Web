# main.py
from gestor import GestorTareas
from tarea import Tarea

def main():
    """
    Función principal que gestiona las tareas y las muestra al usuario.
    """
    gestor = GestorTareas()
    
    tarea1 = Tarea("Comprar leche")
    tarea2 = Tarea("Estudiar Python")
    
    gestor.agregar_tarea(tarea1)
    gestor.agregar_tarea(tarea2)
    
    print("Tareas Pendientes:")
    for tarea in gestor.mostrar_tareas():
        print(tarea)
    
    # Completar una tarea
    gestor.completar_tarea(0)

    print("\nTareas Después de Completar la Primera:")
    for tarea in gestor.mostrar_tareas():
        print(tarea)

if __name__ == "__main__":
    main()
