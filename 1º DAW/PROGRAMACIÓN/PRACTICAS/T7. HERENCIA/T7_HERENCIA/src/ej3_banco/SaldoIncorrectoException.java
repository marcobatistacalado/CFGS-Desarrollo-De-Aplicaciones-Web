package ej3_banco;

//CLASE CREACION DE MI EXCEPCION
public class SaldoIncorrectoException extends Exception {

	public SaldoIncorrectoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaldoIncorrectoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public SaldoIncorrectoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	//ESTE ES EL UNICO METODO QUE USAMOS EN VERDAD
	public SaldoIncorrectoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SaldoIncorrectoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
