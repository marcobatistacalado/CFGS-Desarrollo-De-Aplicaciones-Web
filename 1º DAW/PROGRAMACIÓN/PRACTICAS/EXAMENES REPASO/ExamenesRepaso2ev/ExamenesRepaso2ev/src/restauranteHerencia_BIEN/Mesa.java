package restauranteHerencia_BIEN;

// Clase abstracta que representa una mesa en el restaurante
public abstract class Mesa {
	// Variable estática para asignar identificadores a las mesas
	private static int idMesas = 0;
	// Atributos protegidos para ser accesibles por las clases hijas
	protected int numComensales;
	protected int vecesServido;
	protected int idMesa;
	protected int numBebidas;
	protected int numRaciones;
	protected double cuenta;

	// Constructor de la clase Mesa
	public Mesa(int numComensales) {
		super();
		// Inicialización de los atributos
		this.numComensales = numComensales;
		this.vecesServido = 0;
		this.idMesa = idMesas;
		idMesas++; // Incrementa el contador de mesas para asignar un nuevo ID
	}

	// Método para obtener el ID de la mesa
	public int getIdMesa() {
		return idMesa;
	}

	// Método para obtener el número de comensales en la mesa
	public int getNumComensales() {
		return numComensales;
	}

	// Método para servir bebidas y raciones en la mesa
	public void servir(int numBebidas, int numRaciones) {
		vecesServido++; // Incrementa el contador de veces servido
		// Actualiza el número de bebidas y raciones servidas
		this.numBebidas += numBebidas;
		this.numRaciones += numRaciones;
	}

	// Método abstracto para calcular el total a pagar
	public abstract double pagar();

	// Método para juntar dos mesas
	public void juntarMesas(Mesa m2) {
		// Suma los comensales, bebidas y raciones de la mesa m2 a la mesa actual
		this.numComensales += m2.numComensales;
		this.numBebidas += m2.numBebidas;
		this.numRaciones += m2.numRaciones;
	}

	public int getVecesServido() {
		return vecesServido;
	}

	// Método para representar la información de la mesa como una cadena de texto
	@Override
	public String toString() {
		return "Mesa [numComensales=" + numComensales + ", vecesServido=" + vecesServido + ", idMesa=" + idMesa
				+ ", numBebidas=" + numBebidas + ", numRaciones=" + numRaciones + ", cuenta=" + cuenta + "]";
	}
}
