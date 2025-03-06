package restauranteHerencia;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Array de 4 mesas/grupos - cliente;
		Cliente clientes[] = new Cliente[4];
		int totalClientes = 0, menu;

		// MATRIZ:
		double[][] importeRecaudadoPorMesa = new double[4][3]; // 4 mesas y 3 tipos de clientes (normal, tenedor,
																// gourmet)

		// CREACION NUMERO ALEATORIO
		Random random = new Random();
		int numAleat, minimo = 1, maximo = 5, numMesa, numMesa2, numBebidas, numRaciones, pos, pos2, racionesServidas,
				bebidasServidas;
		double cuenta;

		String cod;
		// FALTA IMPLEMENTAR leerNumero() DE EXCEPCION INPUTMISMATCHEXCEPTION!!!!!!!!!!!!!!!!!!!!
		while (true) {
			System.out.println("1) Llegada");
			System.out.println("2) Servir");
			System.out.println("3) Pagar");
			System.out.println("4) Juntar mesas");
			System.out.println("5) Mostrar mesas ocupadas");
			System.out.println("6) Matriz");
			System.out.println("7) Salir");
			menu = sc.nextInt();
			switch (menu) {
			case 1: // LLEGADA
				// Solo se atienden si hay sitio en el array
				if (totalClientes != clientes.length) {
					// Calculo numero aleatorio
					numAleat = random.nextInt(maximo - minimo + 1) + minimo;
					do {
						System.out.println("1) Normal");
						System.out.println("2) Tenedor");
						System.out.println("3) Gourmet");
						menu = sc.nextInt();
						if (menu < 1 || menu > 3) {
							System.out.println("Tiene que ser entre 1-3");
						}
					} while (menu < 1 || menu > 3);
					switch (menu) {
					case 1: // Cliente Normal
						clientes[totalClientes] = new Cliente(numAleat);
						totalClientes++;
						break;
					case 2: // Cliente Tenedor
						sc.nextLine();
						do {
							System.out.println("Introduce el cod de descuento - Tenedor:");
							cod = sc.nextLine();
						} while (!validarCodigo(cod));
						clientes[totalClientes] = new Tenedor(numAleat, cod);
						totalClientes++;
						break;
					case 3: // Cliente Gourmet
						clientes[totalClientes] = new Gourmet(numAleat);
						totalClientes++;
						break;
					}
					totalClientes++;
				} else {
					System.out.println("No se admiten mas clientes");
				}
				break;
			case 2: // SERVIR
				System.out.println("Nº de mesa:");
				numMesa = sc.nextInt();
				pos = buscarClienteXNumMesa(clientes, totalClientes, numMesa);
				if (pos == -1) {
					System.out.println("Mesa no existe");
				} else {
					if (clientes[pos].getServidoPorCamarero() != 3) { // veces que se ha servido la mesa
						do {
							System.out.println("Numero de raciones");
							numRaciones = sc.nextInt();
							racionesServidas = clientes[pos].getRaciones();
							System.out.println("Raciones servidas= " + racionesServidas);
						} while (racionesServidas + numRaciones > clientes[pos].getNumPersonas()); // CONDICION
																									// IMPORTANTE
						do {
							System.out.println("Numero de bebidas");
							numBebidas = sc.nextInt();
							bebidasServidas = clientes[pos].getBebidas();
							System.out.println("Bebidas servidas= " + bebidasServidas);
						} while (bebidasServidas + numBebidas > clientes[pos].getNumPersonas()); // CONDICION IMPORTANTE
						clientes[pos].ServidoPorCamarero(numBebidas, numRaciones); // Marcar como que les han servido.
					} else {
						System.out.println("No se puede sevir más veces. Ha superado el límite = 3.");
					}
				}
				break;
			case 3:
				System.out.println("Nº de mesa:");
				numMesa = sc.nextInt();
				pos = buscarClienteXNumMesa(clientes, totalClientes, numMesa);
				if (pos == -1) {
					System.out.println("Mesa no existe");
				} else {
					cuenta = clientes[pos].pagar(); // guardar cuenta;
					System.out.println("Total a pagar: " + cuenta);
					liberarMesa(clientes, pos, totalClientes);
					System.out.println("Mesa liberada.");
				}
				break;
			case 4:
				System.out.println("1 -- Nº de mesa:");
				numMesa = sc.nextInt();
				pos = buscarClienteXNumMesa(clientes, totalClientes, numMesa);
				if (pos == -1) {
					System.out.println("1ª Mesa no encontrada");
				} else {
					System.out.println("2 -- Nº de mesa:");
					numMesa2 = sc.nextInt();
					pos2 = buscarClienteXNumMesa(clientes, totalClientes, numMesa2);
					if (pos2 == -1) {
						System.out.println("2ª Mesa no encontrada.");
					} else {
						try {
							// UNIR MESAS
							unirMesas(clientes, pos, pos2, totalClientes);
						} catch (UnirMesasException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					}
				}
				break;
			case 5:
				if (totalClientes > 0) {
					System.out.println("Mesas ocupadas:");
					for (int i = 0; i < totalClientes; i++) {
						System.out.println(clientes[i].toString());
					}
					System.out.println("Total Clientes Normales: " + Cliente.getTotalComensales());
					System.out.println("Total Clientes Gourmet: " + Gourmet.getTotalComensales());
					System.out.println("Total Clientes Tenedor: " + Tenedor.getTotalComensales());
				} else {
					System.out.println("No hay mesas ocupadas");
				}
				break;
			case 6:
				// matriz!!!!!!!!!!!!!!!!!!!!!!
				break;
			case 7:
				System.out.println("Saliendo del programa...");
				System.exit(0); // Salir del programa
				break;

			}

		}
	}

	// ERA MAS FACIL HACER USO DE UN && INSTANCEOF DE AMBOS OBJETOS JIJI.
	private static void unirMesas(Cliente[] clientes, int pos, int pos2, int totalClientes) throws UnirMesasException {
		// Obtener nombre de su clase y compararlos
		// Obtener el tipo de cliente de las mesas
		String tipoMesa1 = clientes[pos].getClass().getSimpleName();
		String tipoMesa2 = clientes[pos2].getClass().getSimpleName();
		if (tipoMesa1.equals(tipoMesa2) && (clientes[pos].getNumPersonas() + clientes[pos2].getNumPersonas() <= 5)) {
			// Transferir las consumiciones de la segunda mesa a la primera
			clientes[pos].transferirConsumiciones(clientes[pos2]);
			// Liberar la segunda mesa
			liberarMesa(clientes, pos2, totalClientes);
		} else {
			// EXCEPCION
			throw new UnirMesasException("Excepcion: No se reunen los requisitos para unir las mesas");
		}
	}

	private static void liberarMesa(Cliente[] clientes, int pos, int totalClientes) {
		for (int j = pos; j < totalClientes - 1; j++) {
			clientes[j] = clientes[j + 1];
		}
		clientes[totalClientes - 1] = null; // si es de objetos pues null.
		totalClientes--;
	}

	private static int buscarClienteXNumMesa(Cliente[] clientes, int totalClientes, int numMesa) {
		for (int i = 0; i < totalClientes; i++) {
			if (clientes[i].getNumMesa() == numMesa) {
				return i;
			}
		}
		return -1;
	}

	public static boolean validarCodigo(String cod) {
		if (!cod.substring(0, 2).equalsIgnoreCase("TE")) {
			return false;
		}
		for (int i = 2; i < cod.length(); i++) {
			if (cod.charAt(i) < '0' || cod.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	//FALTA APLICAR ESTO EN CADA PETICION DE NUMERO
	private static int leerNumero(String mensaje, Scanner sc) {
		int num = 0;
		boolean correcto = false;
		do {
			System.out.println(mensaje);
			try {
				num = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("No es un número");
			}
		} while (correcto == false);

		return num;

	}

}
