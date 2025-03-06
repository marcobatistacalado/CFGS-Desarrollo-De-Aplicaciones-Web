package ej1_libros;

public class Texto extends Libro {
	private String curso;
	private double desc;
	
	//Source|Generate constructor using fields..
	public Texto(String libro, String autor, String editorial, double precio, String curso, double desc) {
		super(libro, autor, editorial, precio); //los datos los tiene pero siendo private no puedes acceder.
		this.curso = curso;
		this.desc = desc;
		//cambiar a protected si queremos utilizar: lo pueden ver sus hijos
		this.precio = this.precio*this.desc/100;
	}

	@Override
	public String toString() {
		//SUPER.TOSTRING --> LLAMAR AL STRING DEL PADRE
		return super.toString()+" ***TIPO Texto [curso=" + curso + ", desc=" + desc + "]";
	}
	
	
}
