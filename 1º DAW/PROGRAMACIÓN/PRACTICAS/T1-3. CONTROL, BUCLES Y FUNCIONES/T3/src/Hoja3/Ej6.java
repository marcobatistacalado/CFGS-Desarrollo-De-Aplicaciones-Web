package Hoja3;
import java.util.*;
public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el precio:");
		double precio = sc.nextInt();
		
		if (precio < 6) {
			System.out.println("No hay descuento");
		}
		else if (precio >= 6 && precio < 60) {
			precio = precio - ((precio*5)/100);
			System.out.println("Tienes un descuento del 5% y se queda en: "+precio+"€");
		}
		else if (precio >= 60 ) {
			precio = precio - ((precio*10)/100);
			System.out.println("Tienes un descuento del 10% y se queda en: "+precio+"€");
		}
	}
}
