package Hoja2;

import java.util.Locale;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH); //PARA QUE NO TENGA PROBLEMAS CON LOS DECIMALES DICIENDOLE QUE EL '.' ES EL SEPARADOR
		System.out.println("Introduce el primer numero:");
		double num1 = entrada.nextDouble();
		System.out.println("Introduce el segundo numero:");
		double num2 = entrada.nextDouble();
		double suma=num1+num2;
		System.out.println(num1+" + "+num2+" = "+suma);
	}

}
