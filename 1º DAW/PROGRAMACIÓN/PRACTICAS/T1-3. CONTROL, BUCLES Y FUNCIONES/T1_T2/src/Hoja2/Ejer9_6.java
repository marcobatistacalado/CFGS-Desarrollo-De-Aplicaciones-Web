package Hoja2;
import java.util.*;
public class Ejer9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int pi, pf, desc;
		System.out.println("Introduce el precio inicial:");
		pi = entrada.nextInt();
		System.out.println("Introduce el precio final:");
		pf = entrada.nextInt();
		desc = 100-((pf*100)/pi);
		System.out.println("El descuento aplicado es: "+desc+"%");
		entrada.close();//linea importante para quitar el warning
	}
	

}
