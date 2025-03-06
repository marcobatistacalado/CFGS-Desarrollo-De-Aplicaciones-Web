package ej3;

import java.util.Scanner;

public class Pase extends Cliente {
	Scanner sc = new Scanner (System.in);
	public Pase(String nombre, String pelicula, int nEntradas, int gratis) {
		super(nombre, pelicula, nEntradas);
		
		if ((this.nEntradas - gratis)<0) {
			this.nEntradas = 0;
		}else {
			this.nEntradas -= gratis;
		}
	}
	@Override
	public String toString() {
		return super.toString()+" --- Pase ";
	}

}
