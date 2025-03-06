package restauranteHerencia_BIEN;

import java.util.Scanner;

public class probar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce:");
		String oferta = sc.nextLine();
		System.out.println(oferta.substring(2, 4));
		if (validarOferta(oferta)) {
			System.out.println("Bien");
		} else {
			System.out.println("MAl");
		}
	}

	public static boolean validarOferta(String oferta) {
		if (!oferta.startsWith("TE")) {
			return false;
		}
		for (int i = 2; i < oferta.length(); i++) {
			if (oferta.charAt(i) < '0' || oferta.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
