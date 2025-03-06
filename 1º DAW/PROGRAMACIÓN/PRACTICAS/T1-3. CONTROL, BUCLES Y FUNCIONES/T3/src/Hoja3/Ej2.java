package Hoja3;
import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce dos numeros:");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		if (n1 == n2) {
			System.out.println("No has introducido 2 numeros diferentes");
		}
		else {
			if (n1 > n2) {
				System.out.println("El numero mayor es: "+n1);
			}
			else {
				System.out.println("El numero mayor es:"+n2);
			}
		}
	}

}
