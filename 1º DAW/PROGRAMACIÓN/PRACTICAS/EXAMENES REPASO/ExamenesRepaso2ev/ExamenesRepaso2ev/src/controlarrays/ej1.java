package controlarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Comercial comerciales[] = new Comercial [8];
		String marcas[]= {"Nike","Adidas","Converse"};
		int numComerciales;
		String nombre = null;
		String marca;
		int buscar, uds = 1;
		do {
			System.out.println("Cuantos comerciales quieres dar de alta?");
			numComerciales = sc.nextInt();
		}while(numComerciales < 2 || numComerciales>8);
		
		sc.nextLine();//limpiar buffer.
		for (int i = 0; i<numComerciales; i++) {
			System.out.println("Introduce nombre:");
			nombre = sc.nextLine();
			comerciales[i] = new Comercial (nombre);
		}
		
		while (nombre.equalsIgnoreCase("FIN") == false) {
			System.out.println("Nombre del comercial:");
			nombre = sc.nextLine();
			if (nombre.equalsIgnoreCase("FIN")){
				break;
			}
			buscar = buscarComercial(comerciales, nombre, numComerciales);
			if (buscar == -1) {
				System.out.println("Comercial no encontrado");
			}else {
				System.out.println("Marca vendida: ");
				marca = sc.nextLine();
				int buscar2 = buscarMarcas(marcas,marca,numComerciales);
				if (buscar2 == -1) {
					System.out.println("Esa marca no existe");
				}else {
					do {
						System.out.println("Unidades de esta marca:");
						uds = sc.nextInt();
					}while (uds < 1);
					
					comerciales[buscar].setMarcas(buscar2,uds);
					System.out.println("Ventas guardadas");
				}
				//ESTO ES VALIDO PERO POCO EFICIENTE YA QUE SABEMOS ARRAYS
				/*if (marca.equalsIgnoreCase("Nike") == false && marca.equalsIgnoreCase("Converse") == false && marca.equalsIgnoreCase("Adidas") == false) {
					System.out.println("No es la marca correcta");
				}else {
					do {
						System.out.println("Unidades de esta marca:");
						uds = sc.nextInt();
					}while (uds < 1);
					if (marca.equalsIgnoreCase("Nike")) {
						//AUMENTAR:
						comerciales[buscar].setMarcas(0,uds);
					}
					if (marca.equalsIgnoreCase("Adidas")) {
						//AUMENTAR:
						comerciales[buscar].setMarcas(1,uds);
					}
					if (marca.equalsIgnoreCase("Converse")) {
						//AUMENTAR:
						comerciales[buscar].setMarcas(2,uds);
					}
					
				}*/
			}
			//mostrarComercial(comerciales, numComerciales);
			sc.nextLine();//limpiar buffer.
		}
		//ORDEN POR VENTAS Y SI SON IGUALES POR ORDEN ALFABETICAMENTE.
		burbuja1(comerciales,numComerciales);
		mostrarComercial(comerciales,numComerciales);
		
		
		System.out.println("Introduce un num de uds para borrar a un comercial");
		uds = sc.nextInt();
		do {
			buscar = buscarComercial2(comerciales, numComerciales,uds);
			if (buscar != -1) {
			System.out.println("Comercial borrado: "+comerciales[buscar].getNombre());
			//BORRADO
			for (int j=buscar; j<numComerciales-1; j++) {
				comerciales[j] = comerciales[j+1];
			}
			comerciales[numComerciales-1] = null; //si es de objetos pues null.
			numComerciales--;
			}
			
		}while(buscar != -1);
		
	}
	//BUSCAR COMERCIAL X NOMBRE
	public static int buscarComercial(Comercial comerciales[], String nombre, int numComerciales) {
		for (int i=0; i<numComerciales; i++) {
			if (comerciales[i].getNombre().equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return -1;
	}
	//MOSTRAR COMERCIALES
	public static void mostrarComercial (Comercial comerciales[], int numComerciales) {
		for (int i = 0; i<numComerciales; i++) {
			System.out.println(comerciales[i].toString());
		}
	}
	//BUSCAR MARCAS
	public static int buscarMarcas(String marcas[], String marca, int numComerciales) {
		for (int i=0; i<numComerciales; i++) {
			if (marcas[i].equalsIgnoreCase(marca)) {
				return i;
			}
		}
		return -1;
	}
	
	//ORDENADO POR VENTAS
		public static void burbuja1(Comercial v[], int TAM){
			int j,k;
			Comercial aux;
			for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
				
				for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al final del array.
		
					if (v[k].getVentas()<v[k+1].getVentas() || 
							(v[k].getVentas()==v[k+1].getVentas() && v[k].getNombre().compareTo(v[k+1].getNombre())>0)) // Si un elemento es mayor que el siguiente, los intercambio
				
					{
					aux=v[k];
					v[k]=v[k+1];
					v[k+1]=aux;
					}
		}
	
	//BUSCAR COMERCIAL X UDS
		public static int buscarComercial2(Comercial comerciales[], int numComerciales, int uds) {
			for (int i=0; i<numComerciales; i++) {
				if (comerciales[i].getVentas()<uds) {
					return i;
				}
			}
			return -1;
		}

}
