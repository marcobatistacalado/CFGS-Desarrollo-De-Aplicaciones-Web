package hoja7;
import java.util.*;
public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dec;
		do {	
			int num, contador = 1, dias = 0, maxdias;
			do {
				System.out.println("Introduce numero: ");
				num = sc.nextInt();
			}while (num<0 || num>365);
			
			while (true) {
				maxdias = diasMes (contador, 2023);
				dias = dias + maxdias;
				if (num<dias) {
					dias = dias - maxdias;
					break;
				}
				
				contador++;
			}
			num = num - dias;
			System.out.println(num+" DEL MES: "+contador);
		
			System.out.println("Introduce 0 si no quieres continuar:");
			dec = sc.nextInt();
			
		}while(dec!=0);
	}
	
	public static int diasMes( int mes,int ano) {
		int maxdia;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			maxdia = 30;
			break;
		case 2:
			maxdia = calcularBisiesto(ano);
			break;
			
		default:
			maxdia = 31;
			break;
			
		}
		return maxdia;
		
	}
	public static int calcularBisiesto(int ano) {
		if ((ano%4 == 0 && ano % 100 != 0) || (ano%400 == 0)){
			return 29;
		}else {
			return 28;
		}
		
	}

}
