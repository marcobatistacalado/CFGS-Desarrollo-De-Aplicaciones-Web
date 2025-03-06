package hoja9;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Numero de veces");
		int cant = sc.nextInt();
		int numeros[]= new int [cant];
		int contador = 0;
		
		for (int i = 0; i<cant; i++) {
			System.out.println("Numero:");
			numeros[i] = sc.nextInt();
		}
		int longitud = numeros.length;
		int numeromax = numeros[longitud-1];
		for (int i = 0; i<cant; i++) { 
			if(numeromax == numeros[i]) {
				contador++;
			}
		}
		System.out.println("Numero de veces que se repite el maximo: "+contador);
		
		
	}

}
