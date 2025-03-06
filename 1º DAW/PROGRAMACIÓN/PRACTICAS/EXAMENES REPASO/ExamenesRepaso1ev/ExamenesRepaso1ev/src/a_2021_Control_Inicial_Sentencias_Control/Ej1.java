package a_2021_Control_Inicial_Sentencias_Control;
import java.util.*;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Anota el tipo de carburante: G/g (gasolina), D/d (diésel), B/b (biodiesel):");
		char carb = sc.nextLine().charAt(0), deposito;
		double desc = 0, litros, imp, precio = 0;
		
		switch (carb) {
		case 'G':
		case 'g':
			precio = 1.52;
			desc = 0.05;
			break;
		case 'D':
		case 'd':
			precio = 1.38;
			desc = 0.1;
			break;
		case 'B':
		case 'b':
			precio = 1.71;
			desc = 0.1;
			break;
		
		default:
			System.out.println("Error no has seleccionado el tipo de carburante correcto.");
			System.exit(0);
		}
		
		System.out.println("Introduce L/l (llenar deposito) e I/i si quieres un importe concreto:");
		deposito = sc.nextLine().charAt(0);
		if (deposito == 'L' || deposito == 'l') {
			System.out.println("Introduce el número de litros:");
			litros = sc.nextDouble();
			if (litros > 20) {
				desc = 0.15;
			}
			precio = precio * litros - (precio*litros*desc);
		}else if (deposito == 'I' || deposito == 'i'){
			int i = 0;
			while (i == 0) {
				System.out.println("Introduce el importe a repostar (10,15,25,30):");
				imp = sc.nextDouble();
				if (imp%5 == 0 && imp >= 10 ) {
					i = 1;
					litros = imp / precio;
					System.out.println("Número de litros a repostar:"+litros);
					if (litros > 20) {
						desc = 0.15;
					}
					precio = precio * litros - (precio*litros*desc);
				}
				else {
					System.out.println("No has introducio un importe válido");
				}
			}
		}else {
			System.out.println("Has introducido un caracter incorrecto");
			System.exit(0);
		}
		System.out.println("El precio total es:"+precio+"€");
		
		System.out.println("Introduce el importe:");
		double bill = sc.nextDouble();
		precio = bill - precio; //vueltas
		System.out.println("Las vueltas son: "+precio+"€");
		
		bill = (int)(precio / 20);
		System.out.println("Billetes de 20€:"+bill);
		precio = precio%20;
		bill = (int) (precio / 10);
		System.out.println("Billetes de 10€:"+bill);
		precio = precio%10;
		bill = (int) (precio / 5);
		System.out.println("Billetes de 5€:"+bill);
		precio = precio%5;
		bill = (int) (precio / 2.5);
		System.out.println("Monedas de 2.5€:"+bill);
		precio = precio%2.5;
		System.out.println("Monedas restantes:"+precio);
		
		/*
			bill=  (int)(precio/20);
			System.out.println("Billetes de 20€:"+bill);
		if (precio > 0) {
		precio = precio - (20*bill);
			bill = (int)(precio/10);
			System.out.println("Billetes de 10€:"+bill);
		}
		if (precio > 0) {
			precio = precio - (10*bill);
			bill = (int)(precio/5);
			System.out.println("Billetes de 5€:"+bill);
		}
		if (precio > 0) {
			precio = precio - (5*bill);
			bill = (int)(precio/2.5);
			System.out.println("Monedas de 2.5€:"+bill);
		}
		if (precio > 0) {
			precio = precio - (2.5*bill);
			System.out.println("Dinero que falta en monedas: "+precio);
		}*/
		
	}

}
