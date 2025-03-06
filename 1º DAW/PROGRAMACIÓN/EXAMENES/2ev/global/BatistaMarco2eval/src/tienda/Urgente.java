//MARCO BATISTA CALADO
package tienda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Urgente extends Arreglo {
	private LocalDate fprevista;

	public Urgente(LocalDate fprevista) {
		super();
		this.fprevista = fprevista;
		this.contU++; //actualizar numero de arreglos urgentes;
	}
	public double finalizar(int mins) throws FinalizadoException {
		if (finalizado) {
			throw new FinalizadoException ("El arreglo ya estaba finalizado.");
		}else {
			finalizado = true; //marcar como finalizado
			this.importe=40; //cuota fija
			LocalDate fHoy = LocalDate.now();
			long diff = ChronoUnit.DAYS.between(fHoy, this.fprevista); //diferencia de dias
			System.out.println(diff);
			this.importe -= diff*5; //descuento 5€ x dia
			if (this.importe<0) {
				this.importe=0;
			}
			return this.importe;
		}
	}
	@Override
	public String toString() {
		return super.toString()+" --- TIPO: Urgente [fprevista=" + fprevista + "]";
	}
}
