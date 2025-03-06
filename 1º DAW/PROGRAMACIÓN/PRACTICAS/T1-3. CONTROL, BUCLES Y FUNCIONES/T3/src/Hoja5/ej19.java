package Hoja5;
import java.util.*;
public class ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int num1 = sc.nextInt(); 
		System.out.println("Introduce un numero");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			while ((num1+1) != num2) {
				num1 = num1 - 1;
				System.out.println(num1);
			}
		}else {
			while (num1 != (num2+1)) {
				num2 = num2 - 1;
				
				System.out.println(num2);
			}
		}
	}

}
