package voluntarios;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce ruta completa 1: ");
		Path ruta1 = Paths.get(sc.nextLine());
		System.out.println("Introduce ruta completa 2: ");
		Path ruta2 = Paths.get(sc.nextLine());

		// Mostrar los archivos de un directorio
		if (!Files.isDirectory(ruta1)) {
			System.out.println("ruta1 no es un directorio");
		} else {
			if (!Files.isDirectory(ruta2)) {
				System.out.println("ruta2 no es un directorio");
			} else {
				// Aqui ambas ya son directorios
				try {
					DirectoryStream<Path> stream1 = Files.newDirectoryStream(ruta1); //abrimos ruta1
					for (Path path1 : stream1) { 
						//por cada fichero nos recorremos el segundo directirio con otro metodo que nos devuelve true si ese fichero se encuentra en el otro
						if (buscarMismosFiles(path1, ruta2)) {
							System.out.println(path1.getFileName()); // SACAR NOMBRE POR PANTALLA
							System.out.println("Quieres borrarlo del 1) 2) 3)ninguno ");
							int borrar = sc.nextInt();
							switch (borrar) {
							case 1:
								//Borrado directorio 1
								try {
									Files.delete(path1);
									System.out.println("Procedemos a borrarlo del directorio 1...");
								} catch (NoSuchFileException x) {
									System.err.format("%s: no existe el archivo o directorio\n", path1);
								} catch (IOException x) {
									// Posibles problemas con permisos
									System.err.format("%s Error permisos\n", path1);
								}
								break;
							case 2:
								//Borrado directorio 2 ????
								try {
									//para borrar el otro obtenemos la ruta2 y le pasamos el nombre de el fichero en el momento.
									String rutaString = ruta2.toString()+"/"+path1.getFileName().toString();
									System.out.println(path1.getFileName().toString());
									Path rutaBorrar2 = Paths.get(rutaString);
									Files.delete(rutaBorrar2);
									System.out.println("Procedemos a borrarlo del directorio 2...");
								} catch (NoSuchFileException x) {
									System.err.format("%s: no existe el archivo o directorio\n", path1);
								} catch (IOException x) {
									// Posibles problemas con permisos
									System.err.format("%s Error permisos\n", path1);
								}
								break;
							case 3:
								System.out.println("No lo borramos");
								break;
							}

						}
					}

				} catch (IOException e) {
					System.err.format("%s Error permisos\n", ruta1);
				}
			}
		}
	}

	public static boolean buscarMismosFiles(Path ruta1, Path ruta2) {
		try {
			DirectoryStream<Path> stream2 = Files.newDirectoryStream(ruta2);
			for (Path path2 : stream2) {
				if (ruta1.getFileName().toString().equals(path2.getFileName().toString()))
					return true;
			}
		} catch (IOException e) {
			return false;
		}
		return false;
	}

}
