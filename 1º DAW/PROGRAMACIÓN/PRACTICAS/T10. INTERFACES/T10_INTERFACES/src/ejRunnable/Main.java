package ejRunnable;

public class Main {

    public static void main(String[] args) {
        // Creamos una instancia de la clase que implementa Runnable
        Tarea1 tarea = new Tarea1();
        Tarea2 tarea2 = new Tarea2(); // Creamos una instancia de Tarea2

        // Creamos un hilo y le pasamos la instancia de la tarea
        Thread hilo = new Thread(tarea);
        Thread hilo2 = new Thread(tarea2); // Creamos un segundo hilo con Tarea2

        // Iniciamos los hilos
        hilo.start();
        hilo2.start();

        for (int i = 0; i < 10; i++) {
			System.out.println("MAIN... " + i);
			try {
				Thread.sleep(1000); // Espera de 1 segundo
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
        // El programa continúa ejecutándose mientras los hilos estén en marcha
        // Hacemos una pausa en el hilo principal para esperar la finalización de los hilos secundarios
        try {
            hilo.join(); // Espera hasta que el primer hilo termine
            hilo2.join(); // Espera hasta que el segundo hilo termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Una vez que los hilos terminan, continuamos con el flujo del programa
        System.out.println("Tareas completadas.");
    }
}
