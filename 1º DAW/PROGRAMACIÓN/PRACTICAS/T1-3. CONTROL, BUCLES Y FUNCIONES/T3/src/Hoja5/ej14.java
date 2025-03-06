package Hoja5;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número:");
		int num = sc.nextInt();
		
		while (num != 0) {
			num = num - 1;
			if (num%2 == 0) {
				System.out.println(num);
			}
			
		}
	}

}
