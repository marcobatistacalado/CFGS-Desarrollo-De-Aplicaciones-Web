package hoja9;

import java.util.Arrays;
import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Equipo equipos [] = new Equipo[2];
		
		for (int i = 0; i<equipos.length;i++) {
			System.out.println("Nombre:");
			String nombre = sc.nextLine();
			
			Equipo e = new Equipo (nombre);//objeto
			equipos[i] = e;//pasar al array
		}
		
		int anotar = 1;
		int opc;
		do{
			System.out.println("Anota opcion: 1 - Partido; 2 - Ordenar; 3 - Mostrar; 4 - Salir");
			opc = sc.nextInt();
			
			if (opc == 4) {
				break;
			}
			
			switch (opc) {
				case 1:
					String eq1, eq2;
					int gol1, gol2;
					int buscar1, buscar2;
					sc.nextLine();
					do {
						System.out.println("Nombre equipo1 = ");
						eq1 = sc.nextLine();
						buscar1 = buscarEquipo (equipos,eq1);
					}while(buscar1 == -1);
					do {
						System.out.println("Nombre equipo2 = ");
						eq2 = sc.nextLine();
						buscar2 = buscarEquipo (equipos,eq2);
					}while(buscar2 == -1);
					System.out.println("Goles equipo1 ");
					gol1 = sc.nextInt();
					System.out.println("Goles equipo2");
					gol2 = sc.nextInt();
					
					Equipo.anotarPartido(equipos[buscar1], equipos[buscar2], gol1, gol2);
					//otra forma seria tener en la clase un metodo al que se le pasa un equipo y los goles
					//equipos[1].partido2(equipos[pos2], g1, g2)
					// es decir actualizamos llamando al objeto equipo 1 del que cogemos las variables y las actualizamos
					// y el equipo 2 copmo se lo pasamos solo llamamos e2.victorias++; .... 
					equipos[buscar1].anotarPartido2(equipos [buscar2], gol1, gol2);
					
					break;
				case 2:
					//ORDENAR POR PUNTOS --> BURBUJA
					burbuja(equipos, equipos.length);
					for (int i = 0; i<equipos.length; i++) {
						System.out.println(equipos[i].toString());
					}
					
					break;
				case 3:
					//MOSTRAR INFO EQUIPOS
					for (int i = 0; i<equipos.length; i++) {
						System.out.println(equipos[i].toString());
					}
					break;					
			}			
			
		}while(opc != 4);


	}
	
	public static int buscarEquipo(Equipo equipos[], String nombre) {
		for (int i=0; i<equipos.length; i++) {
			if (equipos[i].getNombre().equalsIgnoreCase(nombre)) {
				return i;//retornar posicion para saber que vehiculo es
			}
		}
		return -1;
	}
	
	public static void burbuja(Equipo v[], int TAM){
		int j,k;
		Equipo aux;
		for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
			
			for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al final del array.
	
				if (v[k].getPuntos()<v[k+1].getPuntos()) // Si un elemento es mayor que el siguiente, los intercambio
			
				{
				aux=v[k];
				v[k]=v[k+1];
				v[k+1]=aux;
				}
	}

}
