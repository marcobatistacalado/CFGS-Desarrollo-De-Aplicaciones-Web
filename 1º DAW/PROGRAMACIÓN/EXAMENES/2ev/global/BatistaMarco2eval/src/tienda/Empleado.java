//MARCO BATISTA CALADO 
package tienda;

public class Empleado {
	private String cod;
	private int arreglosAsignados, arreglosFinalizados;

	public Empleado(String cod) {
		super();
		this.cod = cod;
		this.arreglosAsignados = 0;
		this.arreglosFinalizados = 0;
	}

	public boolean existeEmpleado(String cod) {
		if (this.cod.equals(cod)) {
			return true;
		}
		return false;
	}

	public void setArreglosAsignados() {
		arreglosAsignados++;
	}

	public void finalizarArreglo(){
		arreglosFinalizados++;
	}

	public String getCod() {
		return cod;
	}

	@Override
	public String toString() {
		return "Empleado [cod=" + cod + ", arreglosAsignados=" + arreglosAsignados + ", arreglosFinalizados="
				+ arreglosFinalizados + "]";
	}
}
