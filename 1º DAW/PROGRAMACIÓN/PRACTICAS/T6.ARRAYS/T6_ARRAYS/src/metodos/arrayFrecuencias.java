package metodos;

import java.util.Scanner;

public class arrayFrecuencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] frecuencias = new int[5]; // Array para almacenar las frecuencias de los números del 1 al 5

		System.out.println("Ingresa 20 números entre 1 y 5:");

		for (int i = 0; i < 20; i++) {
			int numero = scanner.nextInt();

			// Verifica si el número está en el rango válido
			if (numero >= 1 && numero <= 5) {
				frecuencias[numero - 1]++; // Incrementa la frecuencia del número
			} else {
				System.out.println("Número fuera de rango. Introduce un número entre 1 y 5.");
				i--; // Disminuye el índice para repetir la entrada del número inválido
			}
		}

		// Muestra las frecuencias de cada número
		for (int i = 0; i < frecuencias.length; i++) {
			System.out.println("Número " + (i + 1) + ": " + frecuencias[i] + " veces");
		}

		scanner.close();
	}

}
