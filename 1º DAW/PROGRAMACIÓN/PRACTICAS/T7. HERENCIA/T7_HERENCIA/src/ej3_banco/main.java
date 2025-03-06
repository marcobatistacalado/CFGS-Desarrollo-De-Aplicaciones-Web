package ej3_banco;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static int cuentasTotal = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cuenta cuentas[] = new Cuenta[3];
		int numTitulares, saldoInicial, pos;
		while (true) {

			System.out.println("1. Dar alta cuenta.");
			System.out.println("2. Cancelar cuentas titular.");
			System.out.println("3. Anotar dias, mostrar cuentas");
			System.out.println("4. Sortear viaje entre cuentones");
			int opc = sc.nextInt();

			switch (opc) {
			case 1:
				darDeAltaCuenta(sc, cuentas);
				break;
			case 2:
				sc.nextLine();
				System.out.println("Introduce Nombre del titular:");
				String nombre = sc.nextLine();
				pos = -1;
				// bucle que pasa por todas las cuentas y llama a un metoo de la cuenta para que
				// busque en su array el nombre
				for (int i = 0; i < cuentasTotal; i++) {
					if (cuentas[i].comprobarTitular(nombre) == 0) {
						pos = i;
					}
				}
				if (pos == -1) {
					System.out.println("Titular no encontrado");
				} else {
					// BORRADO DE UN ELEMENTO CON LA POSICION LO MUEVO HASTA ATRAS
					for (int j = pos; j < cuentasTotal - 1; j++) {
						cuentas[j] = cuentas[j + 1];
					}
					cuentas[cuentasTotal - 1] = null; // si es de objetos pues null. tam--;
					cuentasTotal--;// BORRAMOS UNA CUENTA
					System.out.println("Cuenta borrada");

				}

				break;
			case 3:
				System.out.println("Introduce el número de días:");
				int dias = sc.nextInt();
				for (int i = 0; i < cuentasTotal; i++) {
					System.out.println("Información de la cuenta:-------------------------------");
					System.out.println(cuentas[i].toString());
					double interesGanado = cuentas[i].calcularInteres(dias);
					System.out.println("Interés ganado en " + dias + " días: " + interesGanado + " euros.");
					double saldoTotal = cuentas[i].getSaldo() + interesGanado;
					System.out.println("Saldo total después de " + dias + " días: " + saldoTotal + " euros.");
				}
				break;
			case 4:
				realizarSorteo(cuentas, cuentasTotal);
				break;
			}
		}
	}

	private static void darDeAltaCuenta(Scanner sc, Cuenta[] cuentas) {
		int numTitulares;
		int saldoInicial;
		int opc;
		String titulares[] = new String[3]; // Importante crearlo aqui, pq he tenido un error: pq todas las cuentas
											// referenciaban al mismo array, y por eso todas tenian el mismo nombre.
		System.out.println("1.Normal; 2.Cuenton");
		opc = sc.nextInt();
		do {
			System.out.println("Cuantos titulares?");
			numTitulares = sc.nextInt();
			if (numTitulares < 1 || numTitulares > 3) {
				System.out.println("Minimo 1 y max 3;");
			}
		} while (numTitulares < 1 || numTitulares > 3);
		sc.nextLine();
		for (int i = 0; i < numTitulares; i++) {
			System.out.println("Nombre titular " + i + 1 + ";"); // lo he hecho con nombres pq me apetecia
			titulares[i] = sc.nextLine();
		}
		do {
			System.out.println("Introduce saldo:");
			saldoInicial = sc.nextInt();
			if ((saldoInicial <= 600)) {
				System.out.println("Para abrir un cuenton el minimo son 600€");
			}
		}while(saldoInicial <= 600);

		if (opc == 1) {
			cuentas[cuentasTotal] = new CuentaNormal(titulares, saldoInicial);
		} else {
			try {
			cuentas[cuentasTotal] = new Cuenton(titulares, saldoInicial);
			//controlar la excepcion creada
			}catch (SaldoIncorrectoException e) {
				System.out.println(e.getMessage());
			}
		}

		cuentasTotal++;

	}

	private static void realizarSorteo(Cuenta[] cuentas, int cuentasTotal) {
		System.out.println("Realizando sorteo del viaje entre cuentones...");
		Cuenta[] cuentonesAbiertos = identificarCuentones(cuentas, cuentasTotal);
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
