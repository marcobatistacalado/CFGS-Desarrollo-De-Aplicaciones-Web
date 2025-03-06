package ej4_poligonos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Poligono[] poligonos = new Poligono[3];
		int cont = 0, poligono;
		poligonos[0] = new Cuadrado(5);
		poligonos[1] = new Rectangulo(5, 6);
		poligonos[2] = new Triangulo(5, 6, 8);
		
		System.out.println(poligonos[0].area());
		System.out.println(poligonos[0].perimetro());
		System.out.println(poligonos[1].area());
		System.out.println(poligonos[1].perimetro());
		System.out.println(poligonos[2].area());
		System.out.println(poligonos[2].perimetro());
		
		
	}

}
