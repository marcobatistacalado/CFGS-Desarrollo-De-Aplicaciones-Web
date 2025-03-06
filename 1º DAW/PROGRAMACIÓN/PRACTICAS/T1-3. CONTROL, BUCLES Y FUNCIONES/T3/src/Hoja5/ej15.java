package Hoja5;
import java.util.*;
public class ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		int num = sc.nextInt(), c = 1, mul = 1;
		if (num < 0 || num > 10) {
			System.out.println("Número no válido");
		}
		while (c <= 10) {
			mul = c* num;
			System.out.println(num+" x "+c+" = "+mul);
			c = c + 1;
		}
	}

}
