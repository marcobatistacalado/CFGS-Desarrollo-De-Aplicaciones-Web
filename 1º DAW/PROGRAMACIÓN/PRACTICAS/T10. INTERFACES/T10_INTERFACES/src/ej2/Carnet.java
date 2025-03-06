package ej2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Carnet implements Caducable{
	private String cod;
	private LocalDate fcaducidad;
	
	public Carnet(String cod, LocalDate fcaducidad) {
		super();
		this.cod = cod;
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
