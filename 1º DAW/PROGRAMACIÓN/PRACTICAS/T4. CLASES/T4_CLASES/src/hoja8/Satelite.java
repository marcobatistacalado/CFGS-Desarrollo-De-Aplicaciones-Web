package hoja8;

//se tiene que llamar igual la clase que el archivo que lo aloja
public class Satelite {
	
	//3 datos: distancia, meridiano, paralelo
	private double distancia;
	private int paralelo, meridiano;
	
	//METODO CONSTRUCTOR DE UN SATELITE QUE NO ESTA EN ORBITA
	//siempre MAYUSCULA la primera letra y se llama igual que la clase
	public Satelite() {
		super();//no hace falta ponerlo
	}

	public Satelite(double distancia, int paralelo, int meridiano) {
		super();
		this.distancia = distancia; //ATRIBUTOS
		this.paralelo = paralelo;
		this.meridiano = meridiano;
	}

	public Satelite(int paralelo, int meridiano) {
		super();
		this.paralelo = paralelo;
		this.meridiano = meridiano;
	}
	
	//METODOS      
	public boolean estaOrbita() {
		if (distancia == 0) {
			return false;
		}
		return true;
		
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	@Override 
	public String toString() {
		return "Satelite [distancia=" + distancia + ", paralelo=" + paralelo + ", meridiano=" + meridiano + "]";
	}
	
}
