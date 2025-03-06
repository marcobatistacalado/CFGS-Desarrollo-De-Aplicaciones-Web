package ej5_HashMap;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); // leer double
		//Vector<Alumno> alumnos = new Vector<Alumno>();
		HashMap<String, Double> alumnos = new HashMap<>();
		int menu = 0, pos;
		double nota;
		String nombre;

		do {
			System.out.println("Menu:");
			System.out.println("1)Alta metodo for");
			System.out.println("7)Alta metodo nuevo arrays");
			System.out.println("2)Modificar nota");
			System.out.println("3)Sustituir");
			System.out.println("4)Borrar alumno");
			System.out.println("5)Mostrar alumnos");
			System.out.println("6)Salir");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				sc.nextLine();
				System.out.println("Introduce nombre alumno: ");
				nombre = sc.nextLine();
				//if (buscarAlumno(alumnos, nombre) != -1) {
				if (alumnos.containsKey(nombre)) {
					System.out.println("Alumno ya existe");
				} else {
					System.out.println("Introduce nota:");
					nota = sc.nextDouble();
					//alumnos.add(new Alumno(nombre, nota));
					alumnos.put(nombre, nota);
				}
				break;
				
			case 2:
				sc.nextLine();
				System.out.println("Nombre alumno a modificar nota: ");
				nombre = sc.nextLine();
				/*pos = alumnos.indexOf(new Alumno(nombre));
				if (pos == -1) {*/
				if (alumnos.containsKey(nombre)) {
					System.out.println("Alumno no existe");
				} else {
					System.out.println("Nota: ");
					nota = sc.nextDouble();
					//alumnos.get(pos).setNota(nota);
					alumnos.put(nombre,nota);
					System.out.println("Nota actualizada");
				}

				break;
			case 3:
				sc.nextLine();
				System.out.println("Nombre alumno a borrar por otro: ");
				String nombre2 = sc.nextLine();
				/*pos = alumnos.indexOf(nombre2);
				if (pos == -1) {*/
				if (!alumnos.containsKey(nombre2)) {
					System.out.println("Alumno no existe");
				} else {
					System.out.println("Introduce nombre del nuevo alumno: ");
					nombre = sc.nextLine();
					//*if (alumnos.indexOf(new Alumno(nombre)) != -1) { // INDEXOF --> clase que obtiene con un equals que
																		// he redefinido en alumno.
					if (alumnos.containsKey(nombre)) {	
						System.out.println("Alumno ya existe");
					} else {
						System.out.println("Introduce nota: ");
						nota = sc.nextDouble();
						alumnos.put(nombre,nota);
						alumnos.remove(nombre2);
						System.out.println("Alumno cambiado");
					}
				}
				break;
			case 4:
				sc.nextLine();
				System.out.println("Nombre alumno a borrar: ");
				nombre = sc.nextLine();
				//pos = alumnos.indexOf(nombre);
				//if (pos == -1) {
				if (!alumnos.containsKey(nombre)) {
					System.out.println("Alumno no existe");
				} else {
					alumnos.remove(nombre);
					System.out.println("Alumno borrado");
				}
				break;
			case 5:
				//System.out.println(alumnos);
				for (String i: alumnos.keySet()) {
					System.out.println("Alumno: "+ i + " nota: " + alumnos.get(i));
				}
				break;
			}
		} while (menu != 6);

	}

	// METODO BUSCAR COMO CUANDO LO HACIAMOS EN ARRAYS
	public static int buscarAlumno(Vector<Alumno> alumnos, String alumno) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equals(alumno)) {
				return i;
			}
		}
		return -1;
	}

}
