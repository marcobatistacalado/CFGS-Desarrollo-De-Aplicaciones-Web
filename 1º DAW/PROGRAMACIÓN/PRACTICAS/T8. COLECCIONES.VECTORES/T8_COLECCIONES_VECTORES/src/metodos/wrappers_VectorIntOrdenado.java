package metodos;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author administrador
 */
public class wrappers_VectorIntOrdenado {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		int numero = -1;
		Scanner sc = new Scanner(System.in);
		// System.out.println("El mÃ¡ximo entero es:"+Integer.MAX_VALUE);

		Vector<Integer> numeros;

		// Leo números hasta el 0 y los guardo en el vector
		numeros = new Vector();

		while (numero != 0) {
			System.out.println("Anota número:");
			numero = sc.nextInt();
			if (numero == 0)
				break;
			// Inserto el número de forma ordenada
			int i = 0;
			for (; i < numeros.size(); i++) {
				if (numeros.get(i) > numero) {

					break;
				}
			}
			numeros.add(i, numero);

		}

		System.out.println(numeros);

		System.out.println("Anota número que quieres buscar:");
		numero = sc.nextInt();

		int pos = numeros.indexOf(numero); //Integer ya tiene un metodo equals. Que hace bien la comparacion.
		if (pos == -1)
			System.out.println("No encontrado");

		else {
			System.out.println("Encontrado en " + pos);
		}

		System.out.println("Anota número a borrar:");
		numero = sc.nextInt();

		Integer borrado = numeros.remove(numero);

		boolean encontrado = false;
		for (int i = 0; i < numeros.size(); i++) {
			// if (numeros.get(i).compareTo(new Integer(numero))==0)
			if (numeros.get(i) == numero) {
				System.out.println("Encontrado en la posicion:" + i);
				encontrado = true;
				break;
			}
		}

		if (encontrado == false)
			System.out.println("Número no encontrado");

	}

}
