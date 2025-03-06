package controlHerencia;

public abstract class Beca {

	private String dnialumno;
	private double renta;
	private int puntuacion;
	protected static int numBeca=0;
	protected String cod; //podemos ponerlo protected si accedemos muchas veces en los hijos, 
	//lo normal si solo es una vez o pocas es usar set

	public Beca(String dnialumno, double renta) {
		super();
		this.dnialumno = dnialumno;
		this.renta = renta;
		numBeca++;
	}

	public String getDnialumno() {
		return dnialumno;
	}

	public double getRenta() {
		return renta;
	}

	public void setRenta(double renta) {
		this.renta = renta;
	}
	//esto es un metodo abstrabcto, porque la puntuacion se aplica en oportunidad y excelencia
	//SI TIENE UN TIPO DE ESTE METODO Y LA CLASE, NO SE PUEDE INSTANCIAR UNA BECA
	abstract int darPuntuacion();

	public int getPuntuacion() {
		return puntuacion;
	}
	
	public void setPuntuacion(int puntuacion) {
		this.puntuacion += puntuacion;
	}


	@Override
	public String toString() {
		return "Dni= " + dnialumno + ", Renta= " + renta + ", puntuacion= " + puntuacion;
	}

}
