package Hoja5;
import java.util.*;
public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		int na = 5, mayores = 0, altos = 0, edad = 0, medad = 0;
		double altura = 0, maltura = 0;
		while (na >=1 ) {
			System.out.println("Introduce tu edad");
			edad = sc.nextInt();
			System.out.println("Introduce la altura:");
			altura = sc.nextDouble();
			
			medad = medad + edad;
			maltura = maltura + altura;
			
			if (edad >= 18) {
				mayores = mayores + 1;
			}
			if (altura > 1.75) {
				altos = altos + 1;
			}
			
			na = na - 1;
		}
		medad = medad / 5;
		maltura = maltura / 5;
		
		System.out.println("La media de edad es: "+medad);
		System.out.println("La media de altura es: "+maltura);
		System.out.println("La cantidad de mayores de edad es: "+mayores);
		System.out.println("La cantidad de altos es: "+altos);
	}

}
