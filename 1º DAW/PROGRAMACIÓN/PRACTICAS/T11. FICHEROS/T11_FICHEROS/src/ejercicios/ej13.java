package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file = Paths.get("ejemplo/fileAlumnos.txt");
		Charset charset = Charset.forName("UTF-8");
		BufferedReader reader = null;
		ArrayList <Alumno> alumnos = new ArrayList <>();
		try {
			// Creamos un BuffereReader de java.io
			reader = Files.newBufferedReader(file, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				String [] lineaArray = line.split(",");
				try {
					if(lineaArray.length != 4) {
						System.out.println("EL FORMATO NO ES CORRECTO");
					}else {
						//pasarle el trim() para los blancos
						alumnos.add(new Alumno (lineaArray[0].trim(),lineaArray[1].trim(),Double.parseDouble(lineaArray[2].trim()),LocalDate.parse(lineaArray[3].trim())));
					}
				} catch (NumberFormatException e) {
					System.err.println("Error al convertir a double: " + e.getMessage());
				}
			}
			
			Collections.sort(alumnos); //Ordenar por nota
			for (Alumno a : alumnos) {
				System.out.println(a.toString());
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
		}
	}

}
