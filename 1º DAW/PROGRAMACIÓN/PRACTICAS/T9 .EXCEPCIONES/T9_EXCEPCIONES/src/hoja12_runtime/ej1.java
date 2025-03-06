package hoja12_runtime;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num=0, cont = 0, suma=0;
		do {
			try {
				System.out.println("Introduce numero:");
				num = sc.nextInt();
				suma +=num;
				if (num!=0) {
					cont++;
				}
				
			}catch(InputMismatchException e){
				sc.nextLine();//limpiar
				System.out.println("Introduce otro numero: ");
				num = -1;

			}
		}while (num!=0);
		
		try {

			suma /= cont;
			System.out.println("Media: "+suma);
		}catch(ArithmeticException e) {
			System.out.println("No se puede calcular la media porque division por 0");
		}
		
	}

}
