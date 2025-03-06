package hoja7;
import java.util.*;
public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dec;
		do {
			System.out.println("Introduce dia: ");
			System.out.println("Introduce mes: ");
			System.out.println("Introduce año: ");
			int dia = sc.nextInt(), mes = sc.nextInt(), ano = sc.nextInt();
			int total = luckynumber(dia, mes, ano);
			System.out.println("Luckynumber---"+total);
			System.out.println("Introduce 0 si no quieres continuar");
			dec = sc.nextInt();
		}while(dec!=0);
	}

	private static int luckynumber(int dia, int mes, int ano) {
		int suma = dia+mes+ano;
		int total = 0, contador = 0, resto = 1;
		while (true) {
			if (suma == 0) {
				break;
			}
			resto = suma % 10;
			System.out.println(resto);
			suma = suma / 10;
			total = resto + total;
			
		}
		if (total > 9) {
			total = (total%10)+(total/10);
		}
		return total;
	}

}
