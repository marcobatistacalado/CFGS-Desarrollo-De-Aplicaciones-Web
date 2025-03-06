package Hoja3;
import java.util.*;
public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double gf = 2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce los 2 ultimos valores del contador:");
		double n, p = 0, ni = sc.nextInt(), nf = sc.nextInt();
		n = nf - ni;
		
		if (n <= 100) {
			p = gf+(0.5*n);
		}
		else if (n > 100 && n <=150){
			p = gf+(0.7*n);
		}else if (n > 150){
			p = gf+(1*n);
		}
		System.out.println("El precio es de: "+p);
		
	}

}
