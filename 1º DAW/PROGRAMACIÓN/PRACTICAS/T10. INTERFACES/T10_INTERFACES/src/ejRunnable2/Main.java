package ejRunnable2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario cuántas tareas desea ejecutar a la vez
		System.out.println("Ingrese el número de tareas a ejecutar:");
		int numTareas = sc.nextInt();
		sc.nextLine(); // Consumir el salto de línea después de nextInt()

		// Crear un vector de tareas del tamaño especificado por el usuario
		Tarea[] tareas = new Tarea[numTareas];

		// Inicializar las tareas en el vector
		for (int i = 0; i < numTareas; i++) {
			tareas[i] = new Tarea(i + 1);
		}

		// Crear un hilo para cada tarea y comenzar su ejecución
		Thread[] hilos = new Thread[numTareas];
		for (int i = 0; i < numTareas; i++) {
			hilos[i] = new Thread(tareas[i]);
			hilos[i].start();
		}

		// Esperar a que todos los hilos terminen
		for (Thread hilo : hilos) {
			try {
				hilo.join(); // Esperar a que el hilo termine
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Una vez que todos los hilos terminan, continuamos con el flujo del programa
		System.out.println("Tareas completadas.");

		sc.close(); // Cerrar el scanner
	}
}
