package ejercicios;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Path entrada = Paths.get("ejemplo/fichero.txt");
		Path copia1 = Paths.get("ejemplo/copias1.txt");
		Path copia2 = Paths.get("ejemplo/copia2.txt");
		Path reconstruccion = Paths.get("ejemplo/reconstruccion.txt");
		// Array de bytes para leer todos los bytes del archivo
		InputStream istream = null;
		InputStream istream2 = null;
		OutputStream ostream = null;
		int c;
		try {
			dividirArchivo(entrada, copia1, copia2);
			int cont = 1;
			unirArchivo(copia1,copia2,reconstruccion);
			
		} catch (IOException io) {
			System.err.println(io);
		}
	}

	private static void dividirArchivo(Path entrada, Path copia1, Path copia2) throws IOException {
		InputStream istream;
		OutputStream ostream;
		int c;
		int cont = 1;
		// InputStream y OutputStream de java.io nos permiten trabajar byte a byte
		// Los generamos de forma eficiente utilizando java.nio
		istream = Files.newInputStream(entrada);
		ostream = Files.newOutputStream(copia1);
		while ((c = istream.read()) != -1) {
			// Escribimos todos los bytes en el archivo salida
			// Despu�s de ejecutar comprobar que es igual a entrada
			if (cont % 2 != 0)
				ostream.write(c);
			cont++;
		}
		istream = Files.newInputStream(entrada);
		ostream = Files.newOutputStream(copia2);
		cont = 1;
		while ((c = istream.read()) != -1) {
			// Escribimos todos los bytes en el archivo salida
			// Despu�s de ejecutar comprobar que es igual a entrada
			if (cont % 2 == 0)
				ostream.write(c);
			cont++;
		}
		istream.close();
		ostream.close();
	}
	
	private static void unirArchivo(Path copia1, Path copia2, Path salida) throws IOException {
		
		InputStream istream, istream2;
		OutputStream ostream;
		int c=0,c1=0;
		int cont = 1;
		// InputStream y OutputStream de java.io nos permiten trabajar byte a byte
		// Los generamos de forma eficiente utilizando java.nio
		istream = Files.newInputStream(copia1);
		istream2 = Files.newInputStream(copia2);
		ostream = Files.newOutputStream(salida);
		while (c!=-1 || c1!=-1) {
			// Escribimos todos los bytes en el archivo salida
			// Despu�s de ejecutar comprobar que es igual a entrada
			c=istream.read();
			if (c!=-1)
				ostream.write(c);
			c1=istream2.read();
			if (c1!=-1)
				ostream.write(c1);
			
		}
		istream.close();
		istream2.close();
		ostream.close();
	}

}
