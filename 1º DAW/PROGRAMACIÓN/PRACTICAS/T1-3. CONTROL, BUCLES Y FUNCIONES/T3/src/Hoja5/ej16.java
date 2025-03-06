package Hoja5;
import java.util.*;
public class ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int fact = 5, total = 0, litrosart1 = 0, numfact = 0;
		
		while (fact >= 1) {
			System.out.println("Introduce cod:");
			int cod = sc.nextInt();
			System.out.println("Introduce la cantidad vendida en litros");
			int litros = sc.nextInt();
			System.out.println("Introduce precio por litro");
			int precio = sc.nextInt();
			
			total  = total + (litros*precio);
			if (cod == 1) {
				litrosart1 = litrosart1 + litros;
			}
			if (litros*precio > 600) {
				numfact = numfact + 1;
			}
			fact = fact - 1;
		}
		System.out.println("Facturación total: "+total+"€");
		System.out.println("Cantidad litros art 1: "+litrosart1+"L");
		System.out.println("Numero facts > 600: "+numfact);
	}

}
