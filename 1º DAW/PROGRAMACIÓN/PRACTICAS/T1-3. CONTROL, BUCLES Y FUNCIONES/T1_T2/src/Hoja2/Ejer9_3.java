package Hoja2;
import java.util.*;
public class Ejer9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int precio, descuento, calculo;
		System.out.println("Introduce el precio:");
		precio = entrada.nextInt();
		System.out.println("Introduce el descuento:");
		descuento = entrada.nextInt();
		calculo = precio - (precio*descuento/100);
		System.out.println("La prenda sin descuento es:"+precio+" y con descuento es de "+calculo);
		
	}

}
