package hoja7;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		char dia = validarDia();
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Precio total:"+calcularCine(dia,edad));
	}
	public static double calcularCine(char dia, int edad) {
		double precio = 5;
		if (dia == 'M' && edad > 65) {
			precio = precio/2;
		}
		if (dia == 'X') {
			precio = precio - (precio * 0.2);
		}
		if (edad < 18 && (dia == 'S' || dia == 'D' )) {
			precio = precio - (precio * 0.15);
		}
		return precio;
	}
	public static char validarDia() {
		Scanner sc = new Scanner (System.in);
		char dia;
		do {
			System.out.println("Introduce día semana:");
			dia = sc.nextLine().charAt(0);
			dia = Character.toUpperCase(dia);
		}while (dia != 'L' && dia != 'M' && dia != 'X' && dia != 'J' && dia != 'V' && dia != 'S' && dia != 'D');
		return dia;
	}

}
