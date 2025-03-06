package ej6_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> alumnos = new HashMap<String, Integer>();
		String menu, nacionalidad;
		int cant;
		do {
			System.out.println("Menu:");
			menu = sc.nextLine();
			System.out.println("Introduce nacionalidad:");
			nacionalidad = sc.nextLine();
			cant = alumnos.get(nacionalidad);
			if (alumnos.get(nacionalidad) == null) { // Si la nacionalidad no está 
			    alumnos.put(nacionalidad, 1); // Agregamos la nacionalidad con un valor inicial de 1
			} else { // Si la nacionalidad ya está
			    alumnos.put(nacionalidad, cant + 1); // Incrementamos el valor existente en 1 y actualizamos el mapa
			}
		}while(!menu.equalsIgnoreCase("fin"));

		// Mostrar la información recopilada
		System.out.println("Nacionalidades de los alumnos y cantidad:");
		for (String nacion : alumnos.keySet()) { // Iterar sobre las claves del mapa
		    int cantidad = alumnos.get(nacion); // Obtener la cantidad de estudiantes para la nacionalidad actual
		    System.out.println(nacion + ": " + cantidad); // Mostrar la nacionalidad y su cantidad correspondiente
		}

	}

}
