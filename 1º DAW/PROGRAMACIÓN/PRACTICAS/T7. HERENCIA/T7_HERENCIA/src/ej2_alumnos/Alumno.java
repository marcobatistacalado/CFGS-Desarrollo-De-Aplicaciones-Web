package ej2_alumnos;

public class Alumno {
	private String nombre, apellido;
	private int  curso;
	protected double imp;
	public Alumno(String nombre, String apellido, int curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
		this.imp = 100;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", imp=" + imp + "]";
	}
}
