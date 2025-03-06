package hoja7;
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("Introduce numero");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			num = calcularCifras(num);
			System.out.println(num);
		}
		
		
	}
	public static int calcularCifras (int num) {
		int contador =0;
		while (num!=0) {
			num = num/10;
			contador++;
		}
		return contador;
	}

}
