package ej3_banco;

import java.util.Arrays;

public class Cuenton extends Cuenta {

	private static final double MINIMO_APERTURA = 600.0;
	
	public Cuenton(String[] titulares, double saldoInicial) throws SaldoIncorrectoException {
		super(titulares, saldoInicial);
		interes=0.04;
		if (saldoInicial < MINIMO_APERTURA) {
			//ILLEGALARGUMENTEXCEPTION ES UNA CLASE YA HECHA QUE ME PERMITE SALTAR UNA EXCEPCION EN TIEMPO DE EJECUCION
            //throw new IllegalArgumentException("El saldo inicial para un Cuentón debe ser al menos " + MINIMO_APERTURA + " euros.");
            //PERO NOSOTROS HEMOS DADO YA COMO CREAR LAS NUESTRAS PROPIAS
			//SALTAR A LA EXCEPCION
			throw new SaldoIncorrectoException ("Saldo Menor de 600€. Imposible crear");
        }
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
	    return "Cuenton [iban=" + iban + ", titulares=" + Arrays.toString(titulares) + ", saldo=" + saldo + "]";
	}


}
