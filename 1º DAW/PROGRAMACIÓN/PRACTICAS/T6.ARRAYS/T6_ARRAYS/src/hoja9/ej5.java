package hoja9;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String mat, mod, mar;
		int cat,ano;
		/*ARRAY DE OBJETOS*/
		Vehiculo vehiculos[] = new Vehiculo [5];
		
		for (int i=0; i<5; i++) {
			vehiculos[i] = validarVehiculo(sc);
		}
		
		System.out.println("Matricula");
		mat = sc.nextLine();
		int encontrar = buscarMatricula(vehiculos, mat);
		
		if(encontrar != -1) {
			//mostrar ese vehiculo
			System.out.println(vehiculos[encontrar].toString());
		}
		
		System.out.println("Ordenar por ganancias");
		burbuja(vehiculos, vehiculos.length);
		for (int i = 0; i<vehiculos.length; i++) {
			System.out.println(vehiculos[i].toString());
		}
		
		
	}
	public static int buscarMatricula(Vehiculo vehiculos[], String mat) {
		for (int i=0; i<vehiculos.length; i++) {
			if (vehiculos[i].getMat().equalsIgnoreCase(mat)) {
				return i;//retornar posicion para saber que vehiculo es
			}
		}
		return -1;
	}

	private static Vehiculo validarVehiculo(Scanner sc) {
		String mat;
		String mod;
		String mar;
		int cat;
		int ano;
		do {
			System.out.println("Matricula");
			mat = sc.nextLine();
		}while(validarMat(mat)==false);
		System.out.println("Marca");
		mar = sc.nextLine();
		System.out.println("Modelo");
		mod = sc.nextLine();
		do {
			System.out.println("Categoria");
			cat = sc.nextInt();
		}while(cat != 1 && cat != 2);
		do {
		System.out.println("Ano");
		ano = sc.nextInt();
		}while(ano<0 || ano>2023);
		sc.nextLine();
		Vehiculo a = new Vehiculo (mat, mar, mod, ano, cat);
		return a;
	}
	
	public static boolean validarMat (String mat) {
		mat = mat.toUpperCase();
		if (mat.length()!=7) {
			return false;
		}
		for (int i = 0; i<=3;i++) {
			char cod1 = mat.charAt(i);
			if (cod1 < '0' || cod1>'9') {
				return false;
			}
		}
		for (int b=4; b<=mat.length()-1;b++) {
			char cod2 = mat.charAt(b);
			if (cod2 < 'A' || cod2> 'Z') {
				return false;
			}
		}
		return true;
	}
	
	public static void burbuja(Vehiculo v[], int TAM){
		int j,k;
		Vehiculo aux;
		for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
			
			for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al final del array.
	
				if (v[k].getGanan()<v[k+1].getGanan()) // Si un elemento es mayor que el siguiente, los intercambio
			
				{
				aux=v[k];
				v[k]=v[k+1];
				v[k+1]=aux;
				}
	}


}
