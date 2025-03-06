//MARCO BATISTA CALADO
package tienda;

public class Arreglo {
	protected static int contN=0, contG=0, contU=0;
	private static int numArreglos = 100;
	private int numA;
	private String codEmpleado="";
	protected double importe;
	protected boolean finalizado;
	public Arreglo() {
		super();
		this.numA = ++numArreglos;
		contN++; //actualizar numero de arreglos normales;
	}
	public int getNumA() {
		return numA;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public double finalizar(int mins) throws FinalizadoException {
		if (finalizado) {
			throw new FinalizadoException ("El arreglo ya estaba finalizado.");
		}else {
			finalizado = true; //marcar como finalizado
			if (mins<5) {
				this.importe = 5;
			}else if (mins>30) {
				this.importe = 30;
			}else {
				this.importe = mins;
			}
			return this.importe;
		}
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setImporte() {
		this.importe = 10;
	}
	@Override
	public String toString() {
		return "Arreglo [numA=" + numA + ", codEmpleado=" + codEmpleado + ", importe=" + importe + ", finalizado="
				+ finalizado + "]";
	}
}
