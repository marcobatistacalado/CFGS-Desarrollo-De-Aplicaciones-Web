package Hoja5;
import java.util.*;
public class ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int usar = 1;
		
		while (true) {
			System.out.println("Introduce 1 si quieres usar la calculadora: ");
			usar = sc.nextInt();
			if (usar != 1) {
				break;
			}
			System.out.println("Introduce un numero: ");
			int num1 = sc.nextInt();
			System.out.println("Introduce un numero");
			int num2 = sc.nextInt();
			System.out.println("Introduce la operación 1-suma, 2-resta, 3-producto, 4-division: ");
			int op = sc.nextInt();
			
			switch (op) {
			case 1:
				op = num1 + num2;
				break;
			case 2:
				op = num1 - num2;
				break;
			case 3:
				op = num1 * num2;
				break;
			case 4:
				op = num1 / num2;
				break;
				
			}
			System.out.println("Resultado: "+op);
		}
	}

}
