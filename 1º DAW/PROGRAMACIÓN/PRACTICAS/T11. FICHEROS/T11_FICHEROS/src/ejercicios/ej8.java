package ejercicios;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la letra:");
		char letra = sc.nextLine().charAt(0);
		
		//Ruta Archivo
		Path entrada = Paths.get("ejemplo/holi.txt");
		// Array de bytes para leer todos los bytes del archivo
		InputStream istream=null;
		int c;
		int cont = 0;
		try {
			//InputStream y OutputStream de java.io nos permiten trabajar byte a byte
			//Los generamos de forma eficiente utilizando java.nio
			istream = Files.newInputStream(entrada);
			byte bytes[] = istream.readAllBytes(); //array de bytes
			for (byte i : bytes) {
				if (i == letra) {
					cont++;
				}
			}
			/*
			 * esto tambien se puede hacer cogiendo linea a linea y haciendo la busqueda?
			 */
			System.out.println("Numero de caracteres: "+cont);
			istream.close();
		} catch (IOException io) {
			System.err.println(io);
		}
	}

}