package ejercicios;

import java.time.LocalDate;


public class Alumno implements Comparable <Alumno>{
	private String nombre, apellido;
	private double nota;
	private LocalDate fnac;
	public Alumno(String nombre, String apellido, double nota, LocalDate fnac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.fnac = fnac;
	}
	
	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + ", fnac=" + fnac + "]";
	}
	
	//ordenar por nota
	public int compareTo(Alumno al) {
		return ((Double)al.nota).compareTo(nota);
		//el tipo double no tiene metodos por eso debemos hacer el cast a tipo Double que es el wrapper que si tiene metodos.
	}
	
}
