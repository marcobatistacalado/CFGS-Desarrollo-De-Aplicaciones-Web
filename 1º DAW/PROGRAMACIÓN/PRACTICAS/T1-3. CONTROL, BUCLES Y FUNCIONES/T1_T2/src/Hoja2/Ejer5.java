package Hoja2;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el radio: ");

		double radio= entrada.nextDouble(), pi=3.1416, area;
		area=pi*radio*radio;
		System.out.println("El area es: "+area);
	}

}
