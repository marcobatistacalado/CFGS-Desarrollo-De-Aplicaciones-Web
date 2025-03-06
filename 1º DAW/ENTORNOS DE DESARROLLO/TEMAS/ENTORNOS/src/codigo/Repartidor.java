package codigo;

public class Repartidor {
	private int id, npedido;
	private double tgan;
	private static int totalPedidos = 0;
	// STATIIICCC pq es una variable global fuera de los objetos.
	// es decir no se crear totalPedidos para cada objeto

	public Repartidor(int i) {
		id = i;
		tgan = 0;
		npedido = 0;
	}

	public void realizarPedido(double importe, double propinas) {
		double gananciaPedido = importe * 0.2 + propinas;
		tgan += gananciaPedido;
		totalPedidos++;
		npedido++;
	}

	// obtener la variable global
	public static int getTotalPedidos() {
		return totalPedidos;
	}

	// ganancias por repartidor
	public double getTgan() {
		return tgan;
	}

	// pedidos por cada repartidor
	public int getNpedido() {
		return npedido;
	}

	// pedidos por cada repartidor
	public int getId() {
		return id;
	}
	
	

}
