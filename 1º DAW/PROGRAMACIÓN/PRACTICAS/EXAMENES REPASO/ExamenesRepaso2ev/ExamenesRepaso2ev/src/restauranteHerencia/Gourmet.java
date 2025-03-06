package restauranteHerencia;

public class Gourmet extends Cliente {
	private static int totalComensales = 0;
	public Gourmet(int numPersonas) {
		super(numPersonas);
		totalComensales += numPersonas;
		// TODO Auto-generated constructor stub
	}
	public double pagar() {
		this.bebidas--; //1 bebida gratis
		this.cuenta = bebidas*2+(raciones*15);
		return this.cuenta;
	}
	public static int getTotalComensales() {
		return totalComensales;
	}
	@Override
	public String toString() {
		return "Gourmet -- "+super.toString();
	}

}
