package Hoja6bis;

import java.util.*;

public class ej7 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		int num = 1, total = 0, divisible = 0;

		while (num!=0) {

			System.out.println("Introduce un numero:");

			num = sc.nextInt();

			

			for (int i=1; i<num; i++) {

				divisible = num%i;

				if (divisible == 0) {

					total = i + total;

				}

			}

			if (total == num) {

				System.out.println("NUMERO PERFECTO");

			}

		}

		

		

	}



}