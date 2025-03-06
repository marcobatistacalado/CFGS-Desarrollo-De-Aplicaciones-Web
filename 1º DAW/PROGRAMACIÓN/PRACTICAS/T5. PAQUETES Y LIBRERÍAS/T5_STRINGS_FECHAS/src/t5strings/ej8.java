package t5strings;
import java.util.*;
public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una cadena:");
		String cad1=sc.nextLine();
		int max1=cad1.length();
		System.out.println("Introduce una cadena:");
		String cad2=sc.nextLine();
		int max2=cad2.length();
		
		if (max1<max2) {
			String temp = cad1;
			cad1=cad2;
			cad2=temp;
		}
		
		if (cad1.indexOf(cad2) != -1) {
			int posicion = cad1.indexOf(cad2);
			System.out.println("Una está contenida en la otra");
			System.out.println("Posicion: "+posicion);
		}else {
			System.out.println("No se contienen ninguna");
		}
		

	}

}
