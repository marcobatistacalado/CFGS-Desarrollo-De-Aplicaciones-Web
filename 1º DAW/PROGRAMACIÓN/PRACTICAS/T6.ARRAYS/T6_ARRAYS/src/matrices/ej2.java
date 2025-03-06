package matrices;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MISMO NUMERO FILAS Y COLUMNAS
		int dim;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Anota dimension matriz");
			dim = sc.nextInt();
		} while (dim < 1 || dim > 30);

		int matriz[][] = new int[dim][dim];

		for (int f = 0; f < dim; f++) {
			matriz[f][f] = 1;
		}

		for (int f = 0; f < dim; f++) {
			for (int c = 0; c < dim; c++) {
				System.out.print("\t" + matriz[f][c]);
			}
			System.out.println();
		}
	}

}
