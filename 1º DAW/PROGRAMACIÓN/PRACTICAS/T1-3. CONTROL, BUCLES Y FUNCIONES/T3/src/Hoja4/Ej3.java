package Hoja4;
import java.util.*;
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce num1:");
		int num1 = sc.nextInt();
		System.out.println("Introduce num2:");
		int num2 = sc.nextInt();
		System.out.println("Introduce num3:");
		int num3 = sc.nextInt();
		
		System.out.println("Introduce (A) ascendente o (D) descendente:");
		sc.nextLine();
		char sel = sc.nextLine().charAt(num3);
		
		if (sel == 'A' || sel == 'a') {
			if (num1>num2) {
				if (num1>3) {
					System.out.println(num1);
				}else {
					System.out.println(num3);
					System.out.println(num2);
				}
				
			}else if (num2>num3) {
				
			}
		}else if (sel == 'B' || sel == 'b') {
			
		}
	}

}
