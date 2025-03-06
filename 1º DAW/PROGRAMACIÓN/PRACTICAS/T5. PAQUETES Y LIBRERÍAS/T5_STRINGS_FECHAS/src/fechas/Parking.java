package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Parking {
	private String mat;
	private LocalDateTime hEst;
	private static double ganancias;
	
	public Parking(String mat) {
		this.mat = mat;
		hEst = LocalDateTime.now(); 
	}

	public long setGanancias() {
		LocalDateTime fechaActual = LocalDateTime.now(); 
		long difftotalseg= ChronoUnit.SECONDS.between(hEst,fechaActual);
		ganancias += difftotalseg;
		return difftotalseg;
	}

	public static double getGanancias() {
		return ganancias;
	}
	
	
}
