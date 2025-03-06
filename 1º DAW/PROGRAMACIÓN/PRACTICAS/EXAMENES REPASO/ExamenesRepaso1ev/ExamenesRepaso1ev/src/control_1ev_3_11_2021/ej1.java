package control_1ev_3_11_2021;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int viajeros = 0, aforomax = 5, bajan = 0, suben = 0, total = 0, no= 0, pasajerost = 0;
		char billete;
		double recaudado = 0;
		do {
			for (int paradas = 1;paradas<=4; paradas++) {
				System.out.println("PARADA -- "+paradas);
				if (paradas != 1 && paradas != 4) {
					do {
						System.out.println("PERSONAS BAJAN: ");
						bajan = sc.nextInt();
					}while (bajan>total);
					total = total - bajan;
					
					System.out.println("AFORO: "+total);
				}
				if (paradas == 4) {
					total = 0;
				}
				if (paradas != 4) {
					System.out.println("PERSONAS SUBEN: ");
					suben = sc.nextInt();
					if (suben+total>aforomax) {
						suben = aforomax-total;
						total = total + suben;
						System.out.println("SOLO PUEDEN SUBIR: "+suben);
					}else {
						total = total + suben;
					}
					if (bajan == 0 && suben == 0) {
						no++;
					}
					pasajerost=pasajerost+suben;
					sc.nextLine();
					for (int i = 1;i<=suben;i++) {
						do {
							System.out.println("Introduce billete "+i);
							billete = sc.nextLine().charAt(0);
							billete = Character.toUpperCase(billete);
						}while(validarBillete(billete)==false);
						recaudado = recaudado+redTotal(billete);
					}
				}
				System.out.println("AFORO: "+total);
				System.out.println();
			}
		}while(recaudado<30 && pasajerost<=20);
		System.out.println("CUANTAS PARADAS NO HA BAJADO NI SUBIDO NADIE: "+no);
		System.out.println("TOTAL RECAUDADO: "+recaudado+"€");
	}
	public static boolean validarBillete (char billete) {
		switch (billete) {
		case 'A','B','C':
			return true;	
		default:
			return false;
		}
	}
	public static double redTotal(char billete) {
		double dinero = 0;
		switch (billete) {
		case 'A':
			dinero = 1;
			break;
		case 'B':
			dinero = 1.2;
			break;
		case 'C':
			dinero = 1.5;
			break;
		}
		return dinero;
	}

}
