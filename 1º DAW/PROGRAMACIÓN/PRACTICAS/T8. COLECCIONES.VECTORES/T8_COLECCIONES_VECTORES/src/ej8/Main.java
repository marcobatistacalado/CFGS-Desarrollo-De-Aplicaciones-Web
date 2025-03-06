package ej8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Normal> cabinas = new ArrayList<Normal>();
		for (int i = 0; i < 8; i++) {
			int ranNumber = (int) (Math.random() * 2) + 1;
			if (ranNumber == 1) {
				cabinas.add(new Normal());
			} else {
				cabinas.add(new Abonado());
			}
		}
		System.out.println(cabinas);
		int menu = 0;

		while (menu != 10) {
			System.out.println("MENU----------------");
			System.out.println("1) Abrir cabina.");
			System.out.println("2) Entrar en la cola");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				int numCabina = 0;
				do {
					System.out.println("Numero cabina: 0-7");
					numCabina = sc.nextInt();
				} while (numCabina < 0 || numCabina > 7);
				cabinas.get(numCabina).abrirCabina();
				break;
			case 2:
				System.out.println("Matricula: ");
				String mat = sc.nextLine();
				try {
					tipoCorrecto(sc);
					//ME HE QUEDADO AQUI
				} catch (tipoClienteIncorrecto e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			}
		}
	}

	private static void tipoCorrecto(Scanner sc) throws tipoClienteIncorrecto {
		String tipo;
		System.out.println("Tipo cliente Abonado/Normal");
		tipo = sc.nextLine();
		if (!tipo.equals("Abonado") && !tipo.equals("Normal")) {
			throw new tipoClienteIncorrecto("Cliente incorrecto.");
		}

	}

}
