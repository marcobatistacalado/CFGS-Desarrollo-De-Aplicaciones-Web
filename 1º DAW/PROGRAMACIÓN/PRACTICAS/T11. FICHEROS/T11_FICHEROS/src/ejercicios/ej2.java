package ejercicios;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardCopyOption.*; //Necesario para REPLACE_EXISTING

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una ruta:");
		String ruta = sc.nextLine();
		System.out.println("Introduce el nombre de un archivo origen:");
		String archivo1 = sc.nextLine();
		System.out.println("Introduce el nombre de un archivo destino:");
		String archivo2 = sc.nextLine();
		
		Path ruta1 = Paths.get(ruta + "/" + archivo1);
		Path ruta2 = Paths.get(ruta + "/" + archivo2);
		
		try {
			Files.copy(ruta1, ruta2);			
		} 
		catch (NoSuchFileException x)
		{
			System.err.format("%s no existe ",x.getMessage());
		}
		catch (FileAlreadyExistsException x) {
			System.err.format("%s ya existe", x.getMessage());
			System.out.println("Sobreescribir? (S/N)");
			String sobres = sc.nextLine();
			if (sobres.equalsIgnoreCase("S")) {
				try {
					Files.copy(ruta1, ruta2, REPLACE_EXISTING);
				}catch(IOException e) {
					// Posibles problemas con permisos 
					System.err.format("%s Error permisos\n",ruta1);
				}
			}
		} 
		catch (IOException x) {
					// Posibles problemas con permisos 
			System.err.format("%s Error permisos\n",ruta1);
		}
		
	}

}
