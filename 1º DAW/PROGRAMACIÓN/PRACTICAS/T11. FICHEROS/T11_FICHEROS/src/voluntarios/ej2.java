package voluntarios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una ruta:");
		Path ruta = Paths.get(sc.nextLine());

		if (Files.isDirectory(ruta)) {
			try {
				DirectoryStream<Path> stream = Files.newDirectoryStream(ruta);
				for (Path path : stream) {
					if (Files.isRegularFile(path)) {
						Path cambio = Paths.get(path.getParent()+"/"+path.getFileName().toString().substring(0, 1).toUpperCase()+path.getFileName().toString().substring(1));
						Files.move(path, cambio);
						System.out.println(path.getFileName());
					}
				}
			} catch (IOException e) {
				System.err.format("%s Error permisos\n", ruta);
			}
		}

	}

}
