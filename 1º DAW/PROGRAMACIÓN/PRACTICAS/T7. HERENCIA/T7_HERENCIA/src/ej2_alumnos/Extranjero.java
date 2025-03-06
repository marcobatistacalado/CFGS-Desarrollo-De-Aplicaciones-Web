package ej2_alumnos;

public class Extranjero extends Alumno {
	private String pais;

	public Extranjero(String nombre, String apellido, int curso, String pais) {
		super(nombre, apellido, curso);
		this.pais = pais;
		this.imp += this.imp*0.15;
	}

	@Override
	public String toString() {
		return "Extranjero"+super.toString()+"[pais=" + pais + "]";
	}

	
}
