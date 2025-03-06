package Hoja2;
import java.util.*;
public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t, horas, minutos, seg;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el tiempo en segundos: ");
		t = entrada.nextDouble();
		minutos=t/60;
		horas=minutos/60;
		seg=t-(minutos*30);
		minutos=minutos%60;
		System.out.println("Los segundos= "+seg);
		System.out.println("Los minutos son= "+minutos);
		System.out.println("Las horas son= "+horas);
		
		

	}

}
