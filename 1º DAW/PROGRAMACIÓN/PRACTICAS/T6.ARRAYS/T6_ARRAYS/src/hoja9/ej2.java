package hoja9;
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numeros[] = new int [5];
		int num;
		for (int i = 0; i<5; i++) {
			do {
				System.out.println("Numero:");
				num = sc.nextInt();
			}while(num<0);
			numeros[i] = num;
		}
		int calculo;
		for (int i=0;i<5;i++) {
			calculo = numeros[i]*numeros[i];
			System.out.println(calculo);
		}
		
	}

}
