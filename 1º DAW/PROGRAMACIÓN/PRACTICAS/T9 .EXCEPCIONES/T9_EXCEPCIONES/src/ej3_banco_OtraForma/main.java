package ej3_banco_OtraForma;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static int tam;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cuenta[] cuentas = new Cuenta[2];
		tam = cuentas.length;
		int numCuentas = 0;
		int menu, numTitulares;
		String titulares[] = new String[3], dni;
		double saldo;
		while (true) {
			System.out.println("1. Alta; 2.Cancelar x Titular; 3.Anotar dias = info dinero proc; 4. Sortear");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				if (numCuentas <= tam) {
					do {
						System.out.println(" Cuantos Titulares?");
						numTitulares = sc.nextInt();
					} while (numTitulares < 1 || numTitulares > 3);
					sc.nextLine();
					for (int i = 0; i < numTitulares; i++) {
						do {
							System.out.println("Introduce DNI titular " + (i + 1));
							dni = sc.nextLine();
						} while (!validarDNI(dni));
						titulares[i] = dni;
					}
					System.out.println("Saldo");
					saldo = sc.nextDouble();
					System.out.println("1)Cuenta Normal; 2)Cuenton");
					menu = sc.nextInt();
					if (menu == 1) {
						cuentas[numCuentas] = new Cuenta(saldo, titulares);
						numCuentas++;
					} else {
						try {
							cuentas[numCuentas] = new Cuenton(saldo, titulares);
						} catch (abrirMenor600Exception e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					}

				} else {
					System.out.println("No puedes crear mas cuentas");
				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("Introduce DNI para cancelar cuenta");
				dni = sc.nextLine();
				for (int i = 0; i < numCuentas; i++) {
					if (cuentas[i].borrarCuenta(dni)) {
						int pos = i;
						// BORRADO
						for (int j = pos; j < tam - 1; j++) {
							cuentas[j] = cuentas[j + 1];
						}
						cuentas[tam - 1] = null; // si es de objetos pues null.
						tam--;
						System.out.println("Cuenta borrada");
					}
				}
				break;
			case 3:
				System.out.println("Numero de dias:");
				int dias = sc.nextInt();
				if (numCuentas > 0) {
					for (int i = 0; i < numCuentas; i++) {
						cuentas[i].calcularInteres(dias);
						System.out.println(cuentas[i].toString());
					}
				}else {
					System.out.println("No hay cuentas para mostrar");
				}
				break;
			case 4:
				realizarSorteo(cuentas, numCuentas);
				break;
			case 5: //mostrar info de una cuenta
				System.out.println("Introduce numero de cuenta:");
				int iban = sc.nextInt();
				for (int i = 0; i<numCuentas;i++) {
					try {
						if (cuentas[i].buscarCuenta(iban)) {
							System.out.println(cuentas[i].toString());
						}
					} catch (NoExisteNumCuentaException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				}
			}
		}
	}

	public static boolean validarDNI(String DNI) {
		// LONGITUD
		if (DNI.length() < 2 || DNI.length() > 9) {
			return false;
		}
		// OBTENER EL ULTIMO CARACTER
		// tambien--> DNI.charAT(8);
		char letra = DNI.charAt(DNI.length() - 1);
		letra = Character.toUpperCase(letra);
		if (letra < 'A' || letra > 'Z') {
			return false;
		}

		// COMPROBAR QUE SON NUMEROS
		for (int i = 0; i < DNI.length() - 2; i++) {
			int num = Integer.parseInt(DNI.substring(i, i + 1));
			if (num < 0 || num > 9)
				return false;
			if (DNI.charAt(i) < '0' || DNI.charAt(i) > '9') {
				return false;
			}
		}
		// Integer.parseInt --> pasar String a Int.
		// substring
		int entero = Integer.parseInt(DNI.substring(0, DNI.length() - 1));
		char letraCalculada = calcularLetraDNI(entero);
		if (letraCalculada != letra) {
			return false;
		}
		return true;

	}

	public static char calcularLetraDNI(int dni) {
		final String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = dni % 23;

		return caracteres.charAt(resto);
	}
	
	private static void realizarSorteo(Cuenta[] cuentas, int cuentasTotal) {
		System.out.println("Realizando sorteo del viaje entre cuentones...");
		Cuenta[] cuentonesAbiertos = null;
		try {
			cuentonesAbiertos = identificarCuentones(cuentas, cuentasTotal);
		} catch (NoHayCuentonesException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		if (cuentonesAbiertos.length > 0) {
			Random random = new Random();
			int indiceGanador = random.nextInt(cuentonesAbiertos.length);
			Cuenta cuentonGanador = cuentonesAbiertos[indiceGanador];
			System.out.println("¡Felicidades al titular del cuentón " + Arrays.toString(cuentonGanador.getTitulares()) + "!");
			System.out.println("Ha ganado el sorteo del viaje.");
		} else {
			System.out.println("No hay cuentones abiertos para realizar el sorteo.");
		}
	}

	private static Cuenta[] identificarCuentones(Cuenta[] cuentas, int cuentasTotal) throws NoHayCuentonesException{
		int cuentonesCount = 0;
		for (int i = 0; i < cuentasTotal; i++) {
			if (cuentas[i] instanceof Cuenton) {
				cuentonesCount++;
			}
		}
		if (cuentonesCount == 0) {
			throw new NoHayCuentonesException ("No hay cuentones abiertos");
		}
		Cuenta[] cuentonesAbiertos = new Cuenta[cuentonesCount];
		int index = 0;
		for (int i = 0; i < cuentasTotal; i++) {
			if (cuentas[i] instanceof Cuenton) {
				cuentonesAbiertos[index++] = cuentas[i];
			}
		}
		return cuentonesAbiertos;
		
	}

}
