package ej1;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); 
		
		Path autoFile = Paths.get("auto.txt");
		Path propietarioFile = Paths.get("propietario.txt");
		Charset charset = Charset.forName("UTF-8");
		
		BufferedReader reader = null;
		BufferedReader reader2 = null;
		String lineaSplit[];
		String lineaSplit2[] = null;
		ArrayList <Automovil> automoviles = new ArrayList<>();
		
		//archivo log
		Path logFile = Paths.get("log.txt");
		BufferedWriter writer = null;
		
		try {
			reader = Files.newBufferedReader(autoFile, charset);
			String line = null;
			String line2 = null;
			while ((line = reader.readLine()) != null) { //LEEMOS EL PRIMER FICHERO
				boolean propietarioCorrecto = false; //PONEMOS A FALSE
				lineaSplit = line.split(","); // guardar la linea en un array de string
				if (lineaSplit.length == 4) { // SOLO SE TIENEN EN CUENTA LAS LINEAS CORRECTAS
					reader2 = Files.newBufferedReader(propietarioFile, charset);
					while ((line2 = reader2.readLine()) != null) { //LEEMPS EL SEGUNDO FICHERO
						lineaSplit2 = line2.split(",");
						if (lineaSplit[3].equals(lineaSplit2[0]))  {  
							//SI EN ALGUN MOMENTO SE ENCUENTRA UNA LINEA EN LA QUE LOS DNI SON IGUALES
							propietarioCorrecto = true; //SIGNIFICA QUE SI QUE HAY UN AUTOMOVIL PARA UN USUARIO
							break;
						}
					}
					if (!propietarioCorrecto) { //SI SIGUE EN FALSE SIGNIFICA QUE NO SE HA ENCONTRADO UN PROPIETARIO PARA UN VEHICULO
						//ESCRIBIR ERROR EN FICHERO LOG
						System.out.println("Error nuevo generado en fichero log");
						writer = Files.newBufferedWriter(logFile, charset, WRITE, APPEND, CREATE);
						writer.write("Error PROPIETARIO, matrícula:"+lineaSplit[0]);
						writer.newLine();
						writer.close();
						
					}else { //SI SI SE HA ENCONTRADO
						try {
							//CREAMOS LA FECHA PARA VER SI ES CORRECTA
							DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
							LocalDate fecha = LocalDate.parse(lineaSplit[1].trim(), patron);
							
							//CREAMOS UN OBJ AUTOMOVIL CON LOS DATOS OBTENIDOS
							automoviles.add(new Automovil(lineaSplit[0].trim(),fecha, lineaSplit[2].trim(),lineaSplit[3].trim(), lineaSplit2[1].trim(), lineaSplit2[2].trim()));
						}catch(DateTimeParseException e) {
							//SI SALTA LA EXCEPCION DE FECHA
							//ESCRIBIR ERROR EN FICHERO LOG
							System.out.println("Error nuevo generado en fichero log");
							writer = Files.newBufferedWriter(logFile, charset, WRITE, APPEND, CREATE);
							writer.write("Error FECHA, matrícula:"+lineaSplit[0]);
							writer.newLine();
							writer.close();
							
						}
					}
				}
			}
			//ORDENAR
			Collections.sort(automoviles, new AutomovilPorFecha());
			//MOSTRAR
			for (Automovil u : automoviles) {
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

}
