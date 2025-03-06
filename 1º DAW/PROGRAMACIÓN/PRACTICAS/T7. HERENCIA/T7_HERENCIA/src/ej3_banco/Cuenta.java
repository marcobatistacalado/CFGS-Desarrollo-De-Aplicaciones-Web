package ej3_banco;
import java.util.Arrays;

public class Cuenta {
	protected static int contadorCuentas = 0;
	protected int iban;
	protected String titulares[] = new String [3];
	protected double saldo;
	protected double interes;
	
	public Cuenta(String[] titulares, double saldoInicial) {
		super();
		this.iban = ++contadorCuentas;
		this.titulares = titulares;
		this.saldo = saldoInicial;
	}
	
	//METODO QUE RECORRE TITULARES PARA COMPARAR
	public int comprobarTitular(String DNI) {
		for (int i = 0; i<titulares.length;i++) {
			if (DNI.equalsIgnoreCase(titulares[i])) {
				return 0;
			}
		}
		return -1;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getIban() {
		return iban;
	}

	@Override
	public String toString() {
		return "Cuenta [iban=" + iban + ", titulares=" + Arrays.toString(titulares) + ", saldo=" + saldo + "]";
	}
	
	
	public String[] getTitulares() {
		return titulares;
	}

	
	

	public double calcularInteres(int dias) {
	    return saldo * interes * dias / 365;
	}
	

}
