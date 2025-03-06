package Hoja2;
import java.util.*;
public class Ejer9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int a=0;
		System.out.println("Introduce la primera nota:");
		a = entrada.nextInt()+a;
		System.out.println("Introduce la segunda nota:");
		a = entrada.nextInt()+a;
		System.out.println("Introduce la tercera nota:");
		a = entrada.nextInt()+a;
		a=a/3;
		System.out.println("La media de las notas es:"+a);
	}

}
