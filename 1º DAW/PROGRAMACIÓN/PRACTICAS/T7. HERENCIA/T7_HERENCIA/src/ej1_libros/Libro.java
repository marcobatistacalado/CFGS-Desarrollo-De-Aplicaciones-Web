package ej1_libros;

public class Libro {
	private String  libro, autor, editorial;
	protected double precio; //para que pueda usarlo el hijo
	public Libro(String libro, String autor, String editorial, double precio) {
		super();
		this.libro = libro;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Libro [libro=" + libro + ", autor=" + autor + ", editorial=" + editorial + ", precio=" + precio + "]";
	}
	public double getPrecio() {
		return precio;
	}
}
