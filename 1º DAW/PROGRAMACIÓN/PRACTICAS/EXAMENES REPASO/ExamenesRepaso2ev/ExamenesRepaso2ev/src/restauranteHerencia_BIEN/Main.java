package restauranteHerencia_BIEN;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Inicialización de variables
		Scanner sc = new Scanner(System.in);
		Mesa mesas[] = new Mesa[4]; // Arreglo para almacenar las mesas
		int totalComensales = 0, menu, numComensalesMesa, numBebidas, numRaciones;

		// Bucle principal del programa
		while (true) {
			// Menú de opciones
			System.out.println("MENU:");
			System.out.println("1) Llegada");
			System.out.println("2) Servir");
			System.out.println("3) Pagar");
			System.out.println("4) Juntar mesas");
			System.out.println("5) Mostrar info");
			System.out.println("6) Salir");
			menu = leerNumero("Introduce opc:", sc);

			switch (menu) {
			case 1: // LLEGADA
				// Verificar si hay mesas disponibles
				if (totalComensales != mesas.length) {
					// Generar un número aleatorio de comensales
					numComensalesMesa = (int) (5 * Math.random() + 1); // numero entre 1-5.
					// Solicitar el tipo de comensal
					do {
						menu = leerNumero("Tipo comensal: 1) Normal 2)Tenedor 3)Gourmet", sc);
					} while (menu != 1 && menu != 2 && menu != 3);
					// Crear la mesa según el tipo de comensal
					switch (menu) {
					case 1:
						mesas[totalComensales] = new Normal(numComensalesMesa);
						break;
					case 2:
						sc.nextLine(); // Limpiar buffer
						String oferta;
						do {
							System.out.println("Introduce oferta tenedor: ");
							oferta = sc.nextLine();
						} while (!validarOferta(oferta));
						mesas[totalComensales] = new Tenedor(numComensalesMesa, oferta);
						break;
					case 3:
						mesas[totalComensales] = new Gourmet(numComensalesMesa);
						break;
					}
					// Informar al cliente sobre su mesa asignada
					System.out.println("Adelante... su numero de mesa es:" + mesas[totalComensales].getIdMesa());
					totalComensales++; // Incrementar el contador de comensales
				} else {
					System.out.println("Restaurante lleno. Deberán esperar.");
				}
				break;
			case 2: // SERVIR
				// Verificar si hay mesas y comensales
				if (totalComensales == 0 && mesas[0] == null) {
					System.out.println("No hay ninguna mesa");
				} else {
					// Solicitar el número de mesa a servir
					menu = leerNumero("Introduce el nº de mesa a servir:", sc);
					if (!existeMesaXNum(mesas, totalComensales, menu)) {
						System.out.println("No existe está mesa.");
					} else {
						// Verificar si la mesa ya ha sido servida 3 veces
						if (mesas[menu].getVecesServido() == 3) {
							System.out.println("Ya no os puedo servir más. Van 3 veces.");
						} else {
							// Solicitar el número de bebidas y raciones a servir
							do {
								numBebidas = leerNumero("Introduce numero de bebidas", sc);
							} while (numBebidas < 1 || numBebidas > mesas[menu].getNumComensales());
							do {
								numRaciones = leerNumero("Introduce numero de raciones", sc);
							} while (numRaciones < 1 || numRaciones > mesas[menu].getNumComensales());
							// Servir
							mesas[menu].servir(numBebidas, numRaciones);
						}
					}
				}
				break;
			case 3: // PAGAR
				// Verificar si hay mesas y comensales
				if (totalComensales == 0 && mesas[0] == null) {
					System.out.println("No hay ninguna mesa");
				} else {
					// Solicitar el número de mesa a pagar
					menu = leerNumero("Introduce el nº de mesa a servir:", sc);
					if (!existeMesaXNum(mesas, totalComensales, menu)) {
						System.out.println("No existe está mesa.");
					} else {
						// Pagar y borrar la mesa
						mesas[menu].pagar();
						totalComensales = borrarMesa(mesas, totalComensales, menu);
					}
				}
				break;
			case 4:
				// Verificar si hay mesas y comensales
				if (totalComensales == 0 && mesas[0] == null) {
					System.out.println("No hay ninguna mesa");
				} else {
					// Solicitar los números de las mesas a juntar
					menu = leerNumero("Introduce el nº de mesa a servir:", sc);
					if (!existeMesaXNum(mesas, totalComensales, menu)) {
						System.out.println("No existe está mesa1.");
					} else {
						int menu2 = leerNumero("Introduce el nº de mesa a servir:", sc);
						if (!existeMesaXNum(mesas, totalComensales, menu2)) {
							System.out.println("No existe está mesa2.");
						} else {
							try {
								// Juntar mesas
								juntarComensales(mesas, menu, menu2);
								mesas[menu].juntarMesas(mesas[menu2]); // pasamos un objeto a otro y actualizamos
								// Borramos la segunda mesa.
								totalComensales = borrarMesa(mesas, totalComensales, menu2);
							} catch (JuntarComensalesException e) {
								// TODO Auto-generated catch block
								System.out.println(e.getMessage());
							}
						}
					}
				}
				break;
			case 5:
				// Mostrar información de todas las mesas y comensales totales por tipo
				for (int i = 0; i < totalComensales; i++) {
					System.out.println(mesas[i].toString());
				}
				System.out.println("Comensales totales tipo: Normal --> " + Normal.getTotalComensalesNormal());
				System.out.println("Comensales totales tipo: Tenedor --> " + Tenedor.getTotalComensalesTenedor());
				System.out.println("Comensales totales tipo: Gourmet --> " + Gourmet.getTotalComensalesGourmet());
				break;
			case 6:
				// Declarar la matriz para almacenar la información de recaudación
				double[][] iRecaudado = new double[3][2];
				iRecaudado[0][0] = Normal.getTotalRecaudadoNormal();
				iRecaudado[1][0] = Tenedor.getTotalRecaudadoTenedor();
				iRecaudado[2][0] = Gourmet.getTotalRecaudadoGourmet();

				// Calcular el total recaudado
				double tRecaudado = iRecaudado[0][0] + iRecaudado[1][0] + iRecaudado[2][0];
				// Calcular el porcentaje de recaudación para cada tipo de comensal y
				// almacenarlo en la columna 1 de la matriz
				for (int i = 0; i < 3; i++) {
					iRecaudado[i][1] = (iRecaudado[i][0] * 100) / tRecaudado;
				}

				// Mostrar la matriz de información de recaudación
				for (int f = 0; f < 3; f++) {
					for (int c = 0; c < 2; c++) {
						System.out.print("\t" + iRecaudado[f][c]);
					}
					System.out.println();
				}

				break;
			}
		}
	}

	// Método para juntar comensales de dos mesas
	private static void juntarComensales(Mesa[] mesas, int menu, int menu2) throws JuntarComensalesException {
		if (!mesas[menu].getClass().equals(mesas[menu2].getClass())) {
			throw new JuntarComensalesException("No se pueden juntar. No son el mismo tipo.");
		}
		if (mesas[menu].getNumComensales() + mesas[menu2].getNumComensales() > 5) {
			throw new JuntarComensalesException("No se puede juntar porque superan comensales permitidos");
		}
	}

	// Método para borrar una mesa del arreglo de mesas
	private static int borrarMesa(Mesa[] mesas, int totalComensales, int menu) {
		for (int j = menu; j < totalComensales; j++) {
			mesas[j] = mesas[j + 1];
		}
		mesas[totalComensales] = null; // si es de objetos pues null.
		totalComensales--;
		return totalComensales;
	}

	// Método para verificar si una mesa existe en el arreglo de mesas
	private static boolean existeMesaXNum(Mesa[] mesas, int totalComensales, int menu) {
		for (int i = 0; i < totalComensales; i++) {
			if (mesas[i].getIdMesa() == menu) {
				return true;
			}
		}
		return false;
	}

	// Método para validar la oferta de un tenedor
	public static boolean validarOferta(String oferta) {
		if (!oferta.startsWith("TE")) {
			return false;
		}
		// TAMBIEN PODEMOS HACERLO CON TRY-CATCH Y LA EXCEPCION DE
		// INPUTMISMATCHEXCEPTION
		for (int i = 2; i < oferta.length(); i++) {
			if (oferta.charAt(i) < '0' || oferta.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	// Método para leer un número con manejo de excepciones
	private static int leerNumero(String mensaje, Scanner sc) {
		int num = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			try {
				System.out.println(mensaje);
				num = sc.nextInt();
				entradaValida = true;
			} catch (InputMismatchException e) {
				System.out.println("No es un número válido. Por favor, inténtelo de nuevo.");
				sc.nextLine(); // Limpiar el buffer del scanner
			}
		}
		return num;
	}

}
