package Hoja6bis;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce numero:");
		int num = sc.nextInt(), resto; 
		while (true) {
			if (num == 0) {
				break;
			}
			resto = num % 10;
			System.out.print(resto);
			num = num / 10;
			
		}
	}

}
