package Hoja5;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		int n1 = sc.nextInt();
		
		while (n1 != 0) {
			if (n1%2 == 0) {
				System.out.println("Par");
			}else {
				System.out.println("Impar");
			}
			System.out.println("Introduce un número:");
			n1 = sc.nextInt();
		}
	}

}
