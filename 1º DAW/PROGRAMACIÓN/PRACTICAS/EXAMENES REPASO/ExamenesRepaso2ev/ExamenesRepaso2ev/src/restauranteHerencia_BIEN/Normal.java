package restauranteHerencia_BIEN;

import java.time.DayOfWeek;
import java.time.LocalDate;

// Clase que representa una mesa normal en el restaurante
public class Normal extends Mesa {
	// Variables estáticas para llevar el seguimiento del total de comensales y la
	// recaudación
	private static int totalComensalesNormal = 0;
	private static int totalRecaudadoNormal = 0;

	// Constructor de la clase Normal
	public Normal(int numComensales) {
		super(numComensales); // Llama al constructor de la clase padre (Mesa)
		totalComensalesNormal++; // Incrementa el contador de comensales normales
	}

	// Método para calcular el total a pagar por la mesa normal
	public double pagar() {
		this.cuenta = this.numBebidas * 2 + this.numRaciones * 15; // Calcula la cuenta sin descuento
		LocalDate hoy = LocalDate.now();
		DayOfWeek diaHoy = hoy.getDayOfWeek();
		if (diaHoy.ordinal() >= 0 && diaHoy.ordinal() <= 4) {
			this.cuenta -= (this.cuenta * 10) / 100; // Aplica descuento del 10% de lunes a viernes
		}
		totalRecaudadoNormal += this.cuenta; // Actualiza la recaudación total
		return cuenta; // Devuelve el total a pagar
	}

	// Método toString para representar la información de la mesa normal como una
	// cadena de texto
	@Override
	public String toString() {
		return super.toString() + " --- Normal []"; // Llama al método toString de la clase padre y agrega información
													// específica de la mesa normal
	}

	// Método estático para obtener el total de comensales normales
	public static int getTotalComensalesNormal() {
		return totalComensalesNormal;
	}

	// Método estático para obtener el total recaudado por las mesas normales
	public static double getTotalRecaudadoNormal() {
		return totalRecaudadoNormal;
	}
}
