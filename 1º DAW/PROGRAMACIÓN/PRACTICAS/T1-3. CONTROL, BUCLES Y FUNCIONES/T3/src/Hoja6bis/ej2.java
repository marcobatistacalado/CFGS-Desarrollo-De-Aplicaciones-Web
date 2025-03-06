package Hoja6bis;
import java.util.*;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		char letra = ' ', letrant = ' ', letramax = ' ';

		int contadoractual = 0, contadormax= 1;

		

		while (true) {

			System.out.println("Introduce una letra;");

			letra = sc.nextLine().charAt(0);

			

			if (letra == '$') {

				break;

			}

			if (letra == letrant) {

				contadoractual++;

				if (contadoractual > contadormax) {

					contadormax = contadoractual;

					letramax = letra;

				}

			}else {

				contadoractual = 0;

				contadoractual++;

				letrant=letra;

			}

			

		}
			
		
		System.out.println("Letra: "+letramax);
		System.out.println("Numero de veces: "+contadormax);
		
	}

}
