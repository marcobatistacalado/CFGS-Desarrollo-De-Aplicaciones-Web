package control_1ev_24_11_2022;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Cabina cabina1 = new Cabina (111);
		Cabina cabina2 = new Cabina (222);
		int cabina, vueltas = 0;
		char tipo;
		
		do {
			do {
				System.out.println("Introduce el numCabin:");
				cabina = sc.nextInt();
			}while (cabina!=1 && cabina!=2);
			
			int cond;
			if (cabina == 1) {
				do {
					System.out.println("1. Abrir");
					System.out.println("2. Cerrar");
					cond = sc.nextInt();
				}while (cond != 1 && cond != 2);
				if (cond == 1) {
					cabina1.setInd(true);//abrir
					System.out.println("Abierto...");
				}else {
					cabina1.setInd(false);//cerrar
					System.out.println("Cerrado...");
				}
				
				System.out.println("Numero km:");
				double kilometros = sc.nextDouble();
				sc.nextLine();
				do {
					System.out.println("Introduce el tipo de vehiculo: ");
					tipo = sc.nextLine().charAt(0);
					tipo = Character.toUpperCase(tipo);
				}while (tipo!='A'&&tipo!='M'&&tipo!='C');
				double precio = cabina1.pagarVehículo(kilometros, tipo);
				if (precio ==-1) {
					System.out.println("No se puede porque esta cerrada");
				}else {
					System.out.println("Importe: "+precio);
				}
			}else {
				do {
					System.out.println("1. Abrir");
					System.out.println("2. Cerrar");
					cond = sc.nextInt();
				}while (cond != 1 && cond != 2);
				if (cond == 1) {
					cabina2.setInd(true);//abrir
					System.out.println("Abierto...");
				}else {
					cabina2.setInd(false);//cerrar
					System.out.println("Cerrado...");
				}
				System.out.println("Numero km:");
				double kilometros = sc.nextDouble();
				sc.nextLine();
				do {
					System.out.println("Introduce el tipo de vehiculo: ");
					tipo = sc.nextLine().charAt(0);
					tipo = Character.toUpperCase(tipo);
				}while (tipo!='A'&&tipo!='M'&&tipo!='C');
				double precio = cabina2.pagarVehículo(kilometros, tipo);
				if (precio ==-1) {
					System.out.println("No se puede porque esta cerrada");
				}else {
					System.out.println("Importe: "+precio);
				}
			}
			System.out.println("Cabina1: "+cabina1.toString());
			System.out.println("Cabina2: "+cabina2.toString());
			System.out.println("Nº cabinas abiertas: "+Cabina.getAbierto());
			System.out.println("Nº de la cabina con mas trafico TIPO A: "+Cabina.mayorTrafico(cabina1, cabina2, 'A'));
			System.out.println("Nº de la cabina con mas trafico: TIPO C: "+Cabina.mayorTrafico(cabina1, cabina2, 'C'));
			System.out.println("Nº de la cabina con mas trafico: TIPO M: "+Cabina.mayorTrafico(cabina1, cabina2, 'M'));
			
			System.out.println("Si no quieres continuar = 1: ");
			vueltas =  sc.nextInt();
		}while (vueltas!=1);
	}

}
