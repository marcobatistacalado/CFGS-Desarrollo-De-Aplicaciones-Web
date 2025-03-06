package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime fechaActual = LocalDateTime.now(); 
		LocalDateTime fechaFinal = fechaActual.plusSeconds(2);

		Random random = new Random();
		int maximo,minimo, azar, contador =  0;
		minimo = 1;
		maximo = 6;
	
		do {
			azar = random.nextInt(maximo - minimo + 1) + minimo;
			if (azar == 6) {
				contador++;
			}
			fechaActual = LocalDateTime.now(); 
		}while(fechaActual.isBefore(fechaFinal)); 
				
		System.out.println(contador);
	}

}
