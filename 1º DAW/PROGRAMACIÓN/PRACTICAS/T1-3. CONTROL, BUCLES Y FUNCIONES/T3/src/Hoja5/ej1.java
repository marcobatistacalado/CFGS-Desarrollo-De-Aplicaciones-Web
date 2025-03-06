package Hoja5;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n1 = 1;
		System.out.println("Introduce un número:");
		n1 = sc.nextInt();
		while (n1>=0) {
			
			n1 = n1 * n1;
			System.out.println("Su cuadrado es: "+n1);
			System.out.println("Introduce un número:");
			n1 = sc.nextInt();
		}

	}

}
