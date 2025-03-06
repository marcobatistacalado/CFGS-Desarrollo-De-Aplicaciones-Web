package t5strings;
import java.util.*;
public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce cadena:");
		String cad = sc.nextLine();
		System.out.println("Introduce un caracter:");
		char car = sc.nextLine().charAt(0);
		
		int letrasencontradas=numletrasEncontradas(cad,car);
		if (letrasencontradas==0) {
			System.out.println("no se encontro ninguna coincidencia");
		}else {
			System.out.println("Letras encontradas: "+letrasencontradas);
		}
		
		
	}
	public static int numletrasEncontradas(String cad, char car) {
		int longitud = cad.length();
		int contador = 0;
		for (int i=0;i<=longitud-1;i++) {
			if (cad.charAt(i)==car) {
				contador++;
			}
		}
		return contador;
	}

}
