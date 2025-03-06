package hoja7_recursividad;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println(fact);
	}
	public static int factorial (int num) {
		if (num==0) {
			return 1;
		}else {
			return num * factorial (num-1);
		}
	}

}
