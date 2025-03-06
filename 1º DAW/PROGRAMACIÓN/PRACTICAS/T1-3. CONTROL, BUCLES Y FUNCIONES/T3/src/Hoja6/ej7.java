package Hoja6;
import java.util.*;
public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int num = sc.nextInt(), contador = 0;
		if (num == 0) {
			System.out.println("Tiene una cifra");
		}else {
			while (num != 0) {
				num = num/10;
				contador++;
			}
			System.out.println("Numero cifras: "+contador);
		}
		
	}

}
