import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Contrato contratos[] = new Contrato[20];
		int numContratos = 0, buscar, validar, opc, duracion;
		String telefono, tarifa;
		String tarifas[] = { "joven", "normal", "especial" };
		double importe = 0;

		while (true) {
			System.out.println("Menu: 1-Alta Contrato; 2-Llamar; 3-FIN");
			opc = sc.nextInt();
			if (opc == 3) {
				break;
			}
			sc.nextLine(); // Limpiar buffer
			switch (opc) {
			case 1:
				if (numContratos == contratos.length) {
					System.out.println("Ya no se pueden dar de alta mas contratos");
				} else {
					altaContrato(contratos, sc, numContratos, tarifas, importe);
					numContratos++;
				}
				break;
			case 2:
				realizarLlamada(sc, contratos, numContratos, importe);
				break;
			}
		}
		sc.nextLine();
		// AL SALIR DEL MENU

		// MOSTRAR SEGUN LA TARIFA
		// mostrar todos los contratos
		System.out.println("Contratos actuales:");
		mostrarContratos(contratos, numContratos);
		System.out.println();
		System.out.println("Vamos a mostrarte los contratos segun la tarifa que quieras.");
		do {
			System.out.println("Tarifa: (joven,normal,especial):");
			tarifa = sc.nextLine();
			buscar = buscarTarifas(tarifas, tarifa);
			if (buscar == -1) {
				System.out.println("Esta tarifa no existe.");
			}
		} while (buscar == -1);
		
		//ARRAY CREADO PARA GUARDAR SOLO LOS QUE SEAN POR UNA TARIFA EN CONCRETO
		Contrato mostrar[] = new Contrato[20];
		int cont = 0;
		buscar = 0;
		// lo haces complicado
		do {
			buscar = buscarTarifa(contratos, tarifa, numContratos, buscar); //FUNCION QUE DEVUELVE LA POSCION DEL ARRAY PRINCIPAL EN EL QUE LA TARIFA ES IGUAL A UNA EN CONCRETO
			if (buscar != -1) {
				mostrar[cont] = contratos[buscar];//esto tiene cada atributo la misma direccion de memoria
				//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				//es decir si cambio algun atributo del objeto tambien se va a cambiar en el otro objeto
				//PARA HACER COPIA --> lo creas con el constructor pero obteniendo con gets los atributos de contratos
				//
				//LO IDEAL ES HACER UN METODO constructor::::
				/*public Contrato (Contrato c) {
					tel = c.tel;
					...
				}*/
				//y llamas_--> mostrar[i]= new Contrato (contratos[i]);
				//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				cont++;
				buscar++;
			}
		} while (buscar != -1);
		mostrarContratosTarifa(mostrar, cont);

		System.out.println();
		// ORDENAR DE MAYOR A MENOS SEGUN LLAMADAS REALIZADAS
		System.out.println("Vamos a ordenar segun las llamadas realizadas de mayor a menor.");
		burbuja1(contratos, numContratos);
		mostrarContratos(contratos, numContratos);

		System.out.println();
		// ELIMINAR 3 CONTRATOS CON MENOS LLAMADAS
		// BORRADO
		// No es necesario, sólo tienes que borrar los 3 últimos, no controlas si tienes menos de 3
		numContratos = borrarContratos(contratos, numContratos);
		numContratos = borrarContratos(contratos, numContratos);
		numContratos = borrarContratos(contratos, numContratos);
		mostrarContratos(contratos, numContratos);
		/*
		 * NO ME HA DADO TIEMPO A MOSTRAR LOS CONTRATOS ASI QUE ESTO ULTIMO NO FUNCIONA
		 * MUY BIEN
		 */
		// mostrarContratos(contratos,numContratos);

	}
	
	//METODO ARREGLADO YA
	private static int borrarContratos(Contrato[] contratos, int numContratos) {
		if (numContratos>1) {
		// ESte for está mal,nunca entra
		for (int j = numContratos-1; j < numContratos - 1; j++) {
			contratos[j] = contratos[j + 1];
		}
		contratos[numContratos - 1] = null; // si es de objetos pues null.
		// No retorna bien, haz return numContratos-1;
		}
		return numContratos-1;
		
	}

	public static void realizarLlamada(Scanner sc, Contrato[] contratos, int numContratos, double importe) {
		int buscar;
		int duracion;
		String telefono;
		do {
			System.out.println("Nº telefono:");
			telefono = sc.nextLine();
			buscar = buscarTelefono(contratos, telefono, numContratos);
			if (buscar == -1) {
				System.out.println("Telefono no encontrado.");
			}
		} while (buscar == -1);
		do {
			System.out.println("Duracion:");
			duracion = sc.nextInt();
		} while (duracion < 0);
			// Mal switch, tendrías que hacerlo con el tipo de contrato 0-joven, 1-normal y 2-especial
			// Usa un método en la clase Contrato
			// Unsa arrayspara los valores
		
		//SOLUCIONADO---------------------
		
		//llamamos al metodo actualizador de importe directamente en la clase
		contratos[buscar].realizarLlamada(duracion);
			
		
	}

	private static void altaContrato(Contrato contratos[], Scanner sc, int numContratos, String[] tarifas,
			double importe) {
		int buscar;
		int validar;
		String telefono;
		String tarifa;
		// DAR DE ALTA CONTRATO
		System.out.println("Vamos a dar de alta tu contrato, Nº CONTRATO: " + numContratos);
		do {
			System.out.println("Introduce el numero de telefono: ");
			telefono = sc.nextLine();
			validar = validarTelefono(telefono);
			if (validar == -1) {
				System.out.println("Telefono no valido.");
			}
		} while (validar == -1);
		do {
			System.out.println("Tarifa: (joven,normal,especial):");
			tarifa = sc.nextLine();
			buscar = buscarTarifas(tarifas, tarifa);
			if (buscar == -1) {
				System.out.println("Esta tarifa no existe.");
			}
		} while (buscar == -1);
		// Esto mejor en el constructor
		// Usa array -->HECHO EN EL CONSTRUCTOR
		contratos[numContratos] = new Contrato(telefono, tarifa);

	}

	public static int validarTelefono(String num) {
		if (num.length() != 9) {
			return -1;
		}
		if (num.charAt(0) != '6') {
			return -1;
		}
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) < '0' || num.charAt(i) > '9') {
				//if (!Character.isDigit(num.charAt(i))){
				return -1;
			}
		}
		return 0;
	}

	// BUSCAR TARIFA ARRAY MAIN
	public static int buscarTarifas(String tarifas[], String tarifa) {
		for (int i = 0; i < tarifas.length; i++) {
			if (tarifas[i].equalsIgnoreCase(tarifa)) {
				return i;
			}
		}
		return -1;
	}

	// BUSCAR TELEFONO
	public static int buscarTelefono(Contrato contratos[], String telefono, int numContratos) {
		for (int i = 0; i < numContratos; i++) {
			if (contratos[i].getTelefono().equalsIgnoreCase(telefono)) {
				return i;
			}
		}
		return -1;
	}

	// MOSTRAR CONTRATOS
	public static void mostrarContratos(Contrato contratos[], int numContratos) {
		for (int i = 0; i < numContratos; i++) {
			System.out.println(contratos[i].toString());
		}
	}

	// BUSCAR TARIFA EN OBJETOS
	public static int buscarTarifa(Contrato contratos[], String tarifa, int numContratos, int buscar) {
		for (int i = buscar; i < numContratos; i++) {
			if (contratos[i].getTarifa().equalsIgnoreCase(tarifa)) {
				return i;
			}
		}
		return -1;
	}

	// MOSTRAR CONTRATOS QUE TIENEN UNA TARIFA
	public static void mostrarContratosTarifa(Contrato contratos[], int numContratos) {
		for (int i = 0; i < numContratos; i++) {
			System.out.println(contratos[i].toString());
		}
	}

	// ORDENMAYOR A MENOS LLAMADAS
	public static void burbuja1(Contrato v[], int TAM) {
		int j, k;
		Contrato aux;
		for (j = 1; j < TAM; j++) // Doy tantas vueltas como elementos tenga mi array menos 1

			for (k = 0; k < TAM - j; k++) // En cada vuelta llevo el elemento mayor al final del array.

				if (v[k].getLlamadas() < v[k + 1].getLlamadas()) // Si un elemento es mayor que el siguiente, los
																	// intercambio

				{
					aux = v[k];
					v[k] = v[k + 1];
					v[k + 1] = aux;
				}
	}
}
