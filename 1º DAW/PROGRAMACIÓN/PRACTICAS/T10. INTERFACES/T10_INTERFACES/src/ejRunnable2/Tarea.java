package ejRunnable2;

public class Tarea implements Runnable {
	private int numeroTarea;

	public Tarea(int numeroTarea) {
		this.numeroTarea = numeroTarea;
	}

	@Override
	public void run() {
		// Esta es la tarea que se ejecutará en un hilo separado
		for (int i = 0; i < 10; i++) {
			System.out.println("Ejecutando tarea " + numeroTarea + "... " + i);
			try {
				Thread.sleep(1000); // Espera de 1 segundo.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
