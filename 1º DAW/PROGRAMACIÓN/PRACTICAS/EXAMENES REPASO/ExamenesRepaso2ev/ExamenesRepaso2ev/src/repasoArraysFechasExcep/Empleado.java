package repasoArraysFechasExcep;

import java.time.LocalTime;

public class Empleado {
	private String dNI;
	private int numE;
	private LocalTime hora;
	private boolean trabajando = false, dentro = false;

	public Empleado(String dNI, int numE) {
		super();
		this.dNI = dNI;
		this.numE = numE;

		//Hay que meter ceros por delante para luego comprobar contraseña
		String ceros = "";
		for (int i = 0; i < 9 - dNI.length(); i++) {
			ceros += "0";
		}
		this.dNI = ceros+this.dNI;
	}

	public boolean isTrabajando() {
		return trabajando;
	}

	public int getNumE() {
		return numE;
	}

	public String getdNI() {
		return dNI;
	}

	public boolean isDentro() {
		return dentro;
	}

	public void setDentro(boolean dentro) {
		this.dentro = dentro;
		if (dentro) {
			LocalTime hora2 = LocalTime.now();
		}
		if (!dentro) {
			
		}
	}

	// metodo que compruebe si el fichaje es una incidencia o no

}