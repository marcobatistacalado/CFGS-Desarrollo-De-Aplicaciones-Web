package t5strings;
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		boolean b=true;
		while (true) {
			System.out.println("Introduce DNi:");
			String DNI = sc.nextLine();
			
			
			if (validarDNI(DNI) == true) {
				System.out.println("DNI CORRECTO");
				break;
			}else {
				System.out.println("DNI incorrecto");
			}
		}
		
	}
	public static boolean validarDNI(String DNI) {
		//LONGITUD
		if (DNI.length()<2 || DNI.length()>9) {
			return false;
		}
		//OBTENER EL ULTIMO CARACTER
		// tambien--> DNI.charAT(8);
		char letra = DNI.charAt(DNI.length() - 1);
		letra = Character.toUpperCase(letra);
		if (letra < 'A' || letra > 'Z') {
			return false;
		}

		//COMPROBAR QUE SON NUMEROS
		for (int i = 0; i<DNI.length()-2; i++) {
			int num = Integer.parseInt(DNI.substring(i,i+1));
			if (num<0 || num>9)
				return false;
			if (DNI.charAt(i)<'0'||DNI.charAt(i)>'9') {
				return false;
			}
		}
		//Integer.parseInt --> pasar String a Int.
				//substring
		int entero = Integer.parseInt(DNI.substring(0,DNI.length()-1));
		char letraCalculada = calcularLetraDNI(entero);		
		if(letraCalculada != letra) {
			return false;
		}
		return true;
		
	}
	public static char calcularLetraDNI(int dni) {
        final String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;

        return caracteres.charAt(resto);
    }

}
