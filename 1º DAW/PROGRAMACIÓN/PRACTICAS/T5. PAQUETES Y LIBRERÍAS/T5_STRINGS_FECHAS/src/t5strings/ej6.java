package t5strings;
import java.util.*;
public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        if (esLeible(palabra)) {
            System.out.println(palabra + " es igual del derecho que del revés.");
        } else {
            System.out.println(palabra + " no es igual del derecho que del revés.");
        }
    }

    public static boolean esLeible(String palabra) {
        int longitud = palabra.length();
        for (int i = 0; i < longitud - 1; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
