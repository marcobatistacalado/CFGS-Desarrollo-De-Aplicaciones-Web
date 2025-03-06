package Hoja2;
import java.util.*;
public class Ejer9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int a,b, suma, resta, producto, modulo;
		System.out.println("Introduce a = ");
		a = entrada.nextInt();
		System.out.println("Introudce b = ");
		b = entrada.nextInt();
		suma = a + b;
		resta = a - b;
		producto = a * b;
		modulo = a % b;
		System.out.println("La suma es: "+suma);
		System.out.println("La suma es: "+resta);
		System.out.println("La suma es: "+producto);
		System.out.println("La suma es: "+modulo);
	}

}
