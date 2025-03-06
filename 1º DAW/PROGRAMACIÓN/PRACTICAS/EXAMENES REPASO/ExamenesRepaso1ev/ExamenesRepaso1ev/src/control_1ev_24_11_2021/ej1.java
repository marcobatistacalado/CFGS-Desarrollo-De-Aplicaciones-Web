package control_1ev_24_11_2021;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		char respuesta = 'S';

		String secuencia = "IN";

		int vendidost = 0, ee = 0, contadorIN = 0, contadorEX=0;

		double eet=0;

		buclesalir:

		while(respuesta=='S') {

			String cod;

			int ano = 0, salario = 0;

			do {

				System.out.println("Introduce COD empleado: ");

				cod = sc.nextLine();

				cod = cod.toUpperCase();

				if (cod.equals("FIN")) {

					break buclesalir;

				}

			}while (validarCod(cod) == false);

			if (cod.startsWith("IN")) {

				

				contadorIN++;

				if(contadorIN>contadorEX) {

					contadorEX=0;

				}

			}else {

				contadorEX++;

				if (contadorEX>contadorIN) {

					contadorIN = 0;

				}

				

			}

			if (cod.startsWith("IN")) {

				do{

					System.out.println("Año entrada");

					ano = sc.nextInt();

				}while(ano>=2023);

				do {

					System.out.println("Introduce salario actual:");

					salario = sc.nextInt();

				}while(salario<15000 || salario>20000);

			}

			int vendidos;

			do {

				System.out.println("Introduce el nº de electrodomesticos vendidos:");

				vendidos = sc.nextInt();

			}while(vendidos<=0);

			ee = 0;

			do {

				System.out.println("Introduce el nº de electro. EE:");

				ee = sc.nextInt();

			}while(ee>vendidos);

			

			if (vendidos>5) {

				calcularBoni(vendidos, ee,cod,salario,ano);

			}else {

				System.out.println("No tienes derecho a bonificación");

			}

			System.out.println("¿Si quieres seguir con más empleados introduce: 'S'");

			sc.nextLine();

			respuesta = sc.nextLine().charAt(0);

			respuesta = Character.toUpperCase(respuesta);

			eet=eet+ee;//porcentaje vendidos;

			vendidost=vendidost+vendidos;

		}

		//porcentaje

		eet = (eet*100)/vendidost;

		System.out.println("PORCENTAJE EE VENDIDOS: "+eet+"%");

		if (contadorIN>contadorEX){

			System.out.println("MAYOR SECUENCIA TIPO IN: "+contadorIN);

		}else if (contadorEX>contadorIN){

			System.out.println("MAYOR SECUENCIA TIPO EX: "+contadorEX);

		}else {

			System.err.println("EMPATE DE SECUENCIAS");

		}

		

	}

	public static boolean validarCod (String cod) {

		int tamañocod = cod.length();

		if (tamañocod < 4 || tamañocod > 8) {

			return false;

		}

		if (!cod.startsWith("EX") && !cod.startsWith("IN")){

			return false;

		}

		/*CON CONDICIONES

		 * char letra1 = cod.charAt(0);

		char letra2 = cod.charAt(1);

		//correcto

		(letra1=='E' && letra2=='X') || (letra1=='I' && letra2=='N')

		//negarlo

		(letra1!='E' || letra2!='X') && (letra1!='I' || letra2!='N'))

		*/

		for (int i = 2; i < cod.length()-1; i++) {

			char num = cod.charAt(i);

			if (num < '0' || num > '9') {

				return false;

			}

		}

		return true;

	}

	public static double calcularBoni (int vendidos, int ee, String cod, int salario, int ano ) {

		double total = ((vendidos-ee)*5) + (ee*12);

		System.out.println("RECIBES:"+total+"€");

		if (cod.startsWith("IN")) {

			ano = (2023 - ano)-5;

			if (ano>=3) {

				ano = ano/3;

				total = total + (salario*ano*0.1);

				System.out.println("Se le añade una bonififcacion de: "+(salario*ano*0.1)+"€");

				System.out.println("Se queda en: "+total+"€");

			}

		}

		return total;

	}
}
