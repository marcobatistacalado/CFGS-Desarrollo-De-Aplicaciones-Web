package control_1ev_24_11_2021;

import java.util.*;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Patinete p1 = new Patinete(1);
		Patinete p2 = new Patinete(101);

		p1.cargarBateria();
		p2.cargarBateria();

		System.out.println(p1.toString());
		System.out.println(p2.toString());

		int num, km, cont = 1;
		while (cont == 1) {
			do {
				System.out.println("Que patinete?");
				num = sc.nextInt();
				System.out.println("Km:");
				km = sc.nextInt();
			} while ((num != 1 && num != 2) || km < 0);
			double imp;
			if (num == 1) {
				System.out.println("Cargar bateria:");
				int bateria = sc.nextInt();
				if (bateria == 1) {
					p1.cargarBateria();
				}
				imp = p1.alquilar(km);
			} else {
				System.out.println("Cargar bateria:");
				int bateria = sc.nextInt();
				if (bateria == 1) {
					p2.cargarBateria();
				}
				imp = p2.alquilar(km);
			}
			if (imp == -1) {
				System.out.println("No se ha podido alquilar por bateria baja");
			} else {
				System.out.println("Importe: " + imp);
			}
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println("¿quieres continuar 1?");
			cont = sc.nextInt();
		}
		System.out.println("Nº patinetes baja carga: " + Patinete.getBajoC());
		System.out.println("Nº alquileres: " + Patinete.getTalq());
	}

}
