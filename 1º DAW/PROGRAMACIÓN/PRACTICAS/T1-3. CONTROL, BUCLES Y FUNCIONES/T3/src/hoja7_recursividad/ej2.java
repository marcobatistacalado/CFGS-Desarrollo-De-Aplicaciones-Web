package hoja7_recursividad;
import java.util.Scanner;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		System.out.println("Introduce el exponente:");
		int exp = sc.nextInt();
		double pot = potencia (num,exp);
		System.out.println();
	}
	public static double potencia ( int num, int exp) {
		if (exp == 0) {
			return 1;
		}else {
			return num * potencia (num, exp - 1);
		}
	}

}
