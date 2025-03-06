import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numVehiculos = 0;
		int opc = 1;
		String mat = "";
		int cont = 0;

		// Pedir matricula y almacenar en cadena
		do {
			System.out.println("Matricula: ");
			mat += sc.nextLine() + ";";
			cont++; //saber como maximo cuantas pos necesito en mi array de vehiculos
			System.out.println("¿Quieres continuar? 1.SI 2.NO");
			opc = sc.nextInt();
			sc.nextLine(); //Limpiar buffer.
		} while (opc == 1);
		
		//ALTA DE MAX DE VEHICULOS
		Vehiculo vehiculos[] = new Vehiculo[cont];
		String[] matriculas = mat.split(";"); // meter cadena con split al array

		//NUMERO DE VEHICULOS QUE AL FINAL SE DAN DE ALTA SI ESTÁN CORRECTOS
		numVehiculos = altaMatriculas(numVehiculos, vehiculos, matriculas);
		
		//EL FIN DEL PROGRAMA VA A SER AQUI SI NO SE HA DADO NINGUNA ALTA DE VEHICULOS...
		if (vehiculos[0] != null) {
			int posVehiculo, codReserva, pos;
			boolean correcto = false;
			LocalTime hReserva = null, hActual;
			while (true) {
				System.out.println("*****Anote posicion");
				System.out.println("1.Reservar");
				System.out.println("2.Abrir reservado y funcionamiento");
				System.out.println("3.Aparcar");
				System.out.println("4.Cerrar");
				opc = sc.nextInt();
				
				if (opc == 4) {
					break; //salir;
				}
				sc.nextLine(); //Limpiar buffer.
				
				switch (opc) {
				case 1://RESERVAR
					mostrarVehiculoPosicion(numVehiculos, vehiculos); //INFO Y POSICION
					hReserva = posicionCorrecta(sc, vehiculos, correcto, hReserva);
					sc.nextLine();
					break;
				case 2:
					//ABRIR Y FUNCIONAR
					System.out.println("Anota matricula:");
					mat = sc.nextLine();
					pos = buscarVehiculoMatricula(numVehiculos, mat, vehiculos);
					if (pos == -1) {
						System.out.println("Matricula no encontrada");
					} else {
						if (vehiculos[pos].getEstado() != 1) {
							System.out.println("Este vehiculo no está reservado");
						} else {
							int intentos = 3;
							do {
								System.out.println("Anota cod reserva:");
								codReserva = sc.nextInt();
								if (vehiculos[pos].getCodReserva() == codReserva) {
									break;
								} else {
									intentos--;
									System.out.println("Te quedan " + intentos + " intentos.");
								}
							} while (intentos != 0);
							if (intentos == 0) {
								System.out.println("Reserva cancelada");
								vehiculos[pos].setEstado(0); //cancelar reserva dejandolo disponible
							} else {
								hActual = LocalTime.now();
								long diff = ChronoUnit.SECONDS.between(hReserva, hActual);
								if (diff > 20) {
									System.out.println("Reserva cancelada porque han pasado 20 secs");
									vehiculos[pos].setEstado(0); //cancelar reserva dejandolo disponible
								} else {
									System.out.println("Procedemos a abrir el vehiculo y funcionar");
									vehiculos[pos].funcionamiento(); // abrir y funcione
								}

							}
						}
					}
					break;
				case 3:
					System.out.println("Anota matricula:");
					mat = sc.nextLine();
					pos = buscarVehiculoMatricula(numVehiculos, mat, vehiculos);
					if (pos == -1) {
						System.out.println("Matricula no encontrada");
					} else {
						if (vehiculos[pos].getEstado() == 2) {//si está funcionando
							System.out.println("Pago por vehiculo: " + vehiculos[pos].aparcar() + "€");//calculo
						} else {
							System.out.println("No esta en funcionamiento");
						}
					}
					break;
				}
			}

		}
	}

	private static LocalTime posicionCorrecta(Scanner sc, Vehiculo[] vehiculos, boolean correcto, LocalTime hReserva) {
		int posVehiculo;
		int codReserva;
		do {
			try {
				System.out.println("Seleciona la posicion: ");
				posVehiculo = sc.nextInt();

				codReserva = vehiculos[posVehiculo].reservar();
				if (codReserva == -1) {
					System.out.println("Vehiculo no disponible");
				} else {
					System.out.println("Vehiculo reservado; COD RESERVA: " + codReserva);
					hReserva = LocalTime.now();
				}
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("Has introducido algo que no es un numero");
				sc.nextLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Esa posicion no existe");
			} catch (NullPointerException e) {
				System.out.println("Esa posicion no existe"); 
			}
		} while (!correcto);
		return hReserva;
	}

	private static int buscarVehiculoMatricula(int numVehiculos, String mat, Vehiculo[] vehiculos) {
		for (int i = 0; i < numVehiculos; i++) {
			if (vehiculos[i].getMat().equalsIgnoreCase(mat)) {
				return i;
			}
		}
		return -1;
	}

	private static void mostrarVehiculoPosicion(int numVehiculos, Vehiculo[] vehiculos) {
		System.out.println("-----------Vehiculos");
		for (int i = 0; i < numVehiculos; i++) {
			System.out.println(vehiculos[i].toString() + " ---- posicion: " + i);
		}
	}

	private static int altaMatriculas(int numVehiculos, Vehiculo[] vehiculos, String[] matriculas) {
		//recorrer el array de matriculas
		for (int i = 0; i < matriculas.length; i++) {
			if (validarMat(matriculas[i])) { //si es correcta se da de alta
				vehiculos[numVehiculos] = new Vehiculo(matriculas[i]);
				numVehiculos++;//se aumenta el numero de vehiculos
			}
		}
		return numVehiculos;
	}

	public static boolean validarMat(String mat) {
		mat = mat.toUpperCase();
		
		//maximo 7 caracteres
		if (mat.length() != 7) {
			return false;
		}
		//validar que los 4 primeros son numeros haciendo un parse y controlando su excepcion
		try {
			int numeros = Integer.parseInt(mat.substring(0, 4));
		} catch (NumberFormatException e) {
			return false;
		}
		/*
		 * for (int i = 0; i<=3;i++) { char cod1 = mat.charAt(i); if (cod1 < '0' ||
		 * cod1>'9') { return false; } }
		 */
		
		//comprobar que los 3 ultimos son letras
		for (int b = 4; b <= mat.length() - 1; b++) {
			char cod2 = mat.charAt(b);
			if (cod2 < 'A' || cod2 > 'Z') {
				return false;
			}
		}
		return true;
	}

}
