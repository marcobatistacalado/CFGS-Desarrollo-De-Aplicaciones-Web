package repasoArraysFechasExcep;

import java.time.LocalDateTime;
import java.time.LocalTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fichaje {
	private int numE, tipo;// 1-2
	private LocalTime horaF;
	private static LocalTime hLlegada, hSalida;
	private int incidencia; // 0.correcto | 1. entra tarde | 2. sale  pronto | 3. 2 entradas seguidas | 4. 2 salidas seguidas

	public static void sethLlegada(LocalTime hLlegada) {
		Fichaje.hLlegada = hLlegada;
	}

	public static void sethSalida(LocalTime hSalida) {
		Fichaje.hSalida = hSalida;
	}

	public Fichaje(int numE, int tipo, int incidencia) {
		super();
		this.numE = numE;
		this.tipo = tipo; // 1. Entrada 2.Salida
		this.incidencia = incidencia;
		this.horaF = LocalTime.now();
		
		//INCIDENCIAS!!!!!!!!!!!
		if (this.tipo == 1 && horaF.isAfter(hLlegada)) {
			this.incidencia = 1;
		}
		if (tipo == 2 && horaF.isBefore(hSalida)) {
			this.incidencia = 2;
		}
	}

	public int getIncidencia() {
		return incidencia;
	}

	@Override
	public String toString() {
		return "Fichaje [numE=" + numE + ", tipo=" + tipo + ", horaF=" + horaF + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public int getNumE() {
		return numE;
	}

	public void setNumE(int numE) {
		this.numE = numE;
	}
	

}