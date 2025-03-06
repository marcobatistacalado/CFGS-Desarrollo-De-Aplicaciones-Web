package ej2;

import java.util.Scanner;
import java.util.Vector;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Empleado> empleados = new Vector<Empleado>();
		int menu = 0;
		String nombre, dni, direccion, telefono, empresaProviene;
		int pos, numE, horas;
		do {
			System.out.println("1) Alta");
			System.out.println("2) Fichar");
			System.out.println("3) Reparto beneficios");
			System.out.println("4) Pagar");
			System.out.println("5) Mostrar info");
			System.out.println("6) Salir");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				menu = darAlta(sc, empleados);
				break;
			case 2:
				pos = -1; //Inicializar variable
				do {
					System.out.println("Numero empleado:");
					numE = sc.nextInt();
				} while (numE < 100);
				pos = buscarEmpleadoPorNum(empleados, pos, numE);
				if (pos == -1) {
					System.out.println("Empleado no existe");
				} else {
					System.out.println("Numero de horas");
					horas = sc.nextInt();
					empleados.get(pos).fichar(horas); //pasarle las horas al metodo fichar.
					System.out.println("Fichado correctamente.");
				}
				break;
			case 3:
				System.out.println("Cantidad por teclado a repartir en propios:");
				double cant = sc.nextDouble();
				int cont = 0;
				//Obtener el numero de empleados propios
				for (int i = 0; i < empleados.size(); i++) {
					if (empleados.get(i) instanceof Propio) {
						cont++;
					}
				}
				cant /= cont; // CANTIDAD REPARTIDA ENTRE EL NUMERO DE EMPLEADOS propios
				if (cont > 0) {
					for (int i = 0; i < empleados.size(); i++) {
						if (empleados.get(i) instanceof Propio) {
							((Propio) empleados.get(i)).repartoBeneficio(cant);
						}
					}
					System.out.println("Reparto hecho.");
				} else {
					System.out.println("No hay empleados propios");
				}
				break;
			case 4:
				for (int i = 0; i < empleados.size(); i++) { 
					empleados.get(i).pagar(); //POLIMORFISMO
					System.out.println("NOMBRE: " + empleados.get(i).getNombre() + "--> SALARIO: "
							+ empleados.get(i).getSalario());
				}
				break;
			case 5:
				for (int i = 0; i < empleados.size(); i++) {
					System.out.println(empleados.get(i).toString());
				}
				break;
			}
		} while (menu != 6);

	}

	private static int buscarEmpleadoPorNum(Vector<Empleado> empleados, int pos, int numE) {
		for (int i = 0; i<empleados.size(); i++) {
			if (empleados.get(i).getNumE() == numE) {
				return i;
			}
		}
		return -1;
	}

	private static int darAlta(Scanner sc, Vector<Empleado> empleados) {
		int menu;
		String nombre;
		String dni;
		String direccion;
		String telefono;
		String empresaProviene;
		do {
			System.out.println("Tipo empleado: 1) Propio; 2)Externo");
			menu = sc.nextInt();
		} while (menu != 1 && menu != 2);
		sc.nextLine();
		System.out.println("Nombre:");
		nombre = sc.nextLine();
		do {
			System.out.println("DNi:");
			dni = sc.nextLine();
		} while (!validarDNI(dni));
		System.out.println("Direccion: ");
		direccion = sc.nextLine();
		do {
			System.out.println("Telefono");
			telefono = sc.nextLine();
		} while (validarNumero(telefono) == -1);

		// COMPROBAR QUE NO EXISTE UNO CON ESE DNI: indexof. Problema: que el equals
		// compara las clases y son diferenteS: Propio y Externo. pues comento porque yo
		// ya se que son del tipo empleado ambas porque he hecho POLMORFISMO.
		
		// OTRA OPC: BUSQUEDA NORMAL Y COMPARAR CON STRINGS: MAS UTIL SENCILLO Y FACIL.
		if (empleados.indexOf(new Propio(dni)) != -1) {
			System.out.println("Empleado ya existe");
		} else {
			if (menu == 1) {
				System.out.println("Extra:");
				double extra = sc.nextDouble();
				empleados.add(new Propio(nombre, dni, direccion, telefono, extra));
				System.out.println("Empleado dado de alta, numE=" + empleados.get(empleados.size() - 1).getNumE()); //IMPORTANTE AÑ
			} else {
				System.out.println("Empresa de la que provienes:");
				empresaProviene = sc.nextLine();
				empleados.add(new Externo(nombre, dni, direccion, telefono, empresaProviene));
				System.out.println("Empleado dado de alta, numE=" + empleados.get(empleados.size() - 1).getNumE()); 
			}
		}
		return menu;
	}

	public static int validarNumero(String num) {
		if (num.charAt(0) != '6') {
			return -1;
		}
		if (num.length() != 9) {
			return -1;
		}
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) < '0' || num.charAt(i) > '9') {
				return -1;
			}
		}
		return 0;
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

}
