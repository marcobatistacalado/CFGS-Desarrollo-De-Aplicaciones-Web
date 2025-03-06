package ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Videojuego> videojuegos = new ArrayList<>();
		ArrayList<Serie> series = new ArrayList<>();

		videojuegos.add(new Videojuego("Super Mario Bros", "Plataforma", "Nintendo"));
		videojuegos.add(new Videojuego("Minecraft", "Sandbox", "Mojang"));
		videojuegos.add(new Videojuego("FIFA 22", "Deportes", "EA Sports"));

		series.add(new Serie("Friends", "Comedia"));
		series.add(new Serie("Breaking Bad", "Drama"));
		series.add(new Serie("Stranger Things", "Ciencia ficción"));

		int menu = 1;
		String seleccion;
		boolean seguir = true;
		while (seguir == true) {
			System.out.println("1) Serie, 2) Videojuego");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("Introduce el nombre de la serie a reservar:");
				sc.nextLine(); 
				seleccion = sc.nextLine();
				int pos = encontrarSerie(series, seleccion);
				if (pos != -1) {
					System.out.println("1)Prestar");
					System.out.println("2)Devolver");
					System.out.println("3)ESTADO");
					menu = sc.nextInt();
					switch (menu) {
					case 1:
						if (series.get(pos).prestar()) {
							series.get(pos).aumentarContadorPrestamos();
							System.out.println("Prestado con éxito");
						} else {
							System.out.println("No se puede prestar");
						}
						break;
					case 2:
						if (series.get(pos).devolver()) {
							System.out.println("Devuelto con éxito");
						} else {
							System.out.println("No se puede devolver");
						}
						break;
					case 3:
						System.out.println("Estado: "+series.get(pos).isEntregado());
						break;
					}

				} else {
					System.out.println("Serie no encontrada");
				}

			} else {
				System.out.println("Introduce el nombre del videojuego a reservar:");
				sc.nextLine(); 
				seleccion = sc.nextLine();
				int pos = encontrarVideojuego(videojuegos, seleccion);
				if (pos != -1) {
					System.out.println("1)Prestar");
					System.out.println("2)Devolver");
					System.out.println("3)ESTADO");
					menu = sc.nextInt();
					switch (menu) {
					case 1:
						if (videojuegos.get(pos).prestar()) {
							videojuegos.get(pos).aumentarContadorPrestamos();
							System.out.println("Prestado con éxito");
						} else {
							System.out.println("No se puede prestar");
						}
						break;
					case 2:
						if (videojuegos.get(pos).devolver()) {
							System.out.println("Devuelto con éxito");
						} else {
							System.out.println("No se puede devolver");
						}
						break;
					case 3:
						System.out.println("Estado: "+videojuegos.get(pos).isEntregado());
						break;
					}

				} else {
					System.out.println("Videojuego no encontrada");
				}

			}
			System.out.println("Si no quieres continuar introduce 0.");
			if (sc.nextInt() == 0) {
				seguir = false;
			}
		}
		// Al finalizar el programa
		// Calcula los ingresos totales por préstamos de series y videojuegos
		double ingresosSeries = 0;
		for (Serie serie : series) {
		    ingresosSeries += serie.getContadorPrestamos() * 2; // 2 euros por temporada
		}

		double ingresosVideojuegos = 0;
		for (Videojuego videojuego : videojuegos) {
		    ingresosVideojuegos += videojuego.getContadorPrestamos() * 0.5; // 0,5 euros por hora estimada
		}

		// Muestra los ingresos totales
		System.out.println("Ingresos por préstamos de series: " + ingresosSeries + " euros");
		System.out.println("Ingresos por préstamos de videojuegos: " + ingresosVideojuegos + " euros");


	}

	private static int encontrarSerie(ArrayList<Serie> series, String seleccion) {
		for (int i = 0; i < series.size(); i++) {
			if (series.get(i).getTitulo().equals(seleccion)) {
				return i;
			}
		}
		return -1;
	}
	
	private static int encontrarVideojuego(ArrayList<Videojuego> videojuegos, String seleccion) {
		for (int i = 0; i < videojuegos.size(); i++) {
			if (videojuegos.get(i).getTitulo().equals(seleccion)) {
				return i;
			}
		}
		return -1;
	}

}
