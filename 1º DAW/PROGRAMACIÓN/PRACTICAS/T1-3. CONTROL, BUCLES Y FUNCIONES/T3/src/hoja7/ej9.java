package hoja7;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		int num=1;

		while (num!=0) {

			System.out.println("Introduce un numero:");

			num = sc.nextInt();

			piramide(num);

			
		}

		

		

	}

	private static void piramide(int num) {
		for (int i = num; i>0; i--) {

			for (int b=i; b>0; b--) {

				System.out.print(i);

			}
			System.out.println();

		}
	}

}
