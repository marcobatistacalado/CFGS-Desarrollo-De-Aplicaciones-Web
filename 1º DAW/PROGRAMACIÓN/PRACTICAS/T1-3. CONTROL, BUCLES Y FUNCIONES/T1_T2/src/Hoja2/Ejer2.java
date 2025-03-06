package Hoja2;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad:");
		int edad= entrada.nextInt();
		System.out.println("MI EDAD:"+edad);
		edad++;
		//edad+=1;
		System.out.println("MI EDAD EL PRÓXIMO ANYO:"+edad);
	}

}
