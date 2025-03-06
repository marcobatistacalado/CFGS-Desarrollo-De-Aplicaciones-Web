package Hoja3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tres numeros:");
		int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("No has introducido 3 numeros diferentes");
		}
		else {
			if (n1 > n2) {
				if (n1 > n3) {
					System.out.println("El numero mayor es n1: "+n1);
				}
				else {
					System.out.println("El numero mayor es n3: "+n3);
				}
			}
			else{
				if (n2 > n3) {
					System.out.println("El numero mayor es n2: "+n2);
				}
				else {
					System.out.println("El numero mayor es n3: "+n3);
				}
			}
		}
	}

}