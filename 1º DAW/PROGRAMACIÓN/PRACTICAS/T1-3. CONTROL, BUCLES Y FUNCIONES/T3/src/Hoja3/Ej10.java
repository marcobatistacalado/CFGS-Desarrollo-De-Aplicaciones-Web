package Hoja3;
import java.util.*;
public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce salario base:");
		double base = sc.nextDouble();
		System.out.println("Introduce tu categoria:");
		sc.nextLine(); //instruccion para limpiar buffer después de dato númerico
		char cat = sc.nextLine().charAt(0);//recoger un caracter
		if (cat == 'C') {
			System.out.println("Introduce la seccion:");
			int sec = sc.nextInt();
			if (sec == 1) {
				System.out.println("Introduce el numero de dias:");
				int dias = sc.nextInt();
				int baja = 0;
				System.out.println("Introduce el numero de dias de baja injustificada");
				baja = sc.nextInt();
				base = base + (0.5*dias) - (30*baja); 
			}else {
				base = base + 120;
			}
			System.out.println("El sueldo final es de: "+base+"€");
		}
		else if (cat == 'A' || cat == 'B') {
			base = base + 240;
			System.out.println("El sueldo final es de: "+base+"€");
		} else {
			System.out.println("No has introducido una categoría");
		}
		
	}

}
