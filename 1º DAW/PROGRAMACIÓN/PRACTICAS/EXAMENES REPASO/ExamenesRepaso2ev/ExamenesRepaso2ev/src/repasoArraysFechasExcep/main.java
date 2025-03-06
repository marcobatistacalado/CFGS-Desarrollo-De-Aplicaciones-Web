package repasoArraysFechasExcep;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {

	public static int tam1;
	public static int tam2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxempleados = 0, numEmpleado, buscar = -1;
		String dNI;
		// Array Empleados
		Empleado empleados[] = new Empleado[2];
		tam1 = empleados.length; // variable pública
		// Array Fichajes
		Fichaje fichajes[] = new Fichaje[50];
		tam2 = fichajes.length;
		int fichaje = 0;

		Fichaje.sethLlegada(leerHora(sc, "entrada"));
		Fichaje.sethSalida(leerHora(sc, "salida"));


		// Posible creación de empleados hasta que no se pueda más
		creacionEmpleados(sc, maxempleados, empleados);

		int opc;
		while (true) {
			System.out.println("1.Entrada; 2.Salida; " + "3. Mostrar fichajes y tiempo; 4.Mostrar incidencias;"
					+ "5.Mostrar todos los empleados;  6. Matriz");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				// ENTRADA
				if (fichaje != tam2) {
					fichaje = fichajeBasico(sc, empleados, fichajes, fichaje, 1);
				} else {
					System.out.println("No se pueden hacer más fichajes");
				}
				break;
			case 2:
				// SALIDA
				if (fichaje != tam2) {
					fichaje = fichajeBasico(sc, empleados, fichajes, fichaje, 2);
				} else {
					System.out.println("No se pueden hacer más fichajes");
				}
				break;
			case 3:
				// MOSTRAR FICHAJES
				do {
					System.out.println("Nº empleado: ");
					numEmpleado = sc.nextInt();
					buscar = buscarEmpleado(empleados, numEmpleado);
				} while (buscar == -1);
				mostrarFichajes(numEmpleado, fichajes, fichaje);
				break;
			case 4:
				//	MOSTRAR INCIDENCIAS
				do {
					System.out.println("Nº empleado: ");
					numEmpleado = sc.nextInt();
					buscar = buscarEmpleado(empleados, numEmpleado);
				} while (buscar == -1);
				mostrarIncidencias(numEmpleado, fichajes);
				break;
			case 5:
				mostrarEmpleadosTrabajando(empleados);
				break;
			}
		}

	}

	private static void mostrarEmpleadosTrabajando(Empleado[] empleados) {
		for (int i = 0; i<tam1; i++) {
			if (empleados[i].isTrabajando()) {
				System.out.println(empleados[i]);
			}
		}
	}

	private static void mostrarIncidencias(int numEmpleado, Fichaje[] fichajes) {
		for (int i = 0; i<tam2; i++) {
			//que coincida el numempleado yyyyy que la incidencia sea diferente de 0
			if (numEmpleado == fichajes[i].getNumE() && fichajes[i].getIncidencia() != 0) {
				System.out.println(fichajes[i].toString());
			}
		}
	}

	private static LocalTime leerHora(Scanner sc, String cad) {
		String horaS;
		LocalTime hora = null;
		boolean correcta = false;
		do {
			System.out.println("Introduce hora de"+cad+"entrada de todos los empleados (hh:mm):");
			horaS = sc.nextLine();
			try {
				hora = LocalTime.parse(horaS);
				correcta = true;
			} catch (DateTimeParseException e) {
				System.out.println("Formato incorrecto");
			}
		} while (correcta == false);
		return hora;
	}

	private static void mostrarFichajes(int numEmpleado, Fichaje[] fichajes, int fichaje) {
		for (int i = 0; i < fichaje; i++) {
			if (fichajes[i].getNumE() == numEmpleado) {
				if (fichajes[i].getTipo() == 1) {
					System.out.println("Fichaje Entrada: " + fichajes[i].toString());
				} else {
					System.out.println("Fichaje Salida: " + fichajes[i].toString());
				}

			}
		}
	}

	private static void creacionEmpleados(Scanner sc, int maxempleados, Empleado[] empleados) {
		int numEmpleado;
		String dNI;
		while (maxempleados != tam1) {
			// se puede meter aqui la excepciopn inputmismatch
			System.out.println("Nº empleado: ");
			numEmpleado = sc.nextInt();
			sc.nextLine();
			do {
				System.out.println("DNI: ");
				dNI = sc.nextLine();
			} while (!validarDNI(dNI));
			empleados[maxempleados] = new Empleado(dNI, numEmpleado);
			maxempleados++;
		}
	}

	private static LocalDateTime LocalDateTimeparse(String nextLine) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int fichajeBasico(Scanner sc, Empleado[] empleados, Fichaje[] fichajes, int fichaje, int tipo) {

		String contra;
		int numEmpleado;
		int buscar;
		int incidencia;
		do {
			System.out.println("Nº empleado: ");
			numEmpleado = sc.nextInt();
			buscar = buscarEmpleado(empleados, numEmpleado);
		} while (buscar == -1);

		sc.nextLine();
		do {
			System.out.println("Contraseña: ");
			contra = sc.nextLine();
		} while (contraCorrecta(empleados, contra, buscar) == -1);
		//INCIDENCIAS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//compruebo si esta dentro o no
		if (tipo == 1) {
			//si ya esta dentro esta haciendo doble entrada
			if (empleados[buscar].isDentro()) {
				System.out.println("Icidencia, ya has hecho la entrada");
				incidencia = 3;
			}else {
				incidencia = 0; //pq esta bien
				empleados[buscar].setDentro(true);
			}
			fichajes[fichaje] = new Fichaje(numEmpleado, tipo, incidencia);
		}else {
			//si ya esta dentro esta haciendo doble entrada
			if (!empleados[buscar].isDentro()) {
				System.out.println("Icidencia, ya has hecho la salida");
				incidencia = 4;
			}else {
				incidencia = 0; //pq esta bien
				empleados[buscar].setDentro(false);
			}
			fichajes[fichaje] = new Fichaje(numEmpleado, tipo, incidencia);
		}

		fichaje++;
		return fichaje;
	}

	// POSICION EN LA QUE SE ENCUENTRA AL EMPLEADO O SINO EXISTE
	public static int buscarEmpleado(Empleado empleados[], int numEmpleado) {
		for (int i = 0; i < tam1; i++) {
			if (numEmpleado == empleados[i].getNumE()) {
				return i;// retornar posicion para saber que empleado es
			}
		}
		return -1;
	}

	// Comparar DNI del empleado substr con contraseña introducida
	//ESTO NO ES LO IDEAL; LO IDEAL ES CREAR UN METODO EN EMPLEADO QUE COMPARE LA CONTRASEÑA YO PASANDOSELA 
	public static int contraCorrecta(Empleado empleados[], String contra, int buscar) {
		if (empleados[buscar].getdNI().substring(4, 8).equalsIgnoreCase(contra)) {
			return 0;
		}
		return -1;
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
		// CON EXCEPCION:
		try {
			int num = Integer.parseInt(DNI.substring(0, 8));
		} catch (NumberFormatException e) {
			System.out.println("Excepcion");
			return false;
		}
		/*
		 * for (int i = 0; i<DNI.length()-2; i++) { int num =
		 * Integer.parseInt(DNI.substring(i,i+1)); if (num<0 || num>9) return false; if
		 * (DNI.charAt(i)<'0'||DNI.charAt(i)>'9') { return false; } }
		 */
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

}