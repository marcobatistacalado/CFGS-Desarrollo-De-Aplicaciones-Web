package voluntarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();

		altaUsuariosFromLectura(usuarios);
		for (Usuario i : usuarios) {
			System.out.println(i.toString());
		}
		
		System.out.println("Usuario:");
		String logUsuario = sc.nextLine();
		System.out.println("Password:");
		String logPassword = sc.nextLine();
		boolean login = false;
		for (Usuario i : usuarios) {
			if (i.getNombre().equals(logUsuario) && i.getPassword().equals(logPassword)) {
				System.out.println(i.getMins());
				login = true;
			}
		}
		if (!login) {
			System.out.println("usuario/contraseña incorrecto");
		}
	}

	private static void altaUsuariosFromLectura(ArrayList<Usuario> usuarios) {
		Path file = Paths.get("ejemplo2/usuario");
		Charset charset = Charset.forName("UTF-8");
		BufferedReader reader = null;
		String nombre = "", password = "", conexion = "";
		int correcto = 0;
		try {
			// Creamos un BuffereReader de java.io
			reader = Files.newBufferedReader(file, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (nombre.equals(""))
					nombre = encontrarCadena(line.toString(), "<nombre>");
				if (password.equals(""))
					password = encontrarCadena(line.toString(), "<password>");
				if (conexion.equals(""))
					conexion = encontrarCadena(line.toString(), "<conexion>");

				if (!nombre.equals("") && !password.equals("") && !conexion.equals("")) {
					usuarios.add(new Usuario (nombre,password,Integer.parseInt(conexion)));
					nombre = ""; password = ""; conexion = ""; //despues de darlo de alta hay que poner las variables a vacio
				}
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}catch(NumberFormatException e){
			System.out.println("No se ha podido transformar a int la conexion del usuario");
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
	
	private static String encontrarCadena(String line, String cadBuscar) {
		String devolucion = "";
		if (line.contains(cadBuscar)) {
			int pos = line.toString().indexOf(">");
			if (pos != -1) {
				for (int i = pos + 1; i < line.length(); i++) {
					if (line.charAt(i) != '<') {
						devolucion += line.charAt(i);
					} else {
						return devolucion;
					}
				}
			}
		}
		return devolucion;
	}

}
