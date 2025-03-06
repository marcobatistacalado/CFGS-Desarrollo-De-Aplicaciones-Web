package control_1ev_24_11_2021;

public class Patinete {
	private int numero, cargas;
	private double benef, bateria;
	private boolean revision;
	private static int bajoC=0;
	private static int talq = 0;
	public Patinete(int numero) {
		this.numero = numero;
		benef = 0;
		bateria = 0;
		cargas = 0;
		revision = false;
		bajoC++;
	}
	
	public void cargarBateria() {
		if (cargas != 10) {
			if (bateria<10) {
				bajoC--;
			}
			if (numero<100) {
				benef = benef + (50-bateria)*0.12;
				//reset bateria
				bateria = 50;
				
			}else {
				benef = benef + (70-bateria)*0.12;
				//reset bateria
				bateria = 70;
			}
			cargas++;
		}else {
			System.out.println("Revision taller");
			revision = true;
			benef = benef - 20;
		}
		
	}
	
	public double alquilar(double km) {
		double pagar;
		if (bateria>0 && revision == false) {
			if (km>bateria) {
				pagar = bateria*0.45;
				bateria = 0;
			}else {
				pagar = (km*0.45);
				bateria = bateria-km;
			}
			if (bateria<10) {
				bajoC++;
			}
			benef = benef+pagar;
			talq++;
			return pagar;
			
		}else {
			return -1; //Taller o no tiene bateria
		}
	}

	public void setRevision() {
		revision = false;
	}

	@Override
	public String toString() {
		return "Patinete [numero=" + numero + ", cargas=" + cargas + ", benef=" + benef + ", bateria=" + bateria
				+ ", revision=" + revision + "]";
	}

	public static int getBajoC() {
		return bajoC;
	}

	public static int getTalq() {
		return talq;
	}

	
	
	
	
	
	
	
	
	
	
}
