package hoja9;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//ARRAY DE OBJETOS
		Garaje garajes [] = new Garaje[5];
		int id;
		
		//id, m2, planta
		for (int i = 0; i<garajes.length;i++) {
			System.out.println("ID:");
			id = sc.nextInt();
			System.out.println("M2");
			double m2 = sc.nextDouble();
			int planta;
			do {
				System.out.println("Planta");
				planta = sc.nextInt();
			}while(planta < -1 || planta > 2);
			//creación de cada objeto del array (variable temporal)
			Garaje g = new Garaje (id, m2, planta);
			garajes[i] = g;
			
		}
		int buscar;
		do {
			System.out.println("Introduce ID para alquilar:");
			id = sc.nextInt();
			buscar = buscarGaraje(garajes, id);
			if (buscar == -1) {
				System.out.println("Garaje no encontrado");
			}
		}while(buscar == -1);
		
		if (garajes[buscar].isAlquilado()) {
			System.out.println("Ya está alquilado");
		}else {
			System.out.println("Está libre, te lo alquilamos por un año.");
			garajes[buscar].setAlquilado();//metodo alquilar
		}
		
		System.out.println("Introduce el ID del garaje que quieres saber el precio:");
		id = sc.nextInt();
		buscar = buscarGaraje(garajes, id);
		double precio = garajes[buscar].getPreciog();
		System.out.println("PRECIO: "+precio);
		
		buscarGarajelibre(garajes);
		
		System.out.println("Introduce el porcentaje de subida:");
		int porc = sc.nextInt();
		System.out.println("ID");
		id = sc.nextInt();
		buscar = buscarGaraje(garajes, id);
		
		if (garajes[buscar].isAlquilado()) {
			System.out.println("Ya está alquilado");
		}else {
			System.out.println("Está libre,AUMENTAMOS EL PRECIO");
			garajes[buscar].setPreciog(porc);
		}
		
		System.out.println("BENEFICIOS TOTALES: "+Garaje.getBeneficios());
		
		
		
		System.out.println(garajes[0].toString());
	}
	public static int buscarGaraje(Garaje garajes[], int id) {
		for (int i=0; i<garajes.length; i++) {
			if (garajes[i].getId() == id) {
				return i;//retornar posicion para saber que vehiculo es
			}
		}
		return -1;
	}
	
	public static void buscarGarajelibre(Garaje garajes[]) {
		for (int i=0; i<garajes.length; i++) {
			if (garajes[i].isAlquilado() == false) {
				System.out.println(garajes[i].toString());//retornar posicion para saber que vehiculo es
			}
		}
	}

}
