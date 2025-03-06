package fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class probar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fechaactual = LocalDate.now();
		LocalDate fnac = LocalDate.of(1999,1,4);
		long anosIncor = ChronoUnit.YEARS.between(fnac,fechaactual);
		anosIncor = (int) anosIncor/5;
		System.out.println(anosIncor);
	}

}
