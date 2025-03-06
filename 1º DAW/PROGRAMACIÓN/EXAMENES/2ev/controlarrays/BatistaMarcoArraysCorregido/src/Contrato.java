
public class Contrato {
	
	private String telefono, tarifa;
	private double importe;
	private int llamadas;
	private String tarifas[] = {"joven", "normal", "especial"}; 
	private static double precio1[] = {10,15,30};
	private static double precio2[] = {0.02,0.01, 0, 0.03, 0.02, 0.01};
	
	public Contrato(String telefono, String tarifa) {
		this.telefono = telefono;
		this.tarifa = tarifa;
		int buscar = buscarTarifas(tarifas, tarifa);
		importe = precio1[buscar];
	}

	public String getTelefono() {
		return telefono;
	}

	//METODO REALIZAR LLAMADA
	public void realizarLlamada(int min) {
		int buscar;
		buscar = buscarTarifas(tarifas, tarifa);
		if (min>0 && min<5) {
			importe += min*precio2[buscar];
		}else {
			importe += min*precio2[buscar+3];
		}
		llamadas++;

	}
	// BUSCAR TARIFA
		public static int buscarTarifas(String tarifas[], String tarifa) {
			for (int i = 0; i < tarifas.length; i++) {
				if (tarifas[i].equalsIgnoreCase(tarifa)) {
					return i;
				}
			}
			return -1;
		}

	@Override
	public String toString() {
		return "Contrato [telefono=" + telefono + ", tarifa=" + tarifa + ", importe=" + importe + ", llamadas="
				+ llamadas + "]";
	}

	public String getTarifa() {
		return tarifa;
	}

	public int getLlamadas() {
		return llamadas;
	}


}
