package fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		LocalDate fecha2 = creacionFecha(sc);
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("EEEE"); //importante
		System.out.println(formato1.format(fecha2));
		
	}
	public static LocalDate creacionFecha(Scanner sc) {
		int dia,mes,ano;
		LocalDate fecha = null;
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
				fecha=LocalDate.of(ano, mes, dia); 
				System.out.println("Fecha nacimiento:"+fecha); 
			}catch(DateTimeException e){
				System.out.println("Fecha incorrecta");
				fecha1 = false;
			}
		}while(fecha1 == false);
		
		return fecha;
	}

}
