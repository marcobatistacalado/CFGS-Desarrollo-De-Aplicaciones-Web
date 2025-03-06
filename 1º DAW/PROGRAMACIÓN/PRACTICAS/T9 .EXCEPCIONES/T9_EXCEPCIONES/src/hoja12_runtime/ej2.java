package hoja12_runtime;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String cad;
		do {
			System.out.println("Introduce String: ");
			cad = sc.nextLine().toUpperCase();
		}while(cad.length()!=6);
		try {
			if (correctoCad(cad)) {
				int num = Integer.parseInt(cad.substring(0, 4));
			}
		}catch(NumberFormatException e) {
			System.out.println("No es correcto el formato");
		}
	}

	private static boolean correctoCad(String cad) {
		for (int i = 4; i < cad.length(); i++) {
			if (cad.charAt(i) < 'A' || cad.charAt(i) > 'Z') {
				return false;
			}
		}
		return true;
	}

}
