package ej2;

public class Propio extends Empleado {

	public Propio(String nombre, String dni, String direccion, String telefono, double extra) {
		super(nombre, dni, direccion, telefono);
		// TODO Auto-generated constructor stub
		this.salario = extra;
	}
	//AL HACERLO ABSTRACTO EN EL ALTA AL USAR INDEXOF, TENEMOS QUE HACER QUE SEA EN UNA CLASE HIJO EL CONSTRUCTOR.
	public Propio(String dni) {
		super(dni);
		// TODO Auto-generated constructor stub
	}

	public void repartoBeneficio(double beneficio) {
		this.salario += beneficio;
	}

	public double pagar() {
		this.salario += 15 * this.horasTotales;
		this.horasTotales = 0;
		double sal = this.salario;
		this.salario=0;
		return sal;
	}

	@Override
	public String toString() {
		return super.toString() + " --- Propio []";
	}

}
