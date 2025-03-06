package Hoja6bis;
import java.util.*;
public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 3999) {
            System.out.print("Número romano equivalente: ");
            // Millares
            int millares = numero / 1000;
            for (int i = 0; i < millares; i++) {
                System.out.print("M");
            }
            numero %= 1000;
            
            // Centenas
            int centenas = numero / 100;
            if (centenas == 9) {
                System.out.print("CM");
            } else if (centenas >= 5) {
                System.out.print("D");
                for (int i = 5; i < centenas; i++) {
                    System.out.print("C");
                }
            } else if (centenas == 4) {
                System.out.print("CD");
            } else {
                for (int i = 0; i < centenas; i++) {
                    System.out.print("C");
                }
            }
            numero %= 100;
            
            // Decenas
            int decenas = numero / 10;
            if (decenas == 9) {
                System.out.print("XC");
            } else if (decenas >= 5) {
                System.out.print("L");
                for (int i = 5; i < decenas; i++) {
                    System.out.print("X");
                }
            } else if (decenas == 4) {
                System.out.print("XL");
            } else {
                for (int i = 0; i < decenas; i++) {
                    System.out.print("X");
                }
            }
            numero %= 10;
            
            // Unidades
            if (numero == 9) {
                System.out.print("IX");
            } else if (numero >= 5) {
                System.out.print("V");
                for (int i = 5; i < numero; i++) {
                    System.out.print("I");
                }
            } else if (numero == 4) {
                System.out.print("IV");
            } else {
                for (int i = 0; i < numero; i++) {
                    System.out.print("I");
                }
            }
            
            System.out.println(); // Salto de línea al final
        } else {
            System.out.println("El número debe estar en el rango de 1 a 3999 para ser representado en números romanos.");
        }
        
        sc.close();
    }
}


