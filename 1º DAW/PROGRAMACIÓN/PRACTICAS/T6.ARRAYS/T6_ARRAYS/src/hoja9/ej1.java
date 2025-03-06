package hoja9;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numeros[] = new int[10];
		
		for (int i = 0; i<10; i++) {
			System.out.println("Mete numero:");
			numeros[i] = sc.nextInt();
		}
		
		int num2;
		for (int i = 0; i<numeros.length; i++) {
			num2 = numeros[i];
			if (num2%2==0) {
			System.out.println(num2);
			}
		}
		for (int i = 0; i<numeros.length; i++) {
			num2 = numeros[i];
			if (num2%2!=0) {
			System.out.println(num2);
			}
		}
		
		
	}

}
