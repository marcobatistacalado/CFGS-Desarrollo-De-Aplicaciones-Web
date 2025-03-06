package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce palabra:");
		String word = sc.nextLine();
		// Ruta entrada
		Path fileIn = Paths.get("ejemplo/file1.txt");
		Charset charset = Charset.forName("UTF-8");
		// Buffer entrada
		BufferedReader reader = null;
		// Ruta Salida
		Path fileOut = Paths.get("ejemplo/file2.txt");
		BufferedWriter writer = null;
		try {
			// Creamos un BuffereReader de java.io
			reader = Files.newBufferedReader(fileIn, charset);
			String line = null;
			// Buffer salida
			writer = Files.newBufferedWriter(fileOut, charset);
			while ((line = reader.readLine()) != null) {
				// meter codigo a escribir
				// Convertir la línea a mayúsculas antes de escribirla
				if (line.contains(word)) { //tambien se puede hacer con indexOf.
					writer.write(line);
				}
				writer.newLine();

			}
			System.out.println("Escrito con éxito.");
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
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.format("IOException: %s%n", e);
				}
			}
		}
	}

}
