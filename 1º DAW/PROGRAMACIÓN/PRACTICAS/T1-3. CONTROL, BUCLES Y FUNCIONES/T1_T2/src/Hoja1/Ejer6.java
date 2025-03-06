package Hoja1;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean calculo;
		double ingresos=1500.5;
		int edad=20, estudios=4;
		calculo = edad < 28;
		System.out.println(calculo);
		calculo = estudios > 3;
		System.out.println(calculo);
		calculo = ingresos > 28000;
		System.out.println(calculo);
		calculo = edad < 28 && estudios > 3 && ingresos > 2800;
		System.out.println("TOTAL = "+calculo);
		
	}

}
