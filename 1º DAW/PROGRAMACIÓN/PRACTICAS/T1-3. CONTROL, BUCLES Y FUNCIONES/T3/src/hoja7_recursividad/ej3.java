package hoja7_recursividad;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		int fibo = fibonacci (num);
		System.out.println(fibo);
	}
	public static int fibonacci (int num) {
		if (num==0) {
			return 0;
		}else if (num==1) {
			return 1;
		}else {
			return fibonacci(num-2)+fibonacci(num-1);
		}
	}

}
