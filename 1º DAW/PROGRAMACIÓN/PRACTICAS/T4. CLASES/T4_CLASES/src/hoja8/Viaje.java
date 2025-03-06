package hoja8;

public class Viaje {
	
	private String origen, dest, cod = "";
	private double  nplazas, impt;
	private static double reservas=0, recaudado = 0;
	//ERROR LAS RESERVAS NO SON STATICAS HAY QUE CAMBIARLO
	public Viaje(String o, String d, double p, double imp) {
		origen = o;
		dest = d;
		for (int i = 0; i<=1; i++) {
			cod = cod + origen.charAt(i);
		}
		for (int i = 0; i<=1; i++) {
			cod = cod + dest.charAt(i);
		}
		cod = cod.toUpperCase();
		//falta añadir numero
		nplazas = p;
		impt = imp;
	}
	
	public double reservaPlazas (int num, int nino) {
		double precio = 0;
		if (num<nplazas) {
			reservas = reservas + num;
			nplazas = nplazas - num;
			precio = (((num-nino)*impt)+(nino*(impt-(impt*0.2))));
			recaudado += precio;
		}
		return precio;
	}
	
	public boolean modPlazas (double plazas) {
		if (plazas>reservas) {
			nplazas = plazas;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Viaje [origen=" + origen + ", dest=" + dest + ", cod=" + cod + ", nplazas=" + nplazas + ", impt=" + impt
				+ "]";
	}

	public static double getRecaudado() {
		return recaudado;
	}

	
	
	
}
