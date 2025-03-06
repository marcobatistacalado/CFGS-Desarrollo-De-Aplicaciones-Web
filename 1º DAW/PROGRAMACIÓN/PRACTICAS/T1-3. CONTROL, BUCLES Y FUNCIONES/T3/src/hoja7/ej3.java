package hoja7;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("introduce numero");
			int num = sc.nextInt();
			if (num < 0) {
				break;
			}
			num = calcularFactorial(num);
			System.out.println("nº factorial: "+num);
			
		}
	}
	public static int calcularFactorial (int num) {
		int fact = num;
		num--;
		for (;num>1;num--) {
			fact = fact * num;
		}
		return fact;
	}

}
