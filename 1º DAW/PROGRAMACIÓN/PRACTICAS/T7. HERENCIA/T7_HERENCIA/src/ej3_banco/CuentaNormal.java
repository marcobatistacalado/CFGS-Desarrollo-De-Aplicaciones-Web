package ej3_banco;

import java.util.Arrays;

public class CuentaNormal extends Cuenta {
	

	public CuentaNormal(String[] titulares, double saldoInicial) {
		super(titulares, saldoInicial);
		// TODO Auto-generated constructor stub
		interes=0.03;
	}
	
		
	@Override
	public String toString() {
	    return "CuentaNormal [iban=" + iban + ", titulares=" + Arrays.toString(titulares) + ", saldo=" + saldo + "]";
	}

	
}