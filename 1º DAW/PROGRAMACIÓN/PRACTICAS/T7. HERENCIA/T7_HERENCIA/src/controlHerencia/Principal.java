package controlHerencia;

import java.util.*;

public class Principal {
	static final int MAXBECAS = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Beca becas[] = new Beca[MAXBECAS];
		int numBecas = 0;

		int menu, opc, edad, nota;
		String estudios;

		// Se a�aden tantas solicitudes como desee el usuario

		do {

			System.out.println("Dni del solicitante: ");
			String dni = sc.nextLine();

			int encontrado = buscarDni(dni, becas, numBecas);

			if (encontrado == -1) {
				System.out.println("Renta percapita del solicitante: ");
				double renta = sc.nextDouble();
				sc.nextLine();
				do {
					System.out.println("1.BECA OPORTUNIDAD;; 2.BECA EXCELENCIA");
					opc = sc.nextInt();
				} while (opc != 1 || opc != 2);

				switch (opc) {
				case 1:
					sc.nextLine();
					System.out.println("Ultimos estudios:");
					estudios = sc.nextLine();
					System.out.println("Edad:");
					edad = sc.nextInt();
					becas[numBecas] = new BecaOportunidad(dni, renta, estudios, edad);
					numBecas++;

					break;
				case 2:
					System.out.println("Nota obtenida");
					nota = sc.nextInt();
					becas[numBecas] = new BecaExcelencia(dni, renta, nota);
					numBecas++;
				}

			} else
				System.out.println("Este alumno ya ha hecho una solicitud");

			if (numBecas == MAXBECAS)
				break;
			System.out.println("Añadir otra solicitud:1. Si\n2. No");
			menu = sc.nextInt();
			sc.nextLine();

		} while (menu == 1);

		System.out.println("Damos puntuaci�n a las becas*************");

		for (int cont = 0; cont < numBecas; cont++) {
			becas[cont].darPuntuacion();
			System.out.println(becas[cont].toString());
		}

		System.out.println("Ordenamos las becas por puntos***********");
		Beca aux;
		// Ordenamos las becas por puntuación y renta utilizando el algoritmo de
		// ordenamiento burbuja
		for (int i = 0; i < numBecas - 1; i++) {
			for (int j = 0; j < numBecas - i - 1; j++) {
				// Comparamos las becas por puntuación
				if (becas[j].getPuntuacion() < becas[j + 1].getPuntuacion()) {
					// Intercambiamos las becas si están en el orden incorrecto
					Beca temp = becas[j];
					becas[j] = becas[j + 1];
					becas[j + 1] = temp;
				} else if (becas[j].getPuntuacion() == becas[j + 1].getPuntuacion()) {
					// Si las puntuaciones son iguales, comparamos por renta
					if (becas[j].getRenta() > becas[j + 1].getRenta()) {
						// Intercambiamos las becas si están en el orden incorrecto
						Beca temp = becas[j];
						becas[j] = becas[j + 1];
						becas[j + 1] = temp;
					}
				}
			}
		}

		/* Mostramos las puntuaciones de todas las becas */
		mostrarBecas(becas, numBecas);

		// ELIMAR BECA CON MENOS DE UN PTO: METODO BUSCA POSICION DE MENOS DE UN PUNTO Y
		// LA BORRA RECORRIEDNO TODO EL ARRAY
		// polimorfismo
		for (int i = 0; i < numBecas; i++) {
			// COMPROBAR QUE TIPO DE CLASE ES EL OBJETO
			if (becas[i] instanceof BecaExcelencia && becas[i].getPuntuacion() < 2) {
				numBecas = borrarBeca(becas, numBecas, i);
				// EL CASTING ES PARA OBTENER METODOS QUE SOLO SE ENCUENTRAN EN UN HIJO PQ POR
				// DEFECTO EL ARRAI BECAS[] SOLO OBTIENE METODOS DEL PADRE OBVIAMENTE
				// EJEMPLO:
				// ((BecaOportunidad)becas[i]).getEstudios()
			}
		}

		/* Mostramos las puntuaciones de todas las becas */
		mostrarBecas(becas, numBecas);
	}

	private static void mostrarBecas(Beca[] becas, int numBecas) {
		for (int cont = 0; cont < numBecas; cont++)
			System.out.println(becas[cont]);
	}

	private static int borrarBeca(Beca[] becas, int numBecas, int i) {
		// BORRADO
		for (int j = i; j < numBecas - 1; j++) {
			becas[j] = becas[j + 1];
		}
		becas[numBecas - 1] = null; // si es de objetos pues null.
		numBecas--;
		return numBecas;
	}

	public static int buscarDni(String dni, Beca becas[], int tam) {

		for (int cont = 0; cont < tam; cont++)
			if (becas[cont].getDnialumno().equals(dni))
				return cont;
		return -1;
	}

}
