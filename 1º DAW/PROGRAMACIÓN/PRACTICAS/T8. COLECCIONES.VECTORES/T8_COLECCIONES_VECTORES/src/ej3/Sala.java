package ej3;



public class Sala {

	private int capacidad = 40;
	private String pelicula;
	private double recaudacion=0;

	public Sala(String pelicula) {
		super();
		this.pelicula = pelicula;
	}

	public boolean modCapacidad(int capacidad) {
		if (capacidad>this.capacidad) {
			return false;
		}
		this.capacidad -= capacidad;
		return true;
	}

	public String getPelicula() {
		return pelicula;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setRecaudacion(double recaudacion) {
		this.recaudacion += recaudacion;
	}

	public double getRecaudacion() {
		return recaudacion;
	}


}
