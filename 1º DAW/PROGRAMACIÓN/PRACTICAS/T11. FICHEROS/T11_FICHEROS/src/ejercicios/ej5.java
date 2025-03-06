package ejercicios;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce ruta directorio");
		Path ruta = Paths.get(sc.nextLine());
		if (!Files.exists(ruta) && !Files.isDirectory(ruta)) {
			System.out.println("No existe la ruta");
		} else {
			boolean continuar = false;
			while (!continuar) {
				try {
					Files.delete(ruta);
					continuar = true;
				} catch (DirectoryNotEmptyException x) {
					System.err.format("%sEl directorio no est� vac�o\n", ruta);
					continuar = borrarDirectorioLleno(sc, ruta, continuar);
				} catch (IOException x) {
					// Posibles problemas con permisos
					System.err.format("%s Error permisos\n", ruta);
				}
			}
		}
	}

	private static boolean borrarDirectorioLleno(Scanner sc, Path ruta, boolean continuar) {
		System.out.println();
		System.out.println("Quieres borrarlo igualmente? (S/N)");
		String borrar = sc.nextLine();
		if (borrar.equalsIgnoreCase("S")) {
			System.out.println("Procedemos a borrarlo...");
			borrarFicherosDirectorio(ruta);
		} else {
			continuar = true;
		}
		return continuar;
	}

	private static void borrarFicherosDirectorio(Path ruta) {
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(ruta);
			for (Path path : stream) {
				if (Files.isRegularFile(path)) {
					Files.delete(path);
				}
			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
