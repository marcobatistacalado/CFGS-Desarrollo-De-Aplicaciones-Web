package Hoja5;
import java.util.*;
public class ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i = 5, num2 = 0;	
		
		while (i>=1) {
			System.out.println("Introduce un numero");
			int num = sc.nextInt();
			if (num > num2) {
				num2 = num;
			}
			i = i - 1;
		}
		System.out.println("Numero mayor: "+num2);
	}

}
