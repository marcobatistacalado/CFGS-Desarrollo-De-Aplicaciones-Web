package Hoja2;
import java.util.*;
public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce la primera variable a : ");
		int a = entrada.nextInt();
		System.out.println("Introduce la segunda variable b: ");
		int b = entrada.nextInt();
		int x;
		x=a;
		a=b;
		b=x;
		System.out.println("La a es "+a);
		System.out.println("La b es "+b);
	}

}
