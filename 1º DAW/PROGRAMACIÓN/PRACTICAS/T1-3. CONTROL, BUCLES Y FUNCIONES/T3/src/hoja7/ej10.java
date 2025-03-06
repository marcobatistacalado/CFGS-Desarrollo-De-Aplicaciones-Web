package hoja7;
import java.util.*;
public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dec;
		do {
			int num;
			do {
				System.out.println("Introduce un numero de 3 cifras");
				num = sc.nextInt();
			}while (calcularCifras(num) != 3);
			int amstrong = calcularAmstrong(num);
			if (amstrong == num) {
				System.out.println("Es un numero Amstrong");
			}else {
				System.out.println("No es un numero Amstrong");
			}
			System.out.println("Introduce  0 si no quieres continuar");
			dec = sc.nextInt();
		}while(dec!=0);
	}
	public static int calcularCifras (int num) {
		int contador =0;
		while (num!=0) {
			num = num/10;
			contador++;
		}
		return contador;
	}
	public static int calcularAmstrong(int num) {
		int div = num, resto = 0;
		while (true) {
			resto = (int) (resto + Math.pow((div % 10),3));
			div = div / 10;
			if (div == 0) {
				break;
			}
			
		}
		return resto;
	}
}
