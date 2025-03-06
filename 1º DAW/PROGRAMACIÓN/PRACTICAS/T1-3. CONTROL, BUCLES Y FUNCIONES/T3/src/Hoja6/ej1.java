package Hoja6;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		char letra = ' ';
		System.out.println("Introduce una letra");
		letra = sc.nextLine().charAt(0);
		int num = 1;
		
		if (letra == ' ') {
			System.out.println("No has introducido un caracter valido");
		}else {
			
		
			for (int i = 1; i<=5; i++) {
				System.out.println("Introduce una letra");
				char letra2 = sc.nextLine().charAt(0);
				if (letra2 == letra) {
					num = num + 1;
				}
			}
		System.out.println("El nuemero de veces que se repite es: "+num);
		}
		
	}

}
