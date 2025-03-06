package Hoja3;
import java.util.*;
public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		final double p_km = 0.05;
		
		System.out.println("Introduce la distancia a recorrer:");
		int dist = sc.nextInt();
		System.out.println("Introduce el numero de dias:");
		int dias = sc.nextInt();
	
		int desc = (int) (dist*p_km);
		if (dist > 1000 && dias > 7) {
			desc = (int) (desc-((dist*p_km)*30)/100);
			System.out.println("El precio final tiene descuento y es "+desc);
		}
		else {
			System.out.println("El precio final no tiene descuento y es:"+desc);
		}
		
	}

}
