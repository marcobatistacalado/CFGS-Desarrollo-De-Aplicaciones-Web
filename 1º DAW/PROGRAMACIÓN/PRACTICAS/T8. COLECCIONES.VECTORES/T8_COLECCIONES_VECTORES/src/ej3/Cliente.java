package ej3;

public class Cliente {
	protected static final double pEntrada = 10; // Precio entrada normal.
	private String nombre, pelicula;
	protected int nEntradas;

	public Cliente(String nombre, String pelicula, int nEntradas) {
		super();
		this.nombre = nombre;
		this.pelicula = pelicula;
		this.nEntradas += nEntradas;
	}
	
	public double comprar () {
		double compra = this.nEntradas*pEntrada;
		return compra;
	}

	public String getPelicula() {
		return pelicula;
	}

	public int getnEntradas() {
		return nEntradas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", pelicula=" + pelicula + ", nEntradas=" + nEntradas + "]";
	}

}
