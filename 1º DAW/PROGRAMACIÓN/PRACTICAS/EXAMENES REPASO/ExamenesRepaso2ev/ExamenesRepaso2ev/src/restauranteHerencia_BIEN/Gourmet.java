package restauranteHerencia_BIEN;

// Clase que representa una mesa de tipo Gourmet en el restaurante
public class Gourmet extends Mesa {
	// Variables estáticas para llevar el seguimiento del total de comensales y la
	// recaudación
	private static int totalComensalesGourmet = 0;
	private static int totalRecaudadoGourmet = 0;

	// Constructor de la clase Gourmet
	public Gourmet(int numComensales) {
		super(numComensales); // Llama al constructor de la clase padre (Mesa)
		totalComensalesGourmet++; // Incrementa el contador de comensales de Gourmet
	}

	// Método para calcular el total a pagar por la mesa Gourmet
	public double pagar() {
		// Se descuenta una bebida por cliente debido a la categoría Gourmet
		numBebidas -= numComensales;
		if (numBebidas < 0) {
			numBebidas = 0;
		}
		// Calcula la cuenta final teniendo en cuenta las bebidas y raciones
		this.cuenta = this.numBebidas * 2 + this.numRaciones * 15;
		// Actualiza la recaudación total de Gourmet
		totalRecaudadoGourmet += this.cuenta;
		return cuenta; // Devuelve el total a pagar
	}

	// Método toString para representar la información de la mesa Gourmet como una
	// cadena de texto
	@Override
	public String toString() {
		return super.toString() + " --- Gourmet []";
	}

	// Método estático para obtener el total de comensales de Gourmet
	public static int getTotalComensalesGourmet() {
		return totalComensalesGourmet;
	}

	// Método estático para obtener el total recaudado por las mesas Gourmet
	public static int getTotalRecaudadoGourmet() {
		return totalRecaudadoGourmet;
	}
}
