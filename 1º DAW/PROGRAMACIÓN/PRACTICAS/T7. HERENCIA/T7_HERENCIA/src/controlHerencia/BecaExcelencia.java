package controlHerencia;

public class BecaExcelencia extends Beca {
	private int nota;

	public BecaExcelencia(String dnialumno, double renta, int nota) {
		super(dnialumno, renta);
		this.nota = nota;
		cod = numBeca + "EX";
	}

	public int darPuntuacion() {
		int punt = 0;
		if (nota == 7 || nota == 8) {
			punt = 1;
		}
		if (nota == 9 || nota == 10) {
			punt = 2;
		}
		if (getRenta() < 6000) {
			punt += 2;
		}
		setPuntuacion(punt); // actualizar variable
		return punt;
	}
}
