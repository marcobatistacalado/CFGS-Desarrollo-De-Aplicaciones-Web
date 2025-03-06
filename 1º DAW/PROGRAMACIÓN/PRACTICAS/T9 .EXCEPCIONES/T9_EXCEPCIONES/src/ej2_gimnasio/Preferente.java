package ej2_gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Preferente extends Socio {

	public Preferente(String nombre, String apellidos, String telefono, LocalDate fnac) {
		super(nombre, apellidos, telefono, fnac);
		// TODO Auto-generated constructor stub
		numSocioP++;
		this.cod = "P" + numSocioP;
		this.cuota = 10; // esto es por mes
	}

	public void entrar(LocalTime hEntrada) {
		if (estaGym == false) {
			this.estaGym = true;
			this.hEntrada = hEntrada;
			cuantasVeces++;
			this.cuota += 2;
		} else {
			System.out.println("Ya está dentro. No se puede realizar este procedimiento.");
		}
	}

	public double salir(LocalTime hSalida) {
		if (estaGym == true) {
			this.estaGym = false;
			this.hSalida = hSalida;
			long diff = ChronoUnit.SECONDS.between(this.hEntrada, hSalida);
			tiempoTotalenGym += diff;
			return 2;
		} else {
			System.out.println("Ya está fuera. No se puede realizar este procedimiento.");
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Preferente ---" +super.toString();
	}

}
