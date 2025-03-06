package voluntarios;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String nombre, password;
		int conexion;
		String acabar = "s";
		while (!acabar.equalsIgnoreCase("n")) {
			System.out.println("Nombre:");
			nombre = sc.nextLine();
			System.out.println("Password:");
			password = sc.nextLine();
			System.out.println("Conexion:");
			conexion = sc.nextInt();
			crearUsuario(nombre, password, conexion);
			sc.nextLine();
			System.out.println("Quieres continuar? (s)");
			acabar = sc.nextLine();
		}
	}

	private static void crearUsuario(String nombre, String password, int conexion) {
		Path file = Paths.get("ejemplo2/usuario");
		Charset charset = Charset.forName("UTF-8");
		BufferedWriter writer = null;

		try {
			writer = Files.newBufferedWriter(file, charset, WRITE, APPEND, CREATE);
			writer.write("");
			writer.newLine();
			writer.write("<usuario>");
			writer.newLine();
			writer.write("<nombre>" + nombre + "</nombre>");
			writer.newLine();
			writer.write("<password>" + password + "</password>");
			writer.newLine();
			writer.write("<conexion>" + conexion + "</conexion>");
			writer.newLine();
			writer.write("</usuario>");
			writer.write("");
			writer.newLine();
			writer.close();
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		} finally {
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
