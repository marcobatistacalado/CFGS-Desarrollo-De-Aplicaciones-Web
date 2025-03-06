package ej3_banco_OtraForma;

import java.util.Arrays;

public class Cuenta {
	private static int numCuenta=1;
	private int iban;
	protected double interes = 0.03, saldo;
	private String titulares[] = new String[3];
	public Cuenta(double saldo, String[] titulares) {
		super();
		this.iban = numCuenta; numCuenta++;
		this.titulares = titulares;
		this.saldo = saldo;
	}
	
	public boolean borrarCuenta(String titular) {
		for (int i = 0; i<this.titulares.length;i++) {
			if (titular.equals(titulares[i])) {
				return true;
			}
		}
		return false;
	}
	
	public void calcularInteres(int dias) {
		saldo += (saldo * interes * dias) / 365;
	}

	public String[] getTitulares() {
		return titulares;
	}

	public void setTitulares(String[] titulares) {
		this.titulares = titulares;
	}

	public int getIban() {
		return iban;
	}

	@Override
	public String toString() {
		return "Cuenta [iban=" + iban + ", interes=" + interes + ", saldo=" + saldo + ", titulares="
				+ Arrays.toString(titulares) + "]";
	}
	
}
