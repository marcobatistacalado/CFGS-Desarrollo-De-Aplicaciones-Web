package restauranteHerencia;

public class Tenedor extends Cliente {
	private String cod;
	private static int totalComensales = 0;
	public Tenedor(int numPersonas, String cod) {
		super(numPersonas);
		totalComensales += numPersonas;
		// TODO Auto-generated constructor stub
		this.cod = cod;
	}
	public double pagar() {
		double descuento = Double.parseDouble(cod.substring(2, 4)); // obtener el descuento del código
	    double precioTotal = (bebidas * 2) + (raciones * 15); // calcular el precio total sin descuento
	    double descuentoAplicado = precioTotal * descuento / 100; // calcular el descuento
	    this.cuenta = precioTotal - descuentoAplicado;
		return this.cuenta;
	}
	public static int getTotalComensales() {
		return totalComensales;
	}
	@Override
	public String toString() {
		return "Tenedor [cod=" + cod + "] --- "+super.toString();
	}
}
