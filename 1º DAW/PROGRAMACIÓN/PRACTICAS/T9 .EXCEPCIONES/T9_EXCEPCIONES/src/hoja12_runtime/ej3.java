package hoja12_runtime;

import java.util.Random;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[5];
		int numerosSalientes[] = { 0, 0, 0, 0, 0 };
		rellenarArrayRandom(numeros);
		int pos,cont=0;
		while (cont!=5) {
			try {
				do {
					System.out.println("Anota posicion array:");
					pos = sc.nextInt();
					if (numerosSalientes[pos] != 1) {
						System.out.println("Numero: " + numeros[pos]); // aqui salta la excep
						numerosSalientes[pos] = 1;
						cont++;
					}
				} while (numeros[pos] == -1);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No existe esa posicion");
			}
		}

	}

	private static void rellenarArrayRandom(int[] numeros) {
		Random random = new Random();
		int minimo = 0, maximo = 10;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(maximo - minimo + 1) + minimo;
		}
	}

}
