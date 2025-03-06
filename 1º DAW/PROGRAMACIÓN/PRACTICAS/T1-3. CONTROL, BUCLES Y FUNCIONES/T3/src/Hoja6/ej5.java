package Hoja6;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner (System.in);
		int sala, uno = 0,dos = 0, entrada = 0, total = 0, i = 0;
		do {
			System.out.println("Introduce la sala:");
			sala = sc.nextInt();
			System.out.println("Número de entradas");
			entrada = sc.nextInt();
			if (sala == 1) {
				uno = uno + entrada; 
			}else if (sala == 2) {
				dos = dos + entrada;
			}
			if (sala != 0) {
				total = total + entrada;	
			}
			
			if (entrada > 10) {
				i = i + 1;
			}
		}while(sala != 0);
		System.out.println("TOTAL DE ENTRADAS: "+total);
		System.out.println("SALA 1: "+uno);
		System.out.println("SALA 2: "+dos);
		if (uno > dos) {
			System.out.println("Se han vendido más entradas en la sala 1");
		}else {
			System.out.println("Se han vendido más entradas en la sala 2");
		}
		System.out.println("Han comprado más de 10 entradas: "+i+" personas");
	}

}
