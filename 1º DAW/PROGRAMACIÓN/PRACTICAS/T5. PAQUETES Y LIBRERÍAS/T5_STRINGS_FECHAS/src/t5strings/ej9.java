package t5strings;

import java.util.Scanner;
public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena:");
        String cadena1 = sc.nextLine();

        System.out.println("Introduce la segunda cadena:");
        String cadena2 = sc.nextLine();

        if (cadena1.length() > cadena2.length()) {
            System.out.println("Número de veces que se repite la cadena más corta en la más larga: " + contarRepeticiones(cadena2, cadena1));
        } else {
            System.out.println("Número de veces que se repite la cadena más corta en la más larga: " + contarRepeticiones(cadena1, cadena2));
        }
    }

    public static int contarRepeticiones(String shorter, String longer) {
        int count = 0;
        String upperCaseShorter = shorter.toUpperCase();

        for (int i = 0; i <= longer.length() - shorter.length(); i++) {
            if (longer.substring(i, i + shorter.length()).equalsIgnoreCase(shorter)) {
                count++;
                longer = longer.substring(0, i) + upperCaseShorter + longer.substring(i + shorter.length());
            }
        }
        System.out.println("Cadena más larga después de reemplazar: " + longer);
        return count;
    }

}
