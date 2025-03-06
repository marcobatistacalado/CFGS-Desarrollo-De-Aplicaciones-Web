package ej3_banco_OtraForma;

public class Cuenton extends Cuenta {

	public Cuenton(double saldo, String[] titulares) throws abrirMenor600Exception {
		super(saldo, titulares);
		// TODO Auto-generated constructor stub
		this.interes = 0.04;
		if (saldo<600) {
			throw new abrirMenor600Exception("No se puede abrir con esa cant dinero");
		}
	}

	@Override
	public String toString() {
		return "CUENTON -- "+super.toString();
	}
	
	public void calcularInteres(int dias) {
		this.saldo += (saldo * interes * dias) / 365;
	}

	
}
