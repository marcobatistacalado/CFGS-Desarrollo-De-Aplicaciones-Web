package Hoja5;
import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n1 = 1, s = 0;
		while (n1 != 0) {
			System.out.println("Introduce un número:");
			n1 = sc.nextInt();
			s = s+n1;
		}
		System.out.println("La suma total es: "+s);
		
	}

}
