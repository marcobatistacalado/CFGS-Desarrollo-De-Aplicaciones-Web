package fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
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
		System.out.println("Introduce numero de dias a sumar:");
		int dias = sc.nextInt();
		fecha = fecha.plusDays(dias);
		System.out.println("Fecha nueva:"+fecha);
		
	}

}
