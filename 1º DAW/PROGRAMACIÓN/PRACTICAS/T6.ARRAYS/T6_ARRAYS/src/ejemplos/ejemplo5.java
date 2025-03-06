package ejemplos;

import java.util.Scanner;

public class ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String meses [] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto","septiembre","octubre","noviembre","diciembre"};
		Scanner sc = new Scanner (System.in);
		int dia, mes, ano;
		do {
			System.out.println("Dia");
			dia = sc.nextInt();
		}while(dia < 1 || dia>31);
		do {
			System.out.println("Mes");
			mes = sc.nextInt();
		}while(mes < 1 || mes>12);
		do {
			System.out.println("ano");
			ano = sc.nextInt();
		}while(ano<1000 || ano > 9999);
		
		System.out.println(dia+" de "+ meses[mes-1]+ " de "+ano);
	}

}
