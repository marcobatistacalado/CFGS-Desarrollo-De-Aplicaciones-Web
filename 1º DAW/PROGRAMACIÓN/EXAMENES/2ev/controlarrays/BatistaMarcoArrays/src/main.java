import java.util.Arrays;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Contrato contratos[] = new Contrato[20];
		int numContratos = 0, buscar, validar, opc, duracion;
		String telefono, tarifa;
		String tarifas[] = {"joven","normal","especial"};
		double importe = 0;
		
		while(true) {
			System.out.println("Menu: 1-Alta Contrato; 2-Llamar; 3-FIN");
			opc = sc.nextInt();
			if (opc == 3) {
				break;
			}
			sc.nextLine(); //Limpiar buffer
			switch (opc) {
			case 1:
				if (numContratos == contratos.length) {
					System.out.println("Ya no se pueden dar de alta mas contratos");
				}else{
					altaContrato(contratos, sc, numContratos, tarifas, importe);
					numContratos++;
				}
				break;
			case 2:
				importe = realizarLlamada(sc, contratos, numContratos, importe);
				break;
			}
		}
		sc.nextLine();
		//AL SALIR DEL MENU
		
		//MOSTRAR SEGUN LA TARIFA
		//mostrar todos los contratos
		System.out.println("Contratos actuales:");
		mostrarContratos(contratos,numContratos);
		System.out.println();
		System.out.println("Vamos a mostrarte los contratos segun la tarifa que quieras.");
		do {
			System.out.println("Tarifa: (joven,normal,especial):");
			tarifa = sc.nextLine();
			buscar = buscarTarifas(tarifas,tarifa);
			if (buscar == -1) {
				System.out.println("Esta tarifa no existe.");
			}
		}while(buscar == -1);
		Contrato mostrar[] = new Contrato[20];
		int cont = 0;
		buscar = 0;
		do {
			buscar = buscarTarifa(contratos,tarifa, numContratos, buscar);
			if (buscar!=-1) {
				mostrar[cont]=contratos[buscar];	
				cont++;
				buscar++;
			}
		}while(buscar != -1);
		mostrarContratosTarifa(mostrar, cont);
		
		System.out.println();
		//ORDENAR DE MAYOR A MENOS SEGUN LLAMADAS REALIZADAS
		System.out.println("Vamos a ordenar segun las llamadas realizadas de mayor a menor.");
		burbuja1(contratos,numContratos);
		mostrarContratos(contratos,numContratos);
		
		System.out.println();
		//ELIMINAR 3 CONTRATOS CON MENOS LLAMADAS
		//BORRADO
		numContratos = borrarContratos(contratos, numContratos, numContratos);
		numContratos = borrarContratos(contratos, numContratos, numContratos);
		numContratos = borrarContratos(contratos, numContratos, numContratos);
		System.out.println(numContratos);
		/*NO ME HA DADO TIEMPO A MOSTRAR LOS CONTRATOS ASI QUE ESTO ULTIMO NO FUNCIONA MUY BIEN*/
		//mostrarContratos(contratos,numContratos);
		
	}

	private static int borrarContratos(Contrato[] contratos, int numContratos, int buscar) {
		for (int j=buscar; j<numContratos-1; j++) {
			contratos[j] = contratos[j+1];
		}
		contratos[numContratos-1] = null; //si es de objetos pues null.
		return numContratos--;
	}

	private static double realizarLlamada(Scanner sc, Contrato[] contratos, int numContratos, double importe) {
		int buscar;
		int duracion;
		String telefono;
		do {
			System.out.println("Nº telefono:");
			telefono = sc.nextLine();
			buscar = buscarTelefono(contratos,telefono,numContratos);
			if (buscar == -1) {
				System.out.println("Telefono no encontrado.");
			}
		}while(buscar == -1);
		do {
			System.out.println("Duracion:");
			duracion = sc.nextInt();
		}while(duracion<0);
		
		if (duracion>0 && duracion<=5) {
			switch (buscar) {
			case 0:
				importe = 0.02;
				break;
			case 1:
				importe = 0.01;
				break;
			case 2:
				importe = 0;
				break;
			}
		}else {
			switch (buscar) {
			case 0:
				importe = 0.03;
				break;
			case 1:
				importe = 0.02;
				break;
			case 2:
				importe = 0.01;
				break;
			}
		}
		importe = duracion*importe;
		contratos[buscar].setImporte(importe);
		contratos[buscar].setLlamadas(1);
		return importe;
	}

	private static void altaContrato(Contrato contratos[],Scanner sc, int numContratos, String[] tarifas, double importe) {
		int buscar;
		int validar;
		String telefono;
		String tarifa;
		//DAR DE ALTA CONTRATO
		System.out.println("Vamos a dar de alta tu contrato, Nº CONTRATO: "+numContratos);
		do {
			System.out.println("Introduce el numero de telefono: ");
			telefono = sc.nextLine();
			validar = validarTelefono(telefono);
			if (validar == -1) {
				System.out.println("Telefono no valido.");
			}
		}while(validar==-1);
		do {
			System.out.println("Tarifa: (joven,normal,especial):");
			tarifa = sc.nextLine();
			buscar = buscarTarifas(tarifas,tarifa);
			if (buscar == -1) {
				System.out.println("Esta tarifa no existe.");
			}
		}while(buscar == -1);
		switch (buscar) {
		case 0:
			importe = 10;
			break;
		case 1:
			importe = 15;
			break;
		case 2:
			importe = 30;
			break;
		}
		System.out.println("Importe por solo el contrato es de: "+importe+" €");
		contratos[numContratos] = new Contrato(telefono, tarifa, importe);
		
	}
	
	public static int validarTelefono(String num) {
		if (num.length()!=9) {
			return -1;
		}
		if (num.charAt(0) != '6') {
			return -1;
		}
		for (int i = 0; i<num.length(); i++) {
			if (num.charAt(i)<'0' || num.charAt(i)>'9') {
				return -1;
			}
		}
		return 0;
	}
	
	//BUSCAR TARIFA ARRAY MAIN
		public static int buscarTarifas(String tarifas[], String tarifa) {
			for (int i=0; i<tarifas.length; i++) {
				if (tarifas[i].equalsIgnoreCase(tarifa)) {
					return i;
				}
			}
			return -1;
		}
	//BUSCAR TELEFONO
	public static int buscarTelefono(Contrato contratos[], String telefono, int numContratos) {
		for (int i=0; i<numContratos; i++) {
			if (contratos[i].getTelefono().equalsIgnoreCase(telefono)) {
				return i;
			}
		}
		return -1;
	}
	
	//MOSTRAR CONTRATOS
		public static void mostrarContratos (Contrato contratos[], int numContratos) {
			for (int i = 0; i<numContratos; i++) {
				System.out.println(contratos[i].toString());
			}
		}
	
	//BUSCAR TARIFA EN OBJETOS
	public static int buscarTarifa(Contrato contratos[], String tarifa, int numContratos, int buscar) {
		for (int i=buscar; i<numContratos; i++) {
			if (contratos[i].getTarifa().equalsIgnoreCase(tarifa)) {
				return i;
			}
		}
		return -1;
	}
	//MOSTRAR CONTRATOS QUE TIENEN UNA TARIFA
			public static void mostrarContratosTarifa (Contrato contratos[], int numContratos) {
				for (int i = 0; i<numContratos; i++) {
					System.out.println(contratos[i].toString());
				}
			}
	//ORDENMAYOR A MENOS LLAMADAS
	public static void burbuja1(Contrato v[], int TAM){
		int j,k;
		Contrato aux;
		for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
					
			for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al final del array.
			
				if (v[k].getLlamadas()<v[k+1].getLlamadas()) // Si un elemento es mayor que el siguiente, los intercambio
					
				{
				aux=v[k];
				v[k]=v[k+1];
				v[k+1]=aux;
				}
	}
}
