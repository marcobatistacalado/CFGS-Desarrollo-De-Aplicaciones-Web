package hoja9;

public class Alumno {
	private static int numeroalumnos = 0;
	private String nombre, apellidos, DNI, numero;
	private int n1,n2,n3, nmedia = 0;
	public Alumno(String nombre, String apellidos, String dNI, String numero) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.numero = numero;
		numeroalumnos++;
	}
	
	public void actualizarNota(int asignatura, int nota) {
		switch (asignatura) {
		case 1:
			n1 = nota;
			break;
		case 2:
			n2 = nota;
			break;
		case 3:
			n3 = nota;
			break;
		}
		nmedia = (n1+n2+n3)/3;
		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", numero=" + numero + ", n1="
				+ n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
	}

	public int getNmedia() {
		return nmedia;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public int getN3() {
		return n3;
	}
	

	
	
	


}