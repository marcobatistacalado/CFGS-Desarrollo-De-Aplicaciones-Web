
public class Contrato {
	
	private String telefono, tarifa;
	private double importe;
	private int llamadas;
	
	public Contrato(String telefono, String tarifa, double importe) {
		this.telefono = telefono;
		this.tarifa = tarifa;
		this.importe = importe;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setImporte(double importe) {
		this.importe += importe;
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

	public void setLlamadas(int llamadas) {
		this.llamadas += llamadas;
	}

}
