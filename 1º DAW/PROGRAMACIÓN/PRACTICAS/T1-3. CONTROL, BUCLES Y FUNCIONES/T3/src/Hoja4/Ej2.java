package Hoja4;
import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ( System.in);
		System.out.print("Introduce un número de tres cifras: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 999) {
            int tercerDigito = numero % 10;
            int segundoDigito = (numero / 10) % 10;
            int primerDigito = numero / 100;

            System.out.println("Cifras en orden inverso: " + tercerDigito + segundoDigito + primerDigito);
        } else {
            System.out.println("El número no es de tres cifras.");
        }

	}

}
