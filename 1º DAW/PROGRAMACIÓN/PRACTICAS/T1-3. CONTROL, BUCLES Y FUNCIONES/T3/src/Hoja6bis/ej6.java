package Hoja6bis;
import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		 System.out.println("Introduce un número:");
	        int n1 = sc.nextInt();

	        for (int i = 2; i <= n1; i++) {
	            int contador = 0;

	            for (int b = 2; b < i; b++) {
	                if (i % b == 0) {
	                    contador++;
	                    break;
	                }
	            }

	            if (contador == 0) {
	                System.out.println("NÚMERO PRIMO: " + i);
	            }
	        }
	
		
		
	
	}

}
