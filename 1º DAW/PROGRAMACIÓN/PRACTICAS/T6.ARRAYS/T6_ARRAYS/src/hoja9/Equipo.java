package hoja9;

public class Equipo {
	private String nombre;
	private int victorias, derrotas, empates, golesfav, golescont, puntos;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		victorias = 0;
		derrotas = 0;
		empates = 0;
		golesfav = 0;
		golescont = 0;
		puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias() {
		this.victorias++;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas() {
		this.derrotas++;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates() {
		this.empates++;
	}

	public int getGolesfav() {
		return golesfav;
	}

	public void setGolesfav(int golesfav) {
		this.golesfav += golesfav;
	}

	public int getGolescont() {
		return golescont;
	}

	public void setGolescont(int golescont) {
		this.golescont += golescont;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos += puntos;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", victorias=" + victorias + ", derrotas=" + derrotas + ", empates="
				+ empates + ", golesfav=" + golesfav + ", golescont=" + golescont + ", puntos=" + puntos + "]";
	}
	
	//METODO ESTATIIICOOOO
	public static void anotarPartido(Equipo e1, Equipo e2, int gol1, int gol2) {
		e1.golesfav += gol1;
		e2.golesfav += gol2;
		e1.golescont += gol2;
		e2.golescont += gol1;
		
		if (gol1 == gol2) {
			//empate
			e1.empates++;
			e2.empates++;
			e1.puntos++;
			e2.puntos++;
		}
		
		if (gol1>gol2) {
			e1.victorias++;
			e2.derrotas++;
			e1.puntos += 3;
		}else {
			e1.derrotas++;
			e2.victorias++;
			e2.puntos += 3;
		}
	}
	//	SE LLAMA DESDE UN OBJETO
	public void anotarPartido2(Equipo e2, int gol1, int gol2) {
		golesfav += gol1;//actualiza el dato desde el objeto que se llama
		e2.golesfav += gol2;//al pasarle el otro equipo desde el objeto tambien podemos actualizarlo
		golescont += gol2;
		e2.golescont += gol1;
		
		if (gol1 == gol2) {
			//empate
			empates++;
			e2.empates++;
			puntos++;
			e2.puntos++;
		}
		
		if (gol1>gol2) {
			victorias++;
			e2.derrotas++;
			puntos += 3;
		}else {
			derrotas++;
			e2.victorias++;
			e2.puntos += 3;
		}
	}
	
	
}
