package ej2;

import java.util.Objects;

public abstract class Empleado {
	private static int numeroEmpleados = 100;
	private String nombre, dni, direccion, telefono;
	private int numE;
	protected int horasTotales;
	protected double salario;

	public Empleado(String nombre, String dni, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.numE = ++numeroEmpleados;
	}

	// USAR INDEXOF EN BUSQUEDA
	// DNI----------------------------------------------------
	public Empleado(String dni) {
		super();
		this.dni = dni;
	} //	constructorrrrrrrrrrrrrrrrrrr

	@Override
	public boolean equals(Object obj) {
		if (this == obj)  //apuntan a la misma dirección de memoria
			return true;
		if (obj == null)
			return false;
		// COMENTAMOS PORQUE YO YA SE QUE EN LA BUSQUEDA HAY DOS TIPOS DE CLASE
		// PERO SON EL MISMO VECTOR Y SON EMPLEADO AMBAS.
		/*
		 * if (getClass() != obj.getClass()) return false;
		 */
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

	// ---------------------------------------------------------------------------------
	/* CUANDO HE VISTO QUE NO PODIA INSTANCIAR UN EMPLEADO POR SE ABSTRACTO LO HE HECHO ASI: ESTÁ BIEN Y DE HECHO SE HACE.
	public double pagar() {
		return -1;
	}*/
	public abstract double pagar(); //hacerlo abstracto
	public int getNumE() {
		return numE;
	}

	public void fichar(int horas) {
		this.horasTotales += horas;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", numE=" + numE + ", horasTotales=" + horasTotales + ", salario=" + salario + "]";
	}

	public double getSalario() {
		return salario;
	}

	public String getNombre() {
		return nombre;
	}

}
