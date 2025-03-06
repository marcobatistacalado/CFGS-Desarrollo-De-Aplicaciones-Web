package t5strings;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String cad;
		do {
			System.out.println("Introduce cadena:");
			cad = sc.nextLine();
		}while(cad.equalsIgnoreCase("FIN")==false); //IgnoreCase es para que le de igual las mayus y minus
	}

}
