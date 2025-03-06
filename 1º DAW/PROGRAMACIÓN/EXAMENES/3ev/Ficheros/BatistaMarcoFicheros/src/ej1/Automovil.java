package ej1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Automovil {
	private String matricula, dni, nombre, apellido;
	private double precio;
	private LocalDate fcompra;

	public Automovil(String matricula, LocalDate fcompra, String precio, String dni, String nombre, String apellido) {
		super();
		this.matricula = matricula;
		this.dni = dni;
		try {
			this.precio = Double.parseDouble(precio);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		this.nombre = nombre;
		this.apellido = apellido;
		this.fcompra = fcompra;
	}

	public double getPrecio() {
		return precio;
	}

	public LocalDate getFcompra() {
		return fcompra;
	}

	@Override
	public String toString() {
		return "Automovil [matricula=" + matricula + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", precio=" + precio + ", fcompra=" + fcompra + "]";
	}
}
