package hoja9;

public class Cargamento {
	
	private String nombre, procedencia;
	private double nkg, pcostekg, pventakg;
	private static double ganancia = 0;
	//Metodo Constructor
	public Cargamento(String n, String p, double numkg, double costekilos, double ventakilos){
		nombre = n;
		procedencia = p;
		nkg = numkg;
		pcostekg = costekilos;
		pventakg = ventakilos;
	}
	
	//Metodo que devuelve info
	@Override
	public String toString() {
		return "Cargamento [nombre=" + nombre + ", procedencia=" + procedencia + ", nkg=" + nkg + ", pcostekg="
				+ pcostekg + ", pventakg=" + pventakg + "]";
	}
	
	//Metodo rebajar
	public void rebajar(double bajada) {
		if (pventakg-bajada>pcostekg) {
			pventakg = pventakg - bajada;
		}
	}
	
	//Metodo vender
	public double vender(double cant) {
		if (cant<=nkg) {
			nkg = nkg - cant;
			double vendido = cant * pventakg;
			ganancia = ganancia + vendido;
			return vendido;
		}
		return -1; //devolver error
	}
	
	public static double getGanancia() {
		return ganancia;
	}
	
	//Metodo misma procedencia de dos cargamentos
	
	/*public static boolean mismaProcedencia(String p1,String p2) {
		if (p1.equalsIgnoreCase(p2)) {
			return true;
		}
		return false;
	}
	//obtener procedencia
	public String getProcedencia() {
		return procedencia;
	}	
	Y EN EL MAIN LE PASARIAMOS:
	Cargamento.mismaProcedencia(carga1.getProcedencia(), carga2.getProcedencia());
	*/

	//FORMA CORRECTA = STATIC 
	public static boolean mismaProcedencia(Cargamento c1, Cargamento c2) {
		if (c1.procedencia == c2.procedencia) {
			return true;
		}
		return false;
	}
	
	//FORMA CORRECTA ORIENTADA A OBJETOS
	public boolean mismoCargamento2(Cargamento c) {
		//procedencia de carga1 el lo entiende no hace falta usar this
		if (procedencia.equalsIgnoreCase(c.procedencia)){
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public double getNkg() {
		return nkg;
	}


}




