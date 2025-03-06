package matrices;

import java.util.Random;
import java.util.Scanner;

public class ej4bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nom;
		// ARRAY DE OBJETOS
		Jugador[] jugadores = new Jugador[10];
		int nJug;
		// VALIDAR NUMERO DE JUGADORES
		do {
			System.out.println("anota numero jugadores:");
			nJug = sc.nextInt();
		} while (nJug < 0 || nJug > 10);

		sc.nextLine();// LIMPIAR BUFFER

		for (int i = 0; i < nJug; i++) {
			// PEDIR NOMBRE
			System.out.println("Introduce nombre");
			nom = sc.nextLine();
			// CREAR OBJ JUGADOR EN UN ARRAY DE OBJETOS
			jugadores[i] = new Jugador(nom);
		}

		// MOSTRAR LOS CARTONES DE JUGADORES
		System.out.println("Jugadores Creados:");
		for (int i = 0; i < nJug; i++) {
			jugadores[i].mostrarCarton();
		}

		// COMIENZA EL AZAR - BINGO
		Random random = new Random();
		int maximo, minimo, azar = 0, linea = 0;
		minimo = 1;
		maximo = 80;
		
		//ARRAY DE FRECUENCIAS: ACCEDO DIRECTAMENTE PARA HACER COMPARACIONES, NO HAGO BUSQUEDAS PORQUE SE DONDE SE ENCUENTRA CADA NUMERO.
		int salientes[] = new int[80]; // array con todos los numeros vamos a rellenarlos:
		for (int i = 0; i < 80; i++) {
			salientes[i] = i + 1; // rellenar el array		
		}
		//no es necesario rellenarlo pq yo y se que el 0 = 1 y asi consecutivamente.

		while (azar != -1) {
			azar = random.nextInt(maximo - minimo + 1) + minimo;// NUMERO QUE VA SALIENDO
			if (salientes[azar - 1] == azar) { // solo si ese numero no ha sido usado
				salientes[azar - 1] = 0; // lo marcamos usado
				for (int i = 0; i < nJug; i++) { // X CADA JUGADOR
					if (jugadores[i].anotarBola(azar)) { // ANOTAMOS BOLA Y SI DEVUELVE VERDADERO --> OPTIMIZACION -->
															// YA SI VEMOS SI HAY LINEA O BINGO SINO NADA.
						if (linea == 0) {
							linea = jugadores[i].hayLinea(); // MIRAMOS SI HAY LINEA HASTA QUE YA SE HAYA CANTADO UNA
																// VEZ
						}
						if (jugadores[i].hayBingo()) { // Y MIRAMOS SI HAY BINGO //podriamos mirarlo con un contador a
														// partir de la sacada 20 porque hasta ahi es imposible tener
														// bingo.
							azar = -1;
							break;
						}
					}
				}
			}
		}

	}

}
