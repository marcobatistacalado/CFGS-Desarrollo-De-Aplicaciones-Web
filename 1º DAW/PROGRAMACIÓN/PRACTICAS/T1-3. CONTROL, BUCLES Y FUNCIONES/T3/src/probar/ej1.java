package probar;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		/*int num1 = 0, num2 = 0, contador = -1;
		
		while (num1>=num2) {
			if (num1 == num2) {
				contador++;
			}else {
				num2 = num1;
			}
			System.out.println("Num1:");
			num1 = sc.nextInt();
		}
		
		System.out.println("Contador: "+contador);*/
		
		//MEJORADO
		int contador = 0;
		System.out.println("num:");
		int num1 = sc.nextInt(), num2 = 0;
		while (num1>=num2) {
			if (num1 == num2) {
				contador++;
			}else {
				num2 = num1;
			}
			System.out.println("num:");
			num1 = sc.nextInt();
		}
		System.out.println("Contador: "+contador);
	}

}
