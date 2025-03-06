package Hoja5;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		int N = sc.nextInt();
		System.out.println("Introduce el número para acertar:");
		int n1 = sc.nextInt();
		
		while (n1 != N) { 
			if (n1<N) {
				System.out.println("Es un número mayor");
			}else {
				System.out.println("Es un número menor");
			}
			System.out.println("Introduce el número para acertar:");
			n1 = sc.nextInt();
		}
		System.out.println("GENIAL, has acertado");
		
		
	}

}
