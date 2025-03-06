package hoja7;
import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dec;
		do {
			int dia, mes, ano, maximodias;
			
			//PREGUNTAR DIAS, MES Y AÑO HASTA QUE LA FECHA SEA VALIDA
			do {
				System.out.println("INTRODUCE FECHA CORRECTA:");
				System.out.println("Introduce día: ");
				dia = sc.nextInt();
				System.out.println("Introduce mes: ");
				mes = sc.nextInt();
				System.out.println("Introduce año: ");
				ano = sc.nextInt();
				maximodias=diasMes(mes,ano);//LLAMADA A FUNCION QUE CALCULA LOS DIAS QUE TIENE ESE MES;
			}while(validarFecha(dia,mes,ano,maximodias)==false);//LLAMADA A FUNCION QUE VALIDA
			
			//BUCLE QUE VA MES POR MES LLAMANDO A LA FUNCION DE CALCULO DE DIAS DEL MES PARA IR SUMANDO ESOS DIAS
			int dias = 0;
			for (int i = 1; i < mes; i++) {
				dias = dias + diasMes(i,ano);
			}
			//SUMAR LOS DIAS TRANSCURRIDOS DE EL MES EN EL QUE ESTAMOS.
			dias = dias + dia;
			System.out.println("DIAS: "+dias);
			
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
	
	public static boolean validarFecha(int dia, int mes, int ano, int maxdia) {
		if (dia >= 0 && dia <= maxdia) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int calcularBisiesto(int ano) {
		if ((ano%4 == 0 && ano % 100 != 0) || (ano%400 == 0)){
			return 29;
		}else {
			return 28;
		}
		
	}

}
