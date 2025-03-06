package hoja8;
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int altura, ancho;
		char caracter;
		System.out.println("Introduce caracter:");
		caracter = sc.nextLine().charAt(0);
		do {
			System.out.println("Introduce altura: ");
			altura = sc.nextInt();
			System.out.println("Inroduce anchura:");
			ancho = sc.nextInt();
		}while (altura<0 || ancho<0);
		Etiqueta etiqueta1 = new Etiqueta (altura,ancho, caracter);
		etiqueta1.mostrar();
		
		//cambiar caracter
		System.out.println("Introduce caracter:");
		sc.nextLine();
		caracter = sc.nextLine().charAt(0);
		etiqueta1.setCar(caracter);
		etiqueta1.mostrar();
	}

}
