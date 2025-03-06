package ej2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carnet c1 = new Carnet ("a1", LocalDate.parse("2024-01-01"));
		Carnet c2 = new Carnet ("a1", LocalDate.parse("2024-12-01"));
		Medicamento m1 = new Medicamento ("Paracetamol", LocalDate.parse("2024-01-01"));
		Medicamento m2 = new Medicamento ("Ibuprofeno", LocalDate.parse("2024-12-01"));
		
		if (c1.caducidad()) {
			System.out.println("Carnet caducado");
			System.out.println("Dias que lleva caducado: "+c1.diasCaducidad());
		}
		
		if (c2.caducidad()) {
			System.out.println("Carnet caducado");
			System.out.println("Dias que lleva caducado: "+c2.diasCaducidad());
		}
		
		if (m1.caducidad()) {
			System.out.println("Medicamento caducado");
			System.out.println("Dias que lleva caducado: "+m1.diasCaducidad());
		}
		
		if (m2.caducidad()) {
			System.out.println("Medicamento caducado");
			System.out.println("Dias que lleva caducado: "+m2.diasCaducidad());
		}
	}

}
