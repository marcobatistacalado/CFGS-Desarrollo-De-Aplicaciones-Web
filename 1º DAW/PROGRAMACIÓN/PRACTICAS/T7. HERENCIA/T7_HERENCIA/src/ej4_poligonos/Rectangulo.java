package ej4_poligonos;

public class Rectangulo extends Poligono {
	private int base;
	public Rectangulo(int lado, int base) {
		super(lado);
		// TODO Auto-generated constructor stub
		this.base=base;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		int area;
		area = lado*base;
		return area; 

	}

	@Override
	public int perimetro() {
		// TODO Auto-generated method stub
		int perimetro;
		perimetro = (2*base)+(2*lado);
		return perimetro; 
	}

}
