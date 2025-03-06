package ej2;

public class Externo extends Empleado {
	private String empresaProviene;

	public Externo(String nombre, String dni, String direccion, String telefono, String empresaProviene) {
		super(nombre, dni, direccion, telefono);
		this.empresaProviene = empresaProviene;
	}

	public double pagar() {
		this.salario += 22 * this.horasTotales;
		this.horasTotales = 0;
		double sal = this.salario;
		this.salario=0;
		return sal;
	}

	@Override
	public String toString() {
		return super.toString() + " --- Externo [empresaProviene=" + empresaProviene + "]";
	}

}
