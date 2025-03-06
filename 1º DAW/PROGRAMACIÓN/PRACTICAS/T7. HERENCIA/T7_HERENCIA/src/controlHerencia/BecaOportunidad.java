package controlHerencia;

public class BecaOportunidad extends Beca {
	private String estudios;
	private int edad;
	public BecaOportunidad(String dnialumno, double renta, String estudios, int edad) {
		super(dnialumno, renta);
		this.estudios = estudios;
		this.edad = edad;
		cod = numBeca+"OP";
	}
	
	public int darPuntuacion() {
		int punt = 0;
		if ((estudios.equalsIgnoreCase("ESO")||estudios.equalsIgnoreCase("FP"))) {
			if (edad>20) {
				punt = 1;
			}else {
				punt = 2;
			}
		}
			
		if (getRenta()<6000) {
			punt +=2;
		}
		setPuntuacion(punt); //actualizar variable
		return punt;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	
	
	
}
