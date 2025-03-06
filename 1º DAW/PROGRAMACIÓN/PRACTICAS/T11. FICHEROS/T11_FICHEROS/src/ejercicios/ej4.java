package ejercicios;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce caracter:");
		String letra = sc.nextLine();
		System.out.println("Introduce ruta");
		Path ruta1 = Paths.get(sc.nextLine());

		if (!Files.exists(ruta1)) {
			System.out.println("No existe el directorio");
		} else {
			if (!Files.isDirectory(Paths.get(".."))) {
				System.out.println("No es un directorio");
			} else {
				try {
					DirectoryStream<Path> stream = Files.newDirectoryStream(ruta1);
					for (Path path : stream) {
						// System.out.println(Files.delete(path.getFileName()))
						if (Files.isRegularFile(path)) {
							//IMPORTANTE EL TOSTRING****************************
							if (path.getFileName().toString().startsWith(letra)) {
								Files.delete(path);
							}
						}
					}

				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}

	}

}
