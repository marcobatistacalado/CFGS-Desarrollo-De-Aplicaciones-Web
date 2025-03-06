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
						i--; // HAY QUE AÑADIR ESTO PQ CLARO AL MOVERLO TIENES Q COMPROBAR Q EL OBJ Q AHORA
								// SE HA QUEDADO EN LA POSICION LIBRE DEL PRINCIPIO SI ES DE ESE TIPO O NO PQ
								// PASAMOS A LA SIGUIENTE POSICION
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
				} else {
					System.out.println("No hay cuentas para mostrar");
				}
				break;
			case 4:
				realizarSorteo(cuentas, numCuentas);
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

	// OTRA IDEA DE SORTEO: hacer un metodo que sea un get de el totalDeCuentones en
	// la clase Cuenta, y lo que retorne sea ahi un numero al azar entre todos los
	// cuentos que existen. Luego en el main hacer un for que haga un instance of
	// sobre todos los objetos cogiendo todos los cuentones y con el numero que
	// obtubimos vamos haciendo -- y cuando sea == 0 ya sabemos cual es el cuenton
	// al que le ha tocado.
	private static void realizarSorteo(Cuenta[] cuentas, int cuentasTotal) {
		System.out.println("Realizando sorteo del viaje entre cuentones...");
		Cuenta[] cuentonesAbiertos = identificarCuentones(cuentas, cuentasTotal);
		if (cuentonesAbiertos.length > 0) {
			Random random = new Random();
			int indiceGanador = random.nextInt(cuentonesAbiertos.length);
			Cuenta cuentonGanador = cuentonesAbiertos[indiceGanador];
			System.out.println(
					"¡Felicidades al titular del cuentón " + Arrays.toString(cuentonGanador.getTitulares()) + "!");
			System.out.println("Ha ganado el sorteo del viaje.");
		} else {
			// AQUI PODEMOS LANZAR UNA EXCEPCION X EJEMPLO
			System.out.println("No hay cuentones abiertos para realizar el sorteo.");
		}
	}

	private static Cuenta[] identificarCuentones(Cuenta[] cuentas, int cuentasTotal) {
		int cuentonesCount = 0;
		for (int i = 0; i < cuentasTotal; i++) {
			if (cuentas[i] instanceof Cuenton) {
				cuentonesCount++;
			}
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
