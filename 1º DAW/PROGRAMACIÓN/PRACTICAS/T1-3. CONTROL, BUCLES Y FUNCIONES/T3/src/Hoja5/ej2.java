package Hoja5;
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		int n1 = sc.nextInt();
		
		while (n1 != 0) {
			if (n1>0) {
				System.out.println("Positivo");
			}else {
				System.out.println("Negativo");
			}
			System.out.println("Introduce un número:");
			n1 = sc.nextInt();
		}
	}

}
