package ej7_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> conj1 = new HashSet<Integer>();
		HashSet<Integer> conj2 = new HashSet<Integer>();

		int num;
		do {
			System.out.println("Numero:");
			num = sc.nextInt();
			if (num != 0) {
				conj1.add(num);
			}
		} while (num != 0);
		num = -1;
		System.out.println("Conjunto2:");
		do {
			System.out.println("Numero:");
			num = sc.nextInt();
			if (num != 0) {
				conj2.add(num);
			}
		} while (num != 0);
		System.out.println(conj1);
		System.out.println(conj2);
		if (conj1.containsAll(conj2)) {
			System.out.println("El conjunto 2 está includio en el conjunto 1.");
		}else {
			System.out.println("El conjunto 2 no está incluido en el conjunto 1.");
			if (conj2.containsAll(conj1)) {
				System.out.println("El conjunto 1 está includio en el conjunto 2.");
			}else {
				System.out.println("El conjunto 1 no está incluido en el conjunto 2.");
			}
		}
		
		System.out.println("OTRA FORMA DE CONTENER ");
		if (contieneOtro(conj1, conj2)) {
			System.out.println("El conjunto 2 está includio en el conjunto 1.");
		}else {
			System.out.println("El conjunto 2 NO está includio en el conjunto 1.");
			if (contieneOtro(conj2, conj1)) {
				System.out.println("El conjunto 1 está includio en el conjunto 2.");
			}else {
				System.out.println("El conjunto 1 NO está includio en el conjunto 2.");
			}
		}
		
		
		
	}

	public static boolean contieneOtro(HashSet<Integer> conj1, HashSet<Integer> conj2) {
		//SI NO QUISIESEMOS HACERLO CON CONTAINSALL TENDRIAMOS QUE RECORRERLO CON UN FOR-EACH Y PREGUNTAR CON EL VALUE.
		int cont=0;
		for (Integer i : conj2) {
			if (!conj1.contains(i)) {
				return false;
			}
		}
		return true;
	}

}
