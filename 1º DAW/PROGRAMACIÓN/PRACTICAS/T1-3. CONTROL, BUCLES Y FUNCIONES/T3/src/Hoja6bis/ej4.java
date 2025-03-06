package Hoja6bis;
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i = 97,contador = 0;
		while (true) {
			System.out.println("Introduce letra abecedario:");
			char letra = sc.nextLine().charAt(0);
			letra = Character.toLowerCase(letra);
			int letra1 = (int) (letra); 
			System.out.println(letra1);
			
			if (i != letra1) {
				System.out.println("LETRA INCORRECTA!");
				System.out.println("La siguiente letra es: "+(char)(i));
				contador++;
			}
			if (i==241) {
				i=110;
			}
			if (i==110) {
				i=240;
			}
			i++;
			
			if (contador>2) {
				System.out.println("VUELVES A COMENZAR");
				i=97;
				contador = 0;
			}
		}
		
	}

}
