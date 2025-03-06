package fechas;

import java.time.*;
import java.util.Scanner;

public class EjemploFechas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha de hoy:"+fechaActual);
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual:"+horaActual);
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Fecha y hora actual:"+ahora);

		// Crear fechas y horas
		//JAVA YA DETECTA BISIESTOS Y COSAS DE ESAS NO NO SHACE FALTA VALIDACION
	
		try{
			LocalDate fechaNacimiento=LocalDate.of(1999, 12, 28); 
			System.out.println("Fecha nacimiento:"+fechaNacimiento); 
			
		}catch(DateTimeException e){
			System.out.println("Fecha incorrecta");
		}
		try{
			LocalTime horaRecreo=LocalTime.of(11, 25, 0); 
			System.out.println("Salimos al recreo a las " + horaRecreo); 
		}catch(DateTimeException e){
			System.out.println("Hora incorrecta");
		}
		try{
			LocalDateTime heNacido=LocalDateTime.of(1999, 3, 28,20, 40); 
			System.out.println("Momento exacto de mi nacimiento: "+ heNacido);
		}catch(DateTimeException e){
			System.out.println("Fecha incorrecta");
		}
		int dia,mes,ano;
		boolean fecha1;
		do {
			fecha1 = true;
			System.out.println("Introducir dia: ");
			dia = sc.nextInt();
			System.out.println("Introducir mes: ");
			mes = sc.nextInt();
			System.out.println("Introducir ano: ");
			ano = sc.nextInt();
			try{
				LocalDate fechaNacimiento=LocalDate.of(ano, mes, dia); 
				System.out.println("Fecha nacimiento:"+fechaNacimiento); 
			}catch(DateTimeException e){
				System.out.println("Fecha incorrecta");
				fecha1 = false;
			}
		}while(fecha1 == false);
	}

}
