package Hoja6bis;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("Introduce el precio:");
			int precio = sc.nextInt();
			System.out.println("Introduce dinero recibido: ");
			int recibido = sc.nextInt();
			precio = recibido - precio;
			if (precio / 50 > 0) {
				System.out.println("BILLETES DE 50: "+precio/50);
				precio = precio % 50;
				
			}
			if (precio / 20 > 0) {
				System.out.println("BILLETES DE 20: "+precio/20);
				precio = precio % 20;
				
			}
			if (precio / 10 > 0) {
				System.out.println("BILLETES DE 10: "+precio/10);
				precio = precio % 10;
				
			}
			if (precio / 5 > 0) {
				System.out.println("BILLETES DE 5: "+precio/5);
				precio = precio % 5;
				
			}
			if (precio / 2 > 0) {
				System.out.println("MONEDAS DE 2: "+precio/2);
				precio = precio % 2;
				
			}
			if (precio / 1 > 0) {
				System.out.println("MONEDAS DE 1: "+precio/1);
				precio = precio % 1;
				
			}
			
		}
	}

}
