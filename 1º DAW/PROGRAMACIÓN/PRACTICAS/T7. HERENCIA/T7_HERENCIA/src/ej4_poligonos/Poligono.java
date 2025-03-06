package ej4_poligonos;

public abstract class Poligono {
	protected int lado;

	public Poligono(int lado) {
		super();
		this.lado = lado;
	}

	abstract public int area();

	abstract public int perimetro();

}
