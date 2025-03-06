package Hoja2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		double longitud;
		final double pi = 3.1416;
		System.out.println("Introduce el radio:");
		int radio = entrada.nextInt();

		longitud=2*radio*pi;
		System.out.println("La longitud es: "+longitud);
		
	}

}
