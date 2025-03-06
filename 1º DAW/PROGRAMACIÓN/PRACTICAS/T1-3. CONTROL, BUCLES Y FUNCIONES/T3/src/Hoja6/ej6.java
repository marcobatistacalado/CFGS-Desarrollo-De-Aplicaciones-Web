package Hoja6;
import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i=1, total = 0;
		while (i!=0) {
			System.out.println("Introduce la edad: ");
			int edad = sc.nextInt();
			int precio = 25;
			if (edad < 7 || edad > 65) {
				precio = 16;
			}
			if (edad > 18) {
				System.out.println("Introduce 'S' ticket actuacion");
				sc.nextLine();
				int act = sc.nextLine().charAt(0);
				if (act == 'S') {
					precio = precio + 3;
				}
			}
			total = total + precio;
			System.out.println("Introduce 0 si quieres acabar el programa:");
			i = sc.nextInt();
		}
		System.out.println("Precio total recaudado: "+total);
		
	}

}
