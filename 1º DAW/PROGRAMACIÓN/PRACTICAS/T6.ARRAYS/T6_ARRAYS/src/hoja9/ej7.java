package hoja9;
import java.util.*;
public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)
;		Cargamento carga1 = new Cargamento ("Platano", "Madrid", 30, 10, 2);
		Cargamento cargamentos[] = new Cargamento [10];
		int numCargamentos=0;
		int menu, buscar;
		double rebaja, vender = 0;
		String nombre, proc;
		double numkg, costekilos, ventakilos;
		
		while(true) {
		System.out.println("1-Dar alta; 2-Mostrar info; 3-Rebajar 4-Vender; 5-Mostrar ganancias; 6-borrar");
		menu = sc.nextInt();
		
		switch (menu) {
			case 1:
				if (numCargamentos== cargamentos.length) {
					System.out.println("No hay espacio");
				}else {
					sc.nextLine();
					System.out.println("Nombre:");
					nombre = sc.nextLine();
					System.out.println("Procedencia:");
					proc = sc.nextLine();
					System.out.println("NumKilos:");
					numkg = sc.nextDouble();
					System.out.println("Coste kilos:");
					costekilos = sc.nextDouble();
					System.out.println("Venta kilos:");
					ventakilos = sc.nextDouble();
					cargamentos[numCargamentos]= new Cargamento (nombre,proc,numkg,costekilos,ventakilos);
					numCargamentos++;
				}
				break;
				
			case 2:
				for (int i = 0; i<numCargamentos;i++) {
					System.out.println(cargamentos[i].toString());
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Introduce fruta a rebajar:");
				nombre = sc.nextLine();
				System.out.println("Procedencia:");
				proc = sc.nextLine();
				System.out.println("Bajada: ");
				rebaja = sc.nextDouble();
				buscar = buscarCargamento1 (cargamentos, nombre, proc, numCargamentos);
				if (buscar == -1) {
					System.out.println("cargamento no encontrado");
				}else {
					cargamentos[buscar].rebajar(rebaja);
					System.out.println("Rebaja aplicada");
				}
				break;
			case 4:
				sc.nextLine();
				System.out.println("Introduce nombre de fruta a vender");
				nombre = sc.nextLine();
				System.out.println("Num kilos:");
				numkg = sc.nextDouble();
				int j=0;
				/*FORMA DIFICIL PERO EFICIENTE
				do {
					buscar = buscarCargamento2(cargamentos, nombre, numCargamentos, j);
					if (buscar == -1) {
						System.out.println("Cargamento no encontrado");
					}else {
						vender = cargamentos[buscar].vender(numkg);
						if (vender == -1) {
							j = buscar;
							System.out.println("No vendido");
						}else {
							System.out.println("Vendido");
						}
					}
				}while(vender == -1 || buscar == -1);*/
				
				//FORMA FACIL Y EFICIENTE
				 buscar = buscarCargamento3(cargamentos, nombre, numkg, numCargamentos);
				 if (buscar == -1){
					 System.out.println("no se encuentra");
				 }else{
					 cargamentos[buscar].vender(numkg);
				 } 
				 
				break;
			case 5:
				System.out.println("Ganancias totales: "+Cargamento.getGanancia());
				break;
				
			case 6:
				//BORRADO
				sc.nextLine();
				System.out.println("Introduce fruta a borrar:");
				nombre = sc.nextLine();
				System.out.println("Procedencia:");
				proc = sc.nextLine();
				buscar = buscarCargamento1 (cargamentos, nombre, proc, numCargamentos);
				if (buscar == -1 ) {
					System.out.println("No encontradp el cargamento");
				}else {
					for (int i=buscar; i<numCargamentos-1; i++) {
						cargamentos[i] = cargamentos[i+1];
					}
					cargamentos[numCargamentos-1] = null; //si es de objetos pues null.
					numCargamentos--;
				}
				break;
		}
		}
		
		
	}
	public static int buscarCargamento1(Cargamento cargamentos[], String nombre, String proc, int numCargamentos) {
		for (int i=0; i<numCargamentos; i++) {
			if (cargamentos[i].getNombre().equalsIgnoreCase(nombre) && cargamentos[i].getProcedencia().equalsIgnoreCase(proc)) {
				return i;
			}
		}
		return -1;
	}
	public static int buscarCargamento2(Cargamento cargamentos[], String nombre, int numCargamentos, int j) {
		for (; j<numCargamentos; j++) {
			if (cargamentos[j].getNombre().equalsIgnoreCase(nombre)) {
				return j;
			}
		}
		return -1;
	}
	//FORMA FACIL
	public static int buscarCargamento3(Cargamento cargamentos[], String nombre, double numkg, int numCargamentos) {
		for (int i = 0; i<numCargamentos; i++) {
			if (cargamentos[i].getNombre().equalsIgnoreCase(nombre) && cargamentos[i].getNkg() >= numkg) {
				return i;
			}
		}
		return -1;
	}


}
