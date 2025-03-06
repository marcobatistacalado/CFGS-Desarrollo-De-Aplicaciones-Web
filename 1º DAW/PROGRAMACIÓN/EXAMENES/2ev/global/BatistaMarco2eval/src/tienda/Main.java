//MARCO BATISTA CALADO -- TERMINADO
package tienda;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// CREACIÓN ARRAY EMPLEADOS
		Empleado empleados[] = new Empleado[5];
		empleados[0] = new Empleado("E001");
		empleados[1] = new Empleado("E002");
		int totalEmpleados = 2;
		// CREACION ARRAY ARREGLOS
		Arreglo arreglos[] = new Arreglo[10];
		int totalArreglos = 0, menu, pos, val, numArreglo, mins;
		double importe;
		String fecha, codE;
		LocalDate fprevista = null;
		boolean salir = false;
		// MENU
		while (salir == false) {
			System.out.println("Menu-------------------------");
			System.out.println("1)Usuario llega");
			System.out.println("2)Empleado-arreglo");
			System.out.println("3)Empleado-finaliza-arreglo");
			System.out.println("4)Ordenar");
			System.out.println("5)Actualizar precio");
			System.out.println("6)Salir");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (totalArreglos != arreglos.length) {
					do {
						System.out.println("Tipo Arreglo: 1)Normal, 2)Garantia, 3)Urgente");
						menu = sc.nextInt();
					} while (menu != 1 && menu != 2 && menu != 3);
					switch (menu) {
					case 1:
						arreglos[totalArreglos] = new Arreglo();
						System.out.println("Arreglo creado con codigo: " + arreglos[totalArreglos].getNumA());
						totalArreglos++;
						break;
					case 2:
						arreglos[totalArreglos] = new Garantia();
						System.out.println("Arreglo creado con codigo: " + arreglos[totalArreglos].getNumA());
						totalArreglos++;
						break;
					case 3:
						sc.nextLine();
						try {
							fprevista = comprobarFechaCorrecta(sc, fprevista);
							arreglos[totalArreglos] = new Urgente(fprevista);
							System.out.println("Arreglo creado con codigo: " + arreglos[totalArreglos].getNumA());
							totalArreglos++;
						} catch (FechaCorrectaException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage()); //EXCEPCION QUE CONTROLA QUE LA FECHA SEA POSTERIOR A LA ACTUAL.
						}
						break;
					}
				} else {
					System.out.println("No se puede hacer más arreglos.");
				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("COD EMPLEADO:");
				codE = sc.nextLine();
				pos = comprobarExisteEmpleado(empleados, totalEmpleados, codE);
				if (pos == -1) {
					System.out.println("No existe este empleado");
				} else {
					asignarArregloAEmpleado(empleados, arreglos, totalArreglos, pos);
				}
				break;
			case 3:
				System.out.println("Numero del arreglo: ");
				numArreglo = sc.nextInt();
				pos = existeArregloXCod(arreglos, totalArreglos, numArreglo);
				if (pos == -1) {
					System.out.println("No existe este numero de arreglo");
				} else {
					mins = 0; // si no es de arreglo pues 0 minutos
					if (arreglos[pos].getClass().getSimpleName().equals("Arreglo")){
						do {
							System.out.println("Numero de minutos");
							mins = sc.nextInt();
						} while (mins < 0);
					}
					try {
						importe = arreglos[pos].finalizar(mins); // finalizar el arreglo en el array Arreglos
						// finalizar arreglo en el empleado
						finalizarArregloEnEmpleado(empleados, totalEmpleados, arreglos, pos);

						System.out.println("Importe a pagar: " + importe+" €");
					} catch (FinalizadoException e) {
						System.out.println(e.getMessage());
					}
				}
				break;
			case 4:
				burbuja(totalArreglos, arreglos);
				for (int i = 0; i < totalArreglos; i++) {
					System.out.println(arreglos[i].toString());
				}
				break;
			case 5:
				actualizarPrecioNormal(arreglos,totalArreglos);
				break;
			case 6:
				salir = true;
				break;
			}

		}

		// Mostrar arreglos asignados y finalizados por cada empleado.
		for (int i = 0; i < totalEmpleados; i++) {
			System.out.println(empleados[i].toString());
		}
		int totalGarantias = Arreglo.contG, totalUrgentes = Arreglo.contU, totalNormales = Arreglo.contN - totalUrgentes - totalGarantias;
		
		System.out.println("Total arreglos normales: " + totalNormales);
		System.out.println("Total arreglos garantia: " + totalGarantias);
		System.out.println("Total arreglos urgentes: " + totalUrgentes);

	}

	private static void finalizarArregloEnEmpleado(Empleado[] empleados, int totalEmpleados, Arreglo[] arreglos,
			int pos) {
		for (int i = 0; i < totalEmpleados; i++) {
			if (arreglos[pos].getCodEmpleado().equals(empleados[i].getCod())) {
				empleados[i].finalizarArreglo();
			}
		}
	}

	public static void actualizarPrecioNormal(Arreglo[] arreglos, int totalArreglos) {
		for (int i = 0; i < totalArreglos; i++) {
			if (!(arreglos[i] instanceof Garantia) && !(arreglos[i] instanceof Urgente)) {
				// si es de tipo normal
				if (arreglos[i].isFinalizado()) { // si es true, ya esta terminado
					arreglos[i].setImporte(); // pasan a ser de 10€
				}
			}
		}

	}

	private static void burbuja(int TAM, Arreglo arreglos[]) {
		int j, k;
		Arreglo aux;
		for (j = 1; j < TAM; j++) // Doy tantas vueltas como elementos tenga mi array menos 1

			for (k = 0; k < TAM - j; k++) // En cada vuelta llevo el elemento mayor al final del array.

				if (arreglos[k].isFinalizado() == true && arreglos[k + 1].isFinalizado() == false) // Si un elemento es
																									// mayor que el
																									// siguiente, los
																									// intercambio

				{
					aux = arreglos[k];
					arreglos[k] = arreglos[k + 1];
					arreglos[k + 1] = aux;
				}
	}

	private static int existeArregloXCod(Arreglo[] arreglos, int totalArreglos, int numArreglo) {
		for (int i = 0; i < totalArreglos; i++) {
			if (arreglos[i].getNumA() == numArreglo) {
				return i;
			}
		}
		return -1;
	}

	private static void asignarArregloAEmpleado(Empleado[] empleados, Arreglo[] arreglos, int totalArreglos, int pos) {
		int val;
		val = -1;
		for (int i = 0; i < totalArreglos; i++) {
			if (arreglos[i] instanceof Urgente && arreglos[i].getCodEmpleado().equals("")) { // si es un arreglo urgente
																								// y no lo está
																								// arreglando nadie
				arreglos[i].setCodEmpleado(empleados[pos].getCod()); // al arreglo asignarle el codigo del empleado;
				empleados[pos].setArreglosAsignados();// actualizar un arreglo asignado
				System.out.println("Se le ha asignado el arreglo: " + arreglos[i].getNumA());
				val = 0;
				break;
			}
		}
		if (val == -1) { // sino ha encontrado ningun arreglo urgente
			for (int i = 0; i < totalArreglos; i++) {
				if (arreglos[i].getCodEmpleado().equals("")) { // cualquier arreglo que no este arreglando nadie
					arreglos[i].setCodEmpleado(empleados[pos].getCod()); // al arreglo asignarle el codigo del empleado;
					empleados[pos].setArreglosAsignados();// actualizar un arreglo asignado
					System.out.println("Se le ha asignado el arreglo: " + arreglos[i].getNumA());
					val = 0;
					break;
				}
			}
			if (val == -1) {
				System.out.println("No hay arreglos de ningun tipo para asignar.");
			}
		}
	}

	private static int comprobarExisteEmpleado(Empleado[] empleados, int totalEmpleados, String codE) {
		for (int i = 0; i < totalEmpleados; i++) {
			if (empleados[i].existeEmpleado(codE)) {
				return i;
			}
		}
		return -1;
	}

	private static LocalDate comprobarFechaCorrecta(Scanner sc, LocalDate fprevista) throws FechaCorrectaException {
		String fecha;
		boolean correcta = false;
		while (!correcta) {
			try {
				System.out.println("Fecha prevista (yyyy-mm-dd)");
				fecha = sc.nextLine();
				fprevista = LocalDate.parse(fecha);
				if (fprevista.isBefore(LocalDate.now())) {
					throw new FechaCorrectaException("La fecha no es posterior a la actual");
				}
				correcta = true;
				// SE PUEDE AÑADIR AQUI UNA EXCEPCION DE QUE LA FECHA SEA POSTERIOR AL DIA
				// ACTUAL
			} catch (DateTimeParseException e) {
				System.out.println("No es una fecha correcta. Intentalo otra vez.");
			}

		}
		return fprevista;
	}

	public static boolean codCorrecto(String cod) {
		if (!cod.startsWith("E")) {
			return false;
		}
		if (cod.length() < 2 || cod.length() > 4) {
			return false;
		}
		for (int i = 1; i < cod.length(); i++) {
			if (cod.charAt(i) < '0' || cod.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

}
