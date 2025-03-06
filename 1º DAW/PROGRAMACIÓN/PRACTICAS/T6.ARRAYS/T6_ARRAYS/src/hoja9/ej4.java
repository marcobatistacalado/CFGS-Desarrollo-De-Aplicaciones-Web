package hoja9;
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String nombres[] = new String [5];
		
		for (int i = 0; i<5; i++) {
			System.out.println("Nombre: ");
			nombres [i] = sc.nextLine();
		}
		Arrays.sort(nombres);
		System.out.println(Arrays.toString(nombres));
		System.out.println("Nombre:");
		String nombre = sc.nextLine();
		if (Arrays.binarySearch(nombres, nombre)>0){
			System.out.println("Se encontro");
		}else {
			System.out.println("No se encontro");
		}
	}


}
