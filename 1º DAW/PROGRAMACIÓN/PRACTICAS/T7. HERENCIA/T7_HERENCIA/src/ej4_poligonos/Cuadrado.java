package ej4_poligonos;

public class Cuadrado extends Poligono {

	public Cuadrado(int lado) {
		super(lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		int area;
		area = lado*lado;
		return area; 

	}

	@Override
	public int perimetro() {
		// TODO Auto-generated method stub
		int perimetro;
		perimetro = 4*lado;
		return perimetro; 
	}

}
