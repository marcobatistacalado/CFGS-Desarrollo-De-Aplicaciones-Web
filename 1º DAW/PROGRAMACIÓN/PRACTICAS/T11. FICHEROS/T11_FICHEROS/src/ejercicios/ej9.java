package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce ruta: ");
		String rutaString = sc.nextLine();
		Path ruta = Paths.get(rutaString);

		Charset charset = Charset.forName("UTF-8");
		BufferedReader reader = null;
		if (Files.isDirectory(ruta)) {
			try {
				DirectoryStream<Path> stream = Files.newDirectoryStream(ruta);
				for (Path path : stream) {
					if (Files.isRegularFile(path)) {
						System.out.println(path.getFileName());
						System.out.println("-------------------------------");
						reader = leerMostrarArchivo(charset, path);
						System.out.println("-------------------------------");

					}
				}
				stream.close();
			} catch (IOException e) {
				System.err.format("%s Error permisos\n", ruta);
			} finally {
				try {
					if (reader != null) {
						reader.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static BufferedReader leerMostrarArchivo(Charset charset, Path path) throws IOException {
		BufferedReader reader;
		// Creamos un BuffereReader de java.io
		reader = Files.newBufferedReader(path, charset);
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		return reader;
	}

}
