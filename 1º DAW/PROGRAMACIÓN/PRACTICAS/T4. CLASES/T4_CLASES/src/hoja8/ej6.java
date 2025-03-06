package hoja8;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int nota1,nota2,nota3;
		String mat;
		Alumno alum1 = null,alum2 = null ,alum3 = null;
		for (int i = 3; i>0; i--) {
			System.out.println("Alumno"+i);
			System.out.println("Matricula: ");
			mat = sc.nextLine();
			System.out.println("Nota1:");
			nota1 = sc.nextInt();
			System.out.println("Nota2:");
			nota2 = sc.nextInt();
			System.out.println("Nota3:");
			nota3 = sc.nextInt();
			sc.nextLine();
			if (i == 3) {
				alum3 = new Alumno(mat, nota1,nota2,nota3);
			}else if (i == 2){
				alum2 = new Alumno(mat, nota1,nota2,nota3);
			}else if (i == 1){
				alum1 = new Alumno(mat, nota1,nota2,nota3);
			}
		}
		int media1,media2,media3;
		media1 = alum1.getMedia();
		media2 = alum2.getMedia();
		media3 = alum3.getMedia();

		if (media1 >= media2 && media1 >= media3) {
		    // alum1 es el mayor
		    System.out.println(alum1.toString());

		    if (media2 >= media3) {
		        // alum2 es el medio
		        System.out.println(alum2.toString());
		        // alum3 es el menor
		        System.out.println(alum3.toString());
		    } else {
		        // alum3 es el medio
		        System.out.println(alum3.toString());
		        // alum2 es el menor
		        System.out.println(alum2.toString());
		    }
		} else if (media2 >= media1 && media2 >= media3) {
		    // alum2 es el mayor
		    System.out.println(alum2.toString());

		    if (media1 >= media3) {
		        // alum1 es el medio
		        System.out.println(alum1.toString());
		        // alum3 es el menor
		        System.out.println(alum3.toString());
		    } else {
		        // alum3 es el medio
		        System.out.println(alum3.toString());
		        // alum1 es el menor
		        System.out.println(alum1.toString());
		    }
		} else {
		    // alum3 es el mayor
		    System.out.println(alum3.toString());

		    if (media1 >= media2) {
		        // alum1 es el medio
		        System.out.println(alum1.toString());
		        // alum2 es el menor
		        System.out.println(alum2.toString());
		    } else {
		        // alum2 es el medio
		        System.out.println(alum2.toString());
		        // alum1 es el menor
		        System.out.println(alum1.toString());
		    }
		}
		
		System.out.println("Numero de aprobados: "+Alumno.getAprobado());


	}


}
