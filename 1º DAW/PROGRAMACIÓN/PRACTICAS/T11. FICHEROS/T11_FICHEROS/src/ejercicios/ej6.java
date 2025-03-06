package ejercicios;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la ruta de la carpeta a borrar:");
		String rutaStr = sc.nextLine();
		Path ruta = Paths.get(rutaStr);

		try {
			borrarCarpeta(ruta);
			System.out.println("Carpeta borrada exitosamente.");
		} catch (IOException e) {
			System.err.println("Error al borrar la carpeta: " + e.getMessage());
		}
	}

	private static void borrarCarpeta(Path ruta) throws IOException {
		if (!Files.exists(ruta)) {
			System.out.println("La carpeta no existe.");
			return;
		}

		if (!Files.isDirectory(ruta)) {
			System.out.println("La ruta no es un directorio.");
			return;
		}

		// Borra todos los archivos y subdirectorios recursivamente
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(ruta)) {
			for (Path path : stream) {
				if (Files.isDirectory(path)) {
					borrarCarpeta(path); // Recursión para borrar subdirectorios
				} else {
					Files.delete(path); // Borra archivos
				}
			}
		}

		// Borra la carpeta principal después de haber borrado todos sus contenidos
		Files.delete(ruta);
	}
}
