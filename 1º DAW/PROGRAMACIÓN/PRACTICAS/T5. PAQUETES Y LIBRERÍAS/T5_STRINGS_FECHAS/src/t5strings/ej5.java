package t5strings;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce cadena");
		String cadena1 = sc.nextLine();
		int cad1 = cadena1.toUpperCase().charAt(0);
		
		System.out.println("Introduce cadena");
		String cadena2 = sc.nextLine();
		int cad2 = cadena2.toUpperCase().charAt(0);
		
		System.out.println("Introduce cadena");
		String cadena3 = sc.nextLine();
		int cad3 = cadena3.toUpperCase().charAt(0);
		
		if (cad1<cad2 && cad1<cad3) {
			//cadena 1 menor
			System.out.println(cadena1);
			if (cad2<cad3) {
				System.out.println(cadena2);
				System.out.println(cadena3);
			}else {
				System.out.println(cadena3);
				System.out.println(cadena2);
			}
		}
		
		if (cad2<cad1 && cad2<cad3) {
			//cadena 2 menor
			System.out.println(cadena2);
			if (cad1<cad3) {
				System.out.println(cadena1);
				System.out.println(cadena3);
			}else {
				System.out.println(cadena3);
				System.out.println(cadena1);
			}
		}
		
		if (cad3<cad2 && cad3<cad1) {
			//cadena 3 menor
			System.out.println(cadena3);
			if (cad2<cad1) {
				System.out.println(cadena2);
				System.out.println(cadena1);
			}else {
				System.out.println(cadena1);
				System.out.println(cadena2);
			}
		}
		
	}

}
