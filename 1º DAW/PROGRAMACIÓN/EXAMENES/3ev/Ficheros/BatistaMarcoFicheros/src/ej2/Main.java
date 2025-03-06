package ej2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path d1 = Paths.get("Directorio1");
		Path d2 = Paths.get("Directorio2");
		// Mostrar los archivos de un directorio
		if (!Files.isDirectory(d1) || !Files.isDirectory(d2)) {
			System.out.println("Una de las rutas no es un directorio");
			System.exit(0);// salir
		} else {
			// Aqui ambas ya son directorios
			try {
				DirectoryStream<Path> stream1 = Files.newDirectoryStream(d1); // abrimos ruta1
				for (Path path1 : stream1) {
					if (Files.isRegularFile(path1)) {
						// por cada fichero nos recorremos el segundo directorio con otro metodo que nos
						// devuelve true si ese fichero se encuentra en el otro
						if (!buscarMismosFiles(path1, d2)) { //si no son iguales los mostramos
							System.out.println(path1.getFileName().toString());
						}
					}
				}
				stream1.close();
				//luego recorremos el segundo y mostramos todos
				DirectoryStream<Path> stream2 = Files.newDirectoryStream(d2);
				for (Path path2 : stream2) {
					if (Files.isRegularFile(path2)) {
						System.out.println(path2.getFileName().toString());
					}
				}
				stream2.close();

			} catch (IOException e) {
				System.err.format("%s Error permisos\n", d1);
			}
		}
	}

	public static boolean buscarMismosFiles(Path ruta1, Path ruta2) {
		try {
			DirectoryStream<Path> stream2 = Files.newDirectoryStream(ruta2);
			for (Path path2 : stream2) {
				if (Files.isRegularFile(path2)) {
					if (ruta1.getFileName().toString().equals(path2.getFileName().toString()))
						return true;
				}
			}
		} catch (IOException e) {
			return false;
		}
		return false;
	}
}
