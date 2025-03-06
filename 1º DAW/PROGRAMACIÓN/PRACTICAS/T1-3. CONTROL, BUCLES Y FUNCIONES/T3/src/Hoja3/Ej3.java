package Hoja3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce dos numeros:");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
			if (n1 > n2 || n1 == n2) {
				System.out.println(n1 + " -- " + n2);
			}
			else if (n1 < n2){
				System.out.println(n2+ " -- " + n1);
			}
		
		
	}

}
