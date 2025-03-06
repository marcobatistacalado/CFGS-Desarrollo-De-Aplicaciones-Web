package ej2_alumnos;

public class Puente extends Alumno {
	private String carreraProc;

	public Puente(String nombre, String apellido, int curso, String carreraProc) {
		super(nombre, apellido, curso);
		this.carreraProc = carreraProc;
	}

	@Override
	public String toString() {
		return "Puente"+super.toString()+" [carreraProc=" + carreraProc + "]";
	}
}
