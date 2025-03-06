package ej3;

import java.util.Scanner;
import java.util.Vector;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sala[] salas = new Sala[2]; // Array de dos salas.
		salas[0] = new Sala("Ghost");
		salas[1] = new Sala("Wonka");
		Vector<Cliente> cola = new Vector<Cliente>();

		int menu = 0;
		do {
			System.out.println("MENU:-------------------");
			System.out.println("1) LLEGADA PERSONA");
			System.out.println("2) COMPRAR ENTRADAS");
			System.out.println("3) MOSTRAR");
			System.out.println("4) SALIR");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				menu = altaClientes(sc, cola, salas);
				break;
			case 2:
			    if (cola.size() == 0) // Controlar que existe gente en la cola
			        break;
			    Cliente c = cola.remove(0); // Eliminar y almacenar el cliente que está en la cabeza de la cola
			    String pelicula = c.getPelicula();
			    int pos = buscarSala(salas, pelicula);
			    try {
					comprar(salas, cola, c, pos);
				} catch (SalaLlenaException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					borrarSiSalaLlena(salas, cola, pos);
				}
			    
			    //Si ambas salas llenas = opcion3.
			    if (salas[0].getCapacidad() == 0 && salas[1].getCapacidad() == 0) {
			        // Mostrar opción 3
			        mostrarCola(cola);
			        mostrarSalas(salas);
			    }
			    break;


			case 3:
				mostrarCola(cola);
				mostrarSalas(salas);
				break;
			}
		} while (menu != 4);
	}

	private static void comprar(Sala[] salas, Vector<Cliente> cola, Cliente c, int pos) throws SalaLlenaException {
		if (salas[pos].getCapacidad() != 0) {
		    double compra = c.comprar(); // Utilizar el método comprar del cliente almacenado en c
		    salas[pos].modCapacidad(c.getnEntradas()); // Actualizar la capacidad de la sala
		    salas[pos].setRecaudacion(compra); // Guardar la recaudación de la sala
		    System.out.println("Total a pagar: " + compra);
		    System.out.println("Ha sido borrado...");
		} else {
			throw new SalaLlenaException("La sala está llena. No se pueden comprar más entradas.");
		}
	}

	private static void borrarSiSalaLlena(Sala[] salas, Vector<Cliente> cola, int pos) {
		// Si la sala está llena, eliminar a todos los clientes de la cola que querían ver esa película
		for (int i = 0; i < cola.size(); i++) {
		    if (cola.get(i).getPelicula().equals(salas[pos].getPelicula())) {
		        cola.remove(i); // Eliminar cliente
		        i--; // Decrementar el índice para ajustar la eliminación: ya que Vectores elimina el hueco entonces hay que decrementar el size total.
		        System.out.println("Cliente borrado porque sala llena");
		    }
		}
	}

	private static void mostrarSalas(Sala[] salas) {
		for (int i = 0; i < salas.length; i++) {
			System.out.println("nº personas en sala " + i + ":" + (40 - salas[i].getCapacidad()));
			System.out.println("total recaudado sala " + i + ":" + salas[i].getRecaudacion());
		}
	}

	private static void mostrarCola(Vector<Cliente> cola) {
		for (int i = 0; i < cola.size(); i++) {
			System.out.println(cola.get(i).toString());
		}
	}

	private static int buscarSala(Sala[] salas, String pelicula) {
		int pos=-1;
		for (int i = 0; i < salas.length; i++) {
			if (pelicula.equals(salas[i].getPelicula())) {
				pos = i;
			}
		}
		return pos;
	}

	private static int altaClientes(Scanner sc, Vector<Cliente> cola, Sala[] salas) {
		int menu;
		String nombre, pelicula, carnet;
		int numEntradas;
		System.out.println("Nombre");
		nombre = sc.nextLine();
		do {
			System.out.println("Pelicula");
			pelicula = sc.nextLine();
		} while (buscarSala(salas, pelicula) == -1); // Validar																						
																										
		System.out.println("Numero entradas");
		numEntradas = sc.nextInt();

		System.out.println("Eres 1)Pase 2)Socio 3) Normal");
		menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Introduce numero de entradas gratuitas: ");
			int gratis = sc.nextInt(); 
			cola.add(new Pase(nombre, pelicula, numEntradas, gratis));
			break;
		case 2:
			System.out.println("Carnet: ");
			carnet = sc.nextLine();
			cola.add(0, new Socio(nombre, pelicula, numEntradas, carnet)); //pos 0 pq tienen preferencia.
			break;
		case 3:
			cola.add(new Cliente(nombre, pelicula, numEntradas));
			break;
		}
		return menu;
	}

}
