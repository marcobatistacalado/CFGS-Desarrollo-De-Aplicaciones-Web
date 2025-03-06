package ej2_gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Socio {
	private String nombre, apellidos, telefono;
	protected String cod;
	private LocalDate fnac;
	protected LocalTime hEntrada, hSalida;
	long tiempoTotalenGym;
	protected boolean estaGym = false;
	protected static int numSocioP = 0, numSocioN = 0;
	protected double cuota;
	protected int cuantasVeces = 0;

	public Socio(String nombre, String apellidos, String telefono, LocalDate fnac) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fnac = fnac;
		numSocioN++;
		this.cod = "N" + numSocioN;
	}

	public void entrar(LocalTime hEntrada) {
		if (estaGym == false) {
			this.estaGym = true;
			this.hEntrada = hEntrada;
			cuantasVeces++;
			System.out.println("Entrada Realizada.");
		} else {
			System.out.println("Ya está dentro, no se puede realizar esto.");
		}
	}

	public double salir(LocalTime hSalida) {
		if (estaGym == true) {
			this.estaGym = false;
			this.hSalida = hSalida;
			long diff = ChronoUnit.SECONDS.between(this.hEntrada, hSalida);
			tiempoTotalenGym += diff;
			if (diff < 30) {
				this.cuota += 6;
			} else if (diff > 30 && diff < 60) {
				this.cuota += 9;
			} else if (diff > 60) {
				this.cuota += 12;
			}
			System.out.println("Salida Realizada.");
			return this.cuota;
		} else {
			System.out.println("Ya está fuera, no se puede realizar esto.");
			return -1;
		}
	}

	public boolean socioExiste(String telefono) {
		if (this.telefono.equals(telefono)) {
			return true;
		}
		return false;
	}

	public boolean codExiste(String cod) {
		if (this.cod.equalsIgnoreCase(cod)) {
			return true;
		}
		return false;
	}

	public void mostrarCod() {
		System.out.println("COD: " + cod);
	}

	public int getEdad() {
		LocalDate ahora = LocalDate.now();
        long anios = ChronoUnit.YEARS.between(this.fnac, ahora);
        return (int) anios;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", cod=" + cod
				+ ", fnac=" + fnac + ", tiempoTotalenGym=" + tiempoTotalenGym + " segundos, esta en el Gym=" + estaGym
				+ ", gastado=" + cuota + ", cuantas Veces has ido al gym=" + cuantasVeces + "]";
	}

}
