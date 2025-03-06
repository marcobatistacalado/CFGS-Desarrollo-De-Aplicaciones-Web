package t5strings;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce apellido");
		String apellido = sc.nextLine();
		
		System.out.println(nombreCod(nombre, apellido));
	}

	public static String nombreCod(String nombre, String apellido) {
		Scanner sc = new Scanner (System.in);
		String cod;
		int longApellido = apellido.length();
		if (longApellido<3) {
			System.out.println("Segundo apellido:");
			String apellido2 = sc.nextLine();
			int longApellido2 = apellido2.length();
			if (longApellido2 < 3) {
				if (longApellido>longApellido2) {
					cod = nombre.charAt(0)+apellido;
				}else {
					cod = nombre.charAt(0)+apellido2;
				}
			}else {
				cod = nombre.charAt(0)+apellido2.substring(0, 3);
			}
		}else {
			cod = nombre.charAt(0)+apellido.substring(0, 3);
		}
		return cod;
	}

}
