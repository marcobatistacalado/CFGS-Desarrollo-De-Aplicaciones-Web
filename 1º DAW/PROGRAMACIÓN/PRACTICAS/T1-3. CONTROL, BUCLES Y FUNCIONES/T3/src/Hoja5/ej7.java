package Hoja5;
import java.util.*;
public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int n1 = sc.nextInt();
		int s = 0, m = 0;
		
		while (n1 > 0) {
			s = s + n1;
			m = m + 1;
			System.out.println("Introduce un numero:");
			n1 = sc.nextInt();
			
		}
		m = s / m;
		System.out.println("La media es:"+m);
	}

}
