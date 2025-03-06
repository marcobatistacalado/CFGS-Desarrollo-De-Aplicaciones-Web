package ejercicios;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce ruta:");
		Path entrada = Paths.get(sc.nextLine());
		Path salida = Paths.get("ejemplo/copiasinvocales.txt");
		// Array de bytes para leer todos los bytes del archivo
		InputStream istream = null;
		OutputStream ostream = null;
		int c;
		try {
			// InputStream y OutputStream de java.io nos permiten trabajar byte a byte
			// Los generamos de forma eficiente utilizando java.nio
			istream = Files.newInputStream(entrada);
			ostream = Files.newOutputStream(salida);
			while ((c = istream.read()) != -1) {
				// Escribimos todos los bytes en el archivo salida
				// Despu�s de ejecutar comprobar que es igual a entrada
				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
				ostream.write(c);
			}
			istream.close();
			ostream.close();
		} catch (IOException io) {
			System.err.println(io);
		}
	}

}
