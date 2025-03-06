package Hoja6;
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num0 = 0, suma = 0;
		while (true) {
			System.out.println("Introduce un numero:");
			int num = sc.nextInt();
			suma = suma + num;
			if (num == 0) {
				num0= num0 + 1;
			}
			if (suma > 100) {
				break;
			}
		}
		System.out.println("El numero de 0 es: "+num0+" y la suma es: "+suma);
		
	}

}
