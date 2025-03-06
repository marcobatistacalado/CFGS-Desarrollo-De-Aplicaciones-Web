package codigo;

public class Cargamento {
	private String nombre,procedencia;
	private int nKilos;
	private double precioCoste,precioVenta;
	private static double totalGanancias;
	
	
	public static double getTotalGanancias() {
		return totalGanancias;
	}



	public Cargamento(String nombre, String procedencia, int nKilos, double precioCoste, double precioVenta) {
	
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.nKilos = nKilos;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}


	@Override
	public String toString() {
		return "Cargamento [nombre=" + nombre + ", procedencia=" + procedencia + ", nKilos=" + nKilos + ", precioCoste="
				+ precioCoste + ", precioVenta=" + precioVenta + "]";
	}
	
	public boolean rebajar(double rebaja) {
		if (precioVenta-rebaja<precioCoste)
			return false;
		
		precioVenta-=rebaja;
		return true;
	}
	
	public double vender(int kilos) {
		double beneficio;
		if (nKilos<kilos)
			return 0;
		
		beneficio=(precioVenta-precioCoste)*kilos;
		totalGanancias+=beneficio;
		
		nKilos-=kilos;
		return kilos*precioVenta;
		
		
	}
	
	public static boolean mismoCargamento(Cargamento a,Cargamento b) {
		if (a.procedencia.equalsIgnoreCase(b.procedencia))
			return true;
		return false;
	}
	
	public boolean mismoCargamento2(Cargamento c) {
		if (procedencia.equalsIgnoreCase(c.procedencia))
			return true;
		return false;
	}
	
	
}
