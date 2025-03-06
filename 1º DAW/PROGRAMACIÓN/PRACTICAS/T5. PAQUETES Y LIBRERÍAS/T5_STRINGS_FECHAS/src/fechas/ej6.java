package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Parking parking [] = new Parking [5];
		int nPlazasOcupadas = 0;
		String matricula;
		LocalDateTime llegada;
		int opc, numPlaza;
		long precio;
		double ganancias;
		while (true) {
			System.out.println("1. Entrar");
			System.out.println("2. Salir");
			System.out.println("3. Mostrar recaudacion");
			opc = sc.nextInt();
			sc.nextLine();
			switch (opc) {
			case 1:
				if (nPlazasOcupadas != parking.length) {
					System.out.println("Libre");
					System.out.println("Introduce matricula: ");
					matricula = sc.nextLine();
					
					for (int i = 0; i<parking.length; i++) {
						if (parking [i] == null) {
							parking[i] = new Parking(matricula);
							nPlazasOcupadas++;
						}
					}
					
				}else {
					System.out.println("No se puede aparcar");
				}
				break;
			case 2:
				do {
					do {
						System.out.println("Anota num plaza 1-5: ");
						numPlaza = sc.nextInt();
					}while(numPlaza < 0 || numPlaza > 5);
					numPlaza -=1;
					if(parking[numPlaza]==null){
						System.out.println("No está ocupada esa plaza");
					}
				}while(parking[numPlaza]==null);
				precio = parking[numPlaza].setGanancias();
				System.out.println("Debe pagar "+precio+" céntimos");
				parking[numPlaza]=null;
				nPlazasOcupadas--;
				sc.nextLine();
				
				break;
			case 3:
				ganancias = Parking.getGanancias();
				System.out.println("Ganancias totales: "+ganancias+" céntimos");
				break;
			}
			
		}
	}

}
