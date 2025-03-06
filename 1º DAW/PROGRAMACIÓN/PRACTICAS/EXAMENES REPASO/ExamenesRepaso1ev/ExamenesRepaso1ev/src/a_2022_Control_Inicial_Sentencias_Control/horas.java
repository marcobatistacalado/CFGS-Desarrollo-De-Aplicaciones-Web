package a_2022_Control_Inicial_Sentencias_Control;

import java.util.Locale;
import java.util.Scanner;

public class horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);// poder leer numeros con decimales
		//CALCULO HORAS
		System.out.println("Introduce la hora de salida:");
		System.out.println("Introdue los minutos de salida:");
		System.out.println("Introduce la hora de llegada");
		System.out.println("Introduce los minutos de llegada");
		int hs = sc.nextInt(), ms = sc.nextInt(), hf = sc.nextInt(), mf = sc.nextInt();
		int minutos = 0, horas = 0;
		
		ms = 60-ms;//minutos hasta la siguiente hora
		minutos = ms + mf; // y la suma de esos minutos junto con los del final
		
		//si no es 0 los minutos ya pasamos a la siguiente hora
		if (ms > 0) {
			hs = hs+1;
			horas = ( hf - hs );
		}
		if (minutos == 60) {
			horas = horas +1;
			minutos = 0;
		}else if (minutos > 60) {
			horas = horas + 1;
			minutos = minutos - 60;
		}
		
		System.out.println(horas+":"+minutos);
		
		//LA FORMA FÁCIL
		/*
		int tiempoi, tiempof, tiempo, horaf,minutof;
		
		tiempoi = ms+hs*60;
		tiempof= mf+hf*60;
		
		tiempo = tiempof - tiempoi;
		horaf = tiempo / 60;
		minutof = tiempo % 60;
		System.out.println(horaf+":"+minutof);
		*/
		
		
		
	}

}
