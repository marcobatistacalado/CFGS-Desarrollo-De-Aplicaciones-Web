package Hoja2;
import java.util.*;
public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		boolean jasp;
		double ingresos;
		int edad, estudios;
		System.out.println("Introduce ingresos:");
		ingresos = entrada.nextInt();
		System.out.println("Introduce edad:");
		edad = entrada.nextInt();
		System.out.println("Introduce estudios:");
		estudios = entrada.nextInt();
		
		jasp = edad < 28;
		System.out.println(jasp);
		jasp = estudios > 3;
		System.out.println(jasp);
		jasp = ingresos > 28000;
		System.out.println(jasp);
		
		jasp = edad < 28 && estudios > 3 && ingresos > 2800;
		System.out.println("TOTAL = "+jasp);
		
	}

}
