package ej2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medicamento implements Caducable{
	private String nombre;
	private LocalDate fcaducidad;

	
	public Medicamento(String nombre, LocalDate fcaducidad) {
		super();
		this.nombre = nombre;
		this.fcaducidad = fcaducidad;
	}
	@Override
	public boolean caducidad() {
		if (fcaducidad.isAfter(LocalDate.now())) {
			return true;
		}
		return false;
	}
	@Override
	public long diasCaducidad() {
		// TODO Auto-generated method stub
		long numDias = ChronoUnit.DAYS.between(LocalDate.now(), fcaducidad);
		return numDias;
	}
}
