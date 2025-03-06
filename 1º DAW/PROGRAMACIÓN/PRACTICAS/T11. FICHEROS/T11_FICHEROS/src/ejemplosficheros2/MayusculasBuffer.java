package ejemplosficheros2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MayusculasBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Ruta entrada
		Path fileIn = Paths.get("ejemplo/holi.txt");
		Charset charset = Charset.forName("UTF-8");
		// Buffer entrada
		BufferedReader reader = null;
		// Ruta Salida
		Path fileOut = Paths.get("ejemplo/holi2.txt");
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
				String lineaMayusculas = line.toUpperCase();
				writer.write(lineaMayusculas);
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
