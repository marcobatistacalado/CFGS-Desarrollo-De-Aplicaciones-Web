package ej2_alumnos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero de alumnos");
		int numAlumnos = sc.nextInt();
		sc.nextLine();
		Alumno alumnos[] = new Alumno[numAlumnos];

		String nombre, apellido, pais, proc;
		int curso, extranjero, puente;
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Apellido: ");
			apellido = sc.nextLine();
			System.out.println("Curso");
			curso = sc.nextInt();
			System.out.println("¿Eres extranjero?: 1.SI 2.NO");
			extranjero = sc.nextInt();
			if (extranjero == 1) {
				sc.nextLine();
				System.out.println("Pais: ");
				pais = sc.nextLine();
				alumnos[i] = new Extranjero(nombre, apellido, curso, pais);
			} else {
				System.out.println("Eres puente?: 1.SI 2.NO");
				puente = sc.nextInt();
				if (puente == 1) {
					sc.nextLine();
					System.out.println("Procedencia: ");
					proc = sc.nextLine();
					alumnos[i] = new Puente(nombre, apellido, curso, proc);

				} else {
					// normal
					alumnos[i] = new Alumno(nombre, apellido, curso);
				}
			}
		}
		
		for (int i = 0; i<numAlumnos;i++) {
			System.out.println(alumnos[i].toString());
		}
	}

}
