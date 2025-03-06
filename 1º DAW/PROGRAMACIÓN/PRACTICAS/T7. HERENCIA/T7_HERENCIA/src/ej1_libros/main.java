package ej1_libros;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libros[] = new Libro[2]; //tiene que ser de la clase padre.
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); //para poder leer los puntos en double.
		
		String titulo, editorial, autor, curso;
		double precio, desc;
		int tipo;
		for (int i = 0; i<libros.length; i++) {
			System.out.println("Introduce nombre libro:");
			titulo = sc.nextLine();
			System.out.println("Introduce Editorial: ");
			editorial = sc.nextLine();
			System.out.println("Introduce Autor:");
			autor = sc.nextLine();
			System.out.println("Anota precio: ");
			precio = sc.nextDouble();
			System.out.println("Anota tipo libro (1-normal; 2-texto)");
			tipo = sc.nextInt();
			if (tipo == 1) {
				libros[i] = new Libro (titulo, editorial, autor, precio);
			}else {
				sc.nextLine();
				System.out.println("Anota Curso:");
				curso = sc.nextLine();
				System.out.println("Anota Descuento: ");
				desc = sc.nextDouble();
				libros[i] = new Texto (titulo, editorial, autor, precio, curso, desc); //importante el orden
			}
			sc.nextLine();
		}
		
		for (int i = 0; i< libros.length; i++) {
			//YA SABE SI TIENE QUE IR A LIRBO O TEXTO PQ LO TIENE MARCADO
			System.out.println(libros[i].toString());
		}
		
		System.out.println("Introduce precio maximo: ");
		double max = sc.nextDouble();
		for (int i = 0; i< libros.length; i++) {
			//YA SABE SI TIENE QUE IR A LIRBO O TEXTO PQ LO TIENE MARCADO
			if (libros[i].getPrecio()<max) { //este metodo es padre, 
				//asiq ue cuando encuentre un hijo y no vea ese metodo buscará en el padre
				System.out.println(libros[i].toString());
			}
			
		}
		
	}

}
