package ej8;

public class Vehiculo {
	private String matricula;
	private int tipo; //0-Cualq Vehiculo -- 1-Turismo
	private double distancia, precio;
	public Vehiculo(String matricula, int tipo, double distancia) {
		super();
		this.matricula = matricula;
		this.tipo = tipo;
		this.distancia = distancia;
	}
	public int getTipo() {
		return tipo;
	}
	public double getDistancia() {
		return distancia;
	}

	
}
