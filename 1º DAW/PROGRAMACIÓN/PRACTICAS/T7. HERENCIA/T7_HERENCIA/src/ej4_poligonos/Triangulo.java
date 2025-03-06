package ej4_poligonos;

public class Triangulo extends Poligono {
	private int base, altura;
	public Triangulo(int lado, int base, int altura) {
		super(lado);
		// TODO Auto-generated constructor stub
		this.base=base;
		this.altura=altura;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		int area;
		area = (base*altura)/2;
		return area; 

	}

	@Override
	public int perimetro() {
		// TODO Auto-generated method stub
		int perimetro;
		perimetro = (2*lado)+(base);
		return perimetro; 
	}

}
