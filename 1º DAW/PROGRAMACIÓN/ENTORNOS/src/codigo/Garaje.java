package codigo;

public class Garaje {
	private int id, planta;
	private double m2, preciog;
	private boolean alquilado;
	private static double beneficios = 0;
	
	public Garaje(int id, double m2, int planta) {
		super();
		this.id = id;
		this.m2 = m2;
		this.planta = planta;
		alquilado = false;
		preciog = 18;
		if (this.planta == 1) {
			preciog +=3;
		}
		if (this.planta == 2) {
			preciog +=1.5;
		}
		if (this.planta < 1) {
			preciog +=1;
		}
		if (this.m2>4) {
			preciog +=1.5;
		}
		if (this.m2<3) {
			preciog -=1;
		}
		
		beneficios +=  preciog;
	}

	@Override
	public String toString() {
		return "Garaje [id=" + id + ", planta=" + planta + ", m2=" + m2 + ", preciog=" + preciog + ", alquilado="
				+ alquilado + "]";
	}

	public int getId() {
		return id;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado() {
		alquilado = true;
	}
	

	public double getPreciog() {
		return preciog;
	}

	public void setPreciog(int porcentaje) {
	    double aumento = (this.preciog * porcentaje) / 100;
	    this.preciog += aumento;
	    beneficios += aumento;
	}


	public static double getBeneficios() {
		return beneficios;
	}
	
}
