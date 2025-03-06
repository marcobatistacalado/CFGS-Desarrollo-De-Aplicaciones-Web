package control_1ev_24_11_2022;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int totalbebidas = 0;
		double ganancias = 0, minganancias = 100000;
		int noche = 1;
		while (true) {
		int maxcomensales  = 80, preserva = 0, reservas = 0, tbarral = 0, tcopas2 = 0, tbebidas = 0;
			while (maxcomensales != 0 && preserva != -1) {
				do {
					System.out.println("Introduce el número de personas para cenar:");
					preserva = sc.nextInt();
				}while (preserva==0 || preserva < -1 || preserva>maxcomensales);
					if (preserva == -1 ) {
						break;
					}
					maxcomensales = maxcomensales - preserva;
					char menu;
					sc.nextLine();
					do {
						System.out.println("Selecciona un menú: ");
						System.out.println("A - Económico");
						System.out.println("B - Degustación");
						System.out.println("C - Estrella");
						menu = sc.nextLine().charAt(0);
						menu = Character.toUpperCase(menu);
					}while(validarMenu(menu) == false);
					int copas2,barral;
					do {
						System.out.println("¿Cuántas personas quieren 2 copas por 9€?");
						copas2 = sc.nextInt();
						System.out.println("¿Cuántas personas quieren barra libe x 30€?");
						barral = sc.nextInt();
					}while ((copas2+barral)>preserva);	
					System.out.println("¿Tienes carnet socio?");
					sc.nextLine();
					char socio = sc.nextLine().charAt(0);
					socio = Character.toUpperCase(socio);
					String carnet = "no";
					if (socio == 'S') {
						do {
						System.out.println("Introduce carnet: ");
						carnet = sc.nextLine();
						}while (validarCarnet (carnet) == false);
					}
					double precio = calcular_precio (preserva, menu, copas2, barral, carnet);
					System.out.println("El precio total es: "+precio);
					System.out.println("Confirmas reserva (S)");
					char confirmas = sc.nextLine().charAt(0);
					confirmas = Character.toUpperCase(confirmas);
					if (confirmas == 'S') {
						ganancias = ganancias + precio;
						reservas++;
						tbarral = barral + tbarral;
						tcopas2 = tcopas2 + copas2;
						tbebidas = preserva-(tbarral+tcopas2);
					}
			}
			totalbebidas = tbebidas + totalbebidas;
			System.out.println("NOCHE"+noche);
			System.out.println("GANANCIAS: "+ganancias);
			System.out.println("RESERVAS: "+reservas);
			System.out.println("PORCENTAJE BARRA LIBRE: "+ (tbarral*100)/(80-maxcomensales) + "%");
			if (ganancias < minganancias) {
				minganancias = ganancias;
			}
			System.out.println("¿Quieres otra noche?");
			sc.nextLine();
			char otra = sc.nextLine().charAt(0);
			otra = Character.toUpperCase(otra);
			if (otra != 'S') {
				System.out.println("Se acabo");
				System.out.println("MENOR RECAUDACION: "+minganancias);
				System.out.println("TOTAL PERSONAS SIN BEBIDA: "+totalbebidas);
				break;
			}
			preserva = 0;
			maxcomensales = 80;
			noche++;
			
		}
		
		
		
	}
	public static boolean validarMenu (char menu) {
		switch (menu) {
			case 'A', 'B', 'C':
				return true;
			default:
				System.out.println("No has introducido menu correcto");
				return false;
		}
	}
	public static double calcular_precio (int preserva, char menu, int copas2, int barral, String carnet) {
		int preciom = 0;
		switch (menu) {
			case 'A':
				preciom = 25;
				break;
			case 'B':
				preciom = 35;
				break;
			case 'C':
				preciom = 50;
				break;
		}
		double total = (preserva*preciom)+(copas2*9)+(barral*30);
		if (carnet != "no") {
			total = total - (total*0.2);
		}
		return total;
	
	}
	public static boolean validarCarnet (String carnet) {
		if (carnet.length() != 4 && carnet.length() != 5) {
			return false;
		}
		int letra1 =carnet.charAt(0);
		if (letra1 <'A' || letra1 >'Z') {
			return false;
		}
		for (int i = 1; i < carnet.length() - 1; i++) {
			char b = carnet.charAt(i);
			
			if (b < '0' || b >'9') {
				return false;
			}
		}
		return true;
	}

}
