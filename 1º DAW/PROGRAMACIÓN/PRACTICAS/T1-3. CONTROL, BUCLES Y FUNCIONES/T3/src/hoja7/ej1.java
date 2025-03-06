package hoja7;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (true) {
			System.out.println("Introduce número empleado:");
			int nempleado = sc.nextInt();
			if (nempleado == 0) {
				break;
			}
			System.out.println("Introduce sueldo:");
			float sueldo = sc.nextFloat();
			System.out.println("Introduce horas extras:");
			int horas = sc.nextInt();
			System.out.println("Introduce precio/hora extra");
			float precioHora = sc.nextFloat();
			System.out.println("Otros ingresos:");
			float otros = sc.nextFloat();
			
			float salariofinal = calcularSalario(sueldo, horas, precioHora, otros);
			if (salariofinal>600) {
				System.out.println("Nº EMPLEADO: "+nempleado);
				System.out.println("Percibe +600€");
			}
		}
		
		
	}
	public static float calcularSalario (float sueldo, int horas, float precioHora, float otros) {
		float salariototal = sueldo + (horas*precioHora) + otros;
		return salariototal;
		
	}

}
