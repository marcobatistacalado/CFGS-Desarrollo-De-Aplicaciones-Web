package voluntarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Path file = Paths.get("ejemplo2/hola.txt");
		Charset charset = Charset.forName("UTF-8");
		BufferedReader reader = null;
		System.out.println("Introduce la palabra a buscar:");
		String palabra = sc.nextLine();
		int cont = 0;
		try {
			// Creamos un BuffereReader de java.io
			reader = Files.newBufferedReader(file, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.toString().contains(palabra)) {
					cont++;
				}
			}
			System.out.println("Numero de apariciones: "+cont);
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.format("IOException: %s%n", e);
				}
			}
		}
	}

}
