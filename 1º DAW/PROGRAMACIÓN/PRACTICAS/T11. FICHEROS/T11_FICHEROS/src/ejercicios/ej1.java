package ejercicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una ruta:");
		String ruta = sc.nextLine();
		System.out.println("Introduce el nombre de un archivo:");
		String archivo = sc.nextLine();
		Path ruta1 = Paths.get(ruta + "/" + archivo);
		if (!Files.exists(ruta1)) {
			System.out.println("ERROR RUTA");
		}else {
			System.out.println(ruta1.toString());
			System.out.println(ruta1.getNameCount());
			for (int i = 0; i<ruta1.getNameCount(); i++) {
				System.out.println(ruta1.getName(i));
			}
		}
	}
}
