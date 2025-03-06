package restauranteHerencia_BIEN;

// Clase que representa una mesa de tipo Tenedor en el restaurante
public class Tenedor extends Mesa {
	// Variable para almacenar la oferta de la mesa Tenedor
	private String oferta;
	// Variables estáticas para llevar el seguimiento del total de comensales y la
	// recaudación
	private static int totalComensalesTenedor = 0;
	private static int totalRecaudadoTenedor = 0;

	// Constructor de la clase Tenedor
	public Tenedor(int numComensales, String oferta) {
		super(numComensales); // Llama al constructor de la clase padre (Mesa)
		this.oferta = oferta; // Inicializa la oferta de la mesa Tenedor
		totalComensalesTenedor++; // Incrementa el contador de comensales de Tenedor
	}

	// Método para calcular el total a pagar por la mesa Tenedor
	public double pagar() {
		// Obtiene el porcentaje de descuento de la oferta
		int desc = Integer.parseInt(oferta.substring(2, 4));
		// Calcula el descuento a aplicar sobre el total de raciones
		desc = (this.numRaciones * desc) / 100;
		// Calcula la cuenta final restando el descuento
		this.cuenta = this.numBebidas * 2 + (this.numRaciones * 15) - desc;
		// Actualiza la recaudación total de Tenedor
		totalRecaudadoTenedor += this.cuenta;
		return cuenta; // Devuelve el total a pagar
	}

	// Método estático para obtener el total de comensales de Tenedor
	public static int getTotalComensalesTenedor() {
		return totalComensalesTenedor;
	}

	// Método getter para obtener la oferta de la mesa Tenedor
	public String getOferta() {
		return oferta;
	}

	// Método estático para obtener el total recaudado por las mesas Tenedor
	public static int getTotalRecaudadoTenedor() {
		return totalRecaudadoTenedor;
	}

	// Método toString para representar la información de la mesa Tenedor como una
	// cadena de texto
	@Override
	public String toString() {
		return super.toString() + " --- Tenedor [oferta=" + oferta + "]";
	}
}
