import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

import static java.nio.file.StandardOpenOption.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Path ruta = Paths.get("usuarios");

		crearDirectorioUsuarios(sc, ruta);

		Charset charset = Charset.forName("UTF-8");
		// Buffer entrada
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String lineaSplit[];

		try {
			// LECTURA DE GIMNASIO.TXT
			// Creamos un BuffereReader de java.io
			reader = Files.newBufferedReader(Paths.get("gimnasio.txt"), charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				lineaSplit = line.split(","); // guardar la linea en un array de string
				if (lineaSplit.length == 4) { // SOLO SE TIENEN EN CUENTA LAS LINEAS CORRECTAS
					writer = escribirLineasPorUsuario(lineaSplit, charset);
				}
			}

			// RECORRER CARPETA USUARIOS Y VECTOR TIEMPO TOTAL
			Vector<Usuario> usuarios = new Vector<Usuario>();
			reader = carpetaUsuariostoObjetosUsuario(charset, reader, usuarios);
			
			//MOSTRAR ORDENADOS
			Collections.sort(usuarios, new UsuarioPorMinutosyCod());
			for (Usuario u : usuarios) {
				System.out.println(u.toString());
			}

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

	private static BufferedReader carpetaUsuariostoObjetosUsuario(Charset charset, BufferedReader reader,
			Vector<Usuario> usuarios) throws IOException {
		String[] lineaSplit;
		String line;
		DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("usuarios"));
		for (Path path : stream) {
			// IMPORTANTE EL .TOSTRING PQ SINO NO LO
			// ENCUENTRA********************************
			reader = Files.newBufferedReader(path, charset);
			line = null;
			while ((line = reader.readLine()) != null) {
				lineaSplit = line.split(","); // guardar la linea en un array de string
				int pos = usuarios.indexOf(new Usuario(path.getFileName().toString()));
				if (pos == -1) {
					// crear usuario porque no existe
					usuarios.add(new Usuario(path.getFileName().toString()));
					// añadirle los minutos segun ultimo objeto añadido
					usuarios.get(usuarios.size() - 1).setMinutos(Integer.parseInt(lineaSplit[1]));
				} else {
					// añadirle los minutos segun la posicion que nmos ha devuelto el indexOf
					usuarios.get(pos).setMinutos(Integer.parseInt(lineaSplit[1]));
				}
			}
		}
		return reader;
	}

	private static BufferedWriter escribirLineasPorUsuario(String[] lineaSplit, Charset charset) throws IOException {
		BufferedWriter writer;
		Path salida = Paths.get("usuarios/" + lineaSplit[0] + ".txt");
		if (!Files.exists(salida)) {
			// Crear el archivo si no existe
			Files.createFile(salida);
		}
		// Buffer salida
		writer = Files.newBufferedWriter(salida, charset, WRITE, APPEND, CREATE); // IMPORTANTISIMO ABRIR Y ESCRIBIR
																					// DESPUES*********************
		LocalTime hEntrada = LocalTime.parse(lineaSplit[2]);
		LocalTime hSalida = LocalTime.parse(lineaSplit[3]);
		long minutos = ChronoUnit.MINUTES.between(hEntrada, hSalida); // calcular minutos
		writer.write(lineaSplit[1] + "," + minutos);
		writer.newLine();
		writer.close();
		return writer;
	}

	private static void crearDirectorioUsuarios(Scanner sc, Path ruta) {
		if (!Files.exists(ruta)) {
			// SI NO EXISTE LA CREAMOS
			try {
				Files.createDirectories(ruta);
				System.out.println("Ruta creada");
			} catch (IOException e) {
				// Posibles problemas con permisos
				System.err.format("%s Error permisos\n", ruta);
			}
		} else {
			// SI EXISTE, BORRAMOS LOS ARCHIVOS .txt DENTRO DEL DIRECTORIO
			if (borrarTxtFicherosDirectorio(ruta) != 0) {
				System.out.println("Archivos .txt borrados con éxito");
			} else {
				System.out.println("No había archivos .txt para borrar.");
			}
		}
	}

	private static int borrarTxtFicherosDirectorio(Path ruta) {
		int cont = 0;
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(ruta);
			for (Path path : stream) {
				// IMPORTANTE EL .TOSTRING PQ SINO NO LO
				// ENCUENTRA********************************
				if (Files.isRegularFile(path) && path.getFileName().toString().endsWith(".txt")) {
					System.out.println("Archivo .txt borrado: " + path.getFileName());
					Files.delete(path);
					cont++;
				}
			}

		} catch (IOException e) {
			System.err.println(e);
		}
		return cont;
	}

}
