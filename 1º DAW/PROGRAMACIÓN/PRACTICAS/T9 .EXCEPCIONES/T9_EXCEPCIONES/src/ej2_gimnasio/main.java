package ej2_gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Socio socios[] = new Socio[2];
		int totalSocios = 0, menu, socio;
		double pago;
		String nombre, apellidos, telefono, fnacStr, cod;
		LocalDate fnac = null;
		boolean codExiste = false;
		int pos = 0;
		while (true) {
			System.out.println("1) Alta");
			System.out.println("2) Entrada");
			System.out.println("3) Salir");
			System.out.println("4) Mostrar info: veces acudidas y tiempo total");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				sc.nextLine(); // Limpiar buffer
				if (totalSocios != socios.length) {
					System.out.println("Nombre:");
					nombre = sc.nextLine();
					System.out.println("Apellidos:");
					apellidos = sc.nextLine();
					int val = 0;
					do {
						System.out.println("Teléfono:");
						telefono = sc.nextLine();
						try {
							val = validarNumero(telefono);
						} catch (telefonoEsNumeroException er) {
							System.out.println(er.getMessage());
							val = -1;
						}
					} while (val == -1);
					boolean fcorrecta = false;
					do {
						try {
							fnac = obtenerFechaNacimiento(sc);
							fcorrecta = true;
						} catch (fechaCorrectaException e) {
							System.out.println(e.getMessage());
						}
					} while (fcorrecta == false);
					System.out.println("1) Normal 2) Preferente");
					socio = sc.nextInt();

					try {
						comprobarExistenciaSocio(socios, totalSocios, telefono);
						if (socio == 1) {
							socios[totalSocios] = new Socio(nombre, apellidos, telefono, fnac); // alta Socio Normal
							socios[totalSocios].mostrarCod(); // mostrar cod
							totalSocios++;
						} else {
							socios[totalSocios] = new Preferente(nombre, apellidos, telefono, fnac); // alta Socio
																										// Preferente
							socios[totalSocios].mostrarCod(); // mostrar cod
							totalSocios++;
						}
					} catch (SocioYaExisteException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				} else {
					System.out.println("No se pueden dar mas usuarios de alta");
				}
				break;
			case 2:

				sc.nextLine();
				System.out.println("Introduce cod");
				cod = sc.nextLine();
				try {
					pos = existePorCod(socios, totalSocios, cod);
					socios[pos].entrar(LocalTime.now()); // ENTRAR
				} catch (SocioNoExisteException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}

				break;
			case 3:
				sc.nextLine();
				codExiste = false;
				pos = -1;
				System.out.println("Introduce cod");
				cod = sc.nextLine();
				try {
					pos = existePorCod(socios, totalSocios, cod);
					pago = socios[pos].salir(LocalTime.now()); // SALIR
					System.out.println("Total a pagar: " + pago);
				} catch (SocioNoExisteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				for (int i = 0; i < totalSocios; i++) {
					System.out.println(socios[i].toString());
				}
				break;
			case 5:
				cobrarMensualidad(socios, totalSocios);
				break;

			}
		}

	}

	private static int existePorCod(Socio[] socios, int totalSocios, String cod) throws SocioNoExisteException {
		int pos = -1;
		for (int i = 0; i < totalSocios; i++) {
			if ((socios[i].codExiste(cod))) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			throw new SocioNoExisteException("El socio no existe segun este cod.");
		} else {
			return pos;
		}
	}

	public static void cobrarMensualidad(Socio[] socios, int totalSocios) {
		for (int i = 0; i < totalSocios; i++) {
			if (!socios[i].estaGym) { // Verifica si el socio no está en el gimnasio actualmente
				double importePagar = socios[i].cuota;
				if (socios[i].getEdad() > 60) { // Aplica el descuento del 20% a los mayores de 60 años
					importePagar *= 0.8; // 20% de descuento
				}
				socios[i].mostrarCod();
				System.out.println(": Importe a pagar: " + importePagar);
				// Restablece el importe a pagar y el tiempo de estancia en el gimnasio a 0
				socios[i].cuota = 0;
				socios[i].tiempoTotalenGym = 0;
			}
		}
	}

	private static LocalDate obtenerFechaNacimiento(Scanner sc) throws fechaCorrectaException {
		LocalDate fnac;
		String fnacStr;
		System.out.println("Fecha Nacimiento:");
		fnacStr = sc.nextLine();
		try {
			fnac = LocalDate.parse(fnacStr);
		} catch (DateTimeParseException e) {
			throw new fechaCorrectaException("Está mal la fecha: " + fnacStr);
		}
		return fnac;
	}

	private static void comprobarExistenciaSocio(Socio[] socios, int totalSocios, String telefono)
			throws SocioYaExisteException {
		for (int i = 0; i < totalSocios; i++) {
			if (socios[i].socioExiste(telefono)) {
				throw new SocioYaExisteException("Ya existe este usuario");
			}
		}
	}

	public static int validarNumero(String num) throws telefonoEsNumeroException {
		if (num.charAt(0) != '6') {
			return -1;
		}
		if (num.length() != 9) {
			return -1;
		}
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) < '0' || num.charAt(i) > '9') {
				throw new telefonoEsNumeroException("No es un numero");
			}
		}
		return 0;
	}

}
