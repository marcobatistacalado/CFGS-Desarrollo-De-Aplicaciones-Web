package fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		LocalDate fecha2 = creacionFecha(sc);
		LocalDate fecha3 = creacionFecha(sc);
		
		long difftotaldias= ChronoUnit.DAYS.between(fecha2,fecha3);
		
		if (difftotaldias < 0 ) {
			difftotaldias *= -1;
		}
		System.out.println("Dias de diferencia: "+difftotaldias);
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
