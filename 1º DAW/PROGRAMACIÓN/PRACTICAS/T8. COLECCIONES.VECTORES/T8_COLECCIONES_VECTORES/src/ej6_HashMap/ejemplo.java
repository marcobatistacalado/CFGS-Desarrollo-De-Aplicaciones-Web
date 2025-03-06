package ej6_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> letras = new HashMap<Character, Integer>();
		String frase = "eee,aaaa,uuuuu,o,ii";
		Character letra;

		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			if (letra.equals('a') || letra.equals('e') || letra.equals('i') || letra.equals('o') || letra.equals('u')) {
				if (!letras.containsKey(letra)) {
					letras.put(letra, 1); // si no existe lo inicializamos
				} else {
					letras.put(letra, letras.get(letra) + 1); // si existe añadimos una
				}
			}
		}

		for (Character i : letras.keySet()) {
			System.out.println("Letra: " + i + " value: " + letras.get(i));
		}

	}

}
