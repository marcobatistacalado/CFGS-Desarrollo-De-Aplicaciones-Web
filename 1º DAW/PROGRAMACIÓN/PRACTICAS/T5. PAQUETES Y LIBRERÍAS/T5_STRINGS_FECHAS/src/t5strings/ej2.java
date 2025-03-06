package t5strings;
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		char letra;
		String seguir = null, ciudad;
		int contador = 0;
		
		System.out.println("Anota una letra:");
		letra = sc.nextLine().charAt(0);
		
		do {
			System.out.println("Ciudad:");
			ciudad = sc.nextLine();
			ciudad = ciudad.toUpperCase();
			if (ciudad.charAt(0)==letra) {
				contador++;
			}
			System.out.println("¿otra ciudad? S/N");
			seguir = sc.nextLine();
		}while(seguir.equalsIgnoreCase("S"));
	}

}
