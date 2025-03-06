package a_2022_Control_Inicial_Sentencias_Control;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);// poder leer numeros con decimales
		System.out.println("Introduce destino, Z/B:");
		char dest = sc.nextLine().charAt(0);
		System.out.println(dest);
		int precio = 0;

		if (dest != 'Z' && dest != 'B') {
			System.out.println("ERROR DESTINO INCORRECTO");
		} else {

			System.out.println("Introduce S/N cuentas con familia numerosa");
			char fam = sc.nextLine().charAt(0);
			System.out.println("Introduce edad");
			int edad = sc.nextInt();

			// PRECIO INICIAL POR DESTINO
			if (dest == 'Z') {
				precio = 40;
			} else {
				precio = 75;
			}

			// CALCULO DE DESCUENTOS
			if (edad < 14) {
				precio = precio - (precio * 50) / 100;
			} else if (edad >= 14 || edad < 18) {
				precio = precio - (precio * 20) / 100;
			} else if (edad > 65) {
				precio = precio - (precio * 30) / 100;
			}
			System.out.println("Introduce kilos equipaje:");
			int peso = sc.nextInt();
			if (peso > 20) {
				precio = (int) (precio + ((peso - 20) * 2.5));
			}
			
			//CALCULO HORAS --> EN OTRO DOC MEJOR.
		
			
			System.out.println("El precio final es: " + precio + "€");
		}
		
	}

}
