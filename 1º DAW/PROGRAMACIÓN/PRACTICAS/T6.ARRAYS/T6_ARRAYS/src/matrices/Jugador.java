package matrices;

import java.util.Arrays;
import java.util.Random;

public class Jugador {
	private String nombre;
	private int carton[][];

	public Jugador(String nombre) {
		this.nombre = nombre;
		Random random = new Random();
		int minimo = 1;
		int maximo = 20;
		int numero;
		carton = new int[4][5];
		for (int f = 0; f < carton.length; f++) {
			for (int c = 0; c < 5; c++) {
				numero = random.nextInt(maximo - minimo + 1) + minimo;
				if (existeNum(numero, f, c)) {
					c--;
				} else {
					carton[f][c] = numero;
				}
			}
			Arrays.sort(carton[f]);// IMPORTANTE PARA ORDENAR YA QUE SE PUEDE PORQUE ES INT
			minimo += 20;
			maximo += 20;
		}
	}

	public boolean existeNum(int numero, int f, int c) {
		for (int i = 0; i < c; i++) {
			if (carton[f][i] == numero) {
				return true;
			}
		}
		return false;
	}

	public int[][] getCarton() {
		return carton;
	}

	public void mostrarCarton() {
		System.out.println("--------------------" + nombre + "--------------------");
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 5; c++) {
				System.out.print("\t" + carton[f][c]);
			}
			System.out.println();
		}
	}

	public String getNombre() {
		return nombre;
	}

	// /20 modulo%20
	public boolean anotarBola(int num) {
		// VAMOS A OPTIMIZARLO BIEN
		// DIVIDIENDO ENTRE 20 SABEMOS LA FILA
		int f = num / 20;
		if (num % 20 == 0) { // pero claro los limites de cada fila nos dan la siguiente fila por lo que hay
								// que restarles 1.
			f--;
		}
		for (int c = 0; c < 5; c++) {
			if (carton[f][c] == num) {
				carton[f][c] = 0;
				return true; // OPTIMIZAR EN MAIN SOLO CALCULAMOS LINEA Y BINGO SI DEVUELVE TRUE.
			}

		}

		return false;

		//sin optimizar
		/*for (int f=0; f<4; f++) {
			for (int c=0; c<5;c++) {
				if (carton[f][c] == num) {
					carton[f][c] = 0;
					return true; //OPTIMIZAR EN MAIN SOLO CALCULAMOS LINEA Y BINGO SI DEVUELVE TRUE.
				}
			}
		}
		return false;
		*/
	}

	public int hayLinea() {
		for (int f = 0; f < 4; f++) {
			int cont = 0;
			for (int c = 0; c < 5; c++) {
				if (carton[f][c] == 0) {
					cont++;
				}
			}
			if (cont == 5) {
				System.out.println("LINEA: " + nombre);
				return 1;
			}
		}
		return 0;
	}

	public boolean hayBingo() {
		int cont = 0;
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 5; c++) {
				if (carton[f][c] == 0) {
					cont++;
				}
			}
		}
		if (cont == 20) {
			System.out.println("BINGO: " + nombre);
			return true;
		}
		return false;
	}

}
