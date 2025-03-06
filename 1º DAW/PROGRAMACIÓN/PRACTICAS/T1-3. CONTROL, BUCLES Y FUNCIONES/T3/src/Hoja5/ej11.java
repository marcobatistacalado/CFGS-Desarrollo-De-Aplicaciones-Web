package Hoja5;
import java.util.*;
public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = 10, par = 0, impar = 0, nulo = 0, num = 0;
		
		while (n>=1) {
			System.out.println("Introduce un numero:");
			num = sc.nextInt();
			if (num == 0) {
				nulo = nulo + 1;
			}else if (num%2 != 0){
				impar = impar + 1;
			}else if (num%2 == 0){
				par = par + 1;
			}
			n = n - 1;
		}
		System.out.println("Numeros pares: "+par);
		System.out.println("Numeros impar: "+impar);
		System.out.println("Numeros nulos: "+nulo);
	}

}
