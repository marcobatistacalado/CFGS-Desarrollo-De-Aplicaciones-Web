package ejercicios;

import java.io.BufferedReader;
import static java.nio.file.StandardOpenOption.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero de entrada:");
		String nombreFicheroEntrada = sc.nextLine();

		System.out.println("Introduce el nombre del fichero de salida:");
		String nombreFicheroSalida = sc.nextLine();

		System.out.println("Introduce la palabra que deseas eliminar:");
		String palabraEliminar = sc.nextLine();

		if (nombreFicheroEntrada.equals(nombreFicheroSalida)) {
			System.out.println("Los nombres de los ficheros no pueden ser iguales.");
			return;
		}
		// Ruta entrada
		Path fileIn = Paths.get(nombreFicheroEntrada);
		Charset charset = Charset.forName("UTF-8");
		// Buffer entrada
		BufferedReader reader = null;
		// Ruta Salida
		Path fileOut = Paths.get(nombreFicheroSalida);
		BufferedWriter writer = null;
		if (!Files.isRegularFile(fileIn) || !Files.isRegularFile(fileOut)) {
			System.out.println("Alguno de los ficheros introducidos no lo es.");
		} else {
			try {
				// Creamos un BuffereReader de java.io
				reader = Files.newBufferedReader(fileIn, charset);
				String line = null;
				// Buffer salida
				writer = Files.newBufferedWriter(fileOut, charset, CREATE, WRITE, TRUNCATE_EXISTING); //Importantisimo*********
				while ((line = reader.readLine()) != null) {
					// meter codigo a escribir
					String nuevaLinea = line.replaceAll(palabraEliminar, ""); /*INTERNAMENTE LOS STRINGS SON ARRAYS DE CELDAS
					 QUE TIENEN CHAR A CHAR, SUS METODOS COMO REPLACEALL VAN HACINEDO LA COMPARAVCION*/
					writer.write(nuevaLinea);
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

}
