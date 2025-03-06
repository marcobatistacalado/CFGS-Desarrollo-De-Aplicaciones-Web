package Hoja5;
import java.util.*;
public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i = 27, c = 0, nota = 0;
		
		while (i>0) {
			System.out.println("Introduce una nota:");
			nota = sc.nextInt();
			if (nota >= 5) {
				c = c + 1;
			}
			i = i - 1;
		}
		System.out.println("El total de aprobados es:"+c);
		
	}

}
