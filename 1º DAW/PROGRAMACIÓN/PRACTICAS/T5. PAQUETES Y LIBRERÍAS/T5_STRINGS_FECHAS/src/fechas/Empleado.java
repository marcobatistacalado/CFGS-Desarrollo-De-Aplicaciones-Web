package fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Empleado {
	private String nombre;
	private LocalDate fnac, fIncor;
	private long anosIncor, edad;
	
	public Empleado(String nombre, LocalDate fnac, LocalDate fIncor) {
		super();
		this.nombre = nombre;
		this.fnac = fnac;
		this.fIncor = fIncor;
	}
	
	public double calcSalario() {
		LocalDate fechaactual = LocalDate.now();
		double salario = 0;
		//calcular edad
		edad = ChronoUnit.YEARS.between(fnac,fechaactual);
		if (edad>50) {
			salario = 1000;
		}else if (edad<=50) {
			salario = 800;
		}
		calcAnosIncor();
		int quintenios = (int) anosIncor/5;
		salario += quintenios*120;
		return salario;
	}
	
	public long calcAnosIncor() {
		LocalDate fechaactual = LocalDate.now();
		//calcular cuantos años lleva
		anosIncor = ChronoUnit.YEARS.between(fIncor,fechaactual);
		return anosIncor;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fnac=" + fnac + ", fIncor=" + fIncor + ", edad=" + edad
				+ ", anosIncor=" + anosIncor + "]";
	}
	
	

	
	
}
