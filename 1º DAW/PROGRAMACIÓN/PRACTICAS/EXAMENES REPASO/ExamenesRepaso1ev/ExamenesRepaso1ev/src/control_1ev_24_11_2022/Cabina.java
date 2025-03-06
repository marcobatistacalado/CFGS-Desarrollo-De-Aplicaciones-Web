package control_1ev_24_11_2022;

public class Cabina {

	private int nCab, tA,tM,tC;
	private char tipoC;
	private double impT;
	private boolean ind;
	private static int abierto = 0;
	
	//Metodo constructor
	Cabina(int numero) {
		//Atributos
		nCab = numero;
		ind = true;
		impT = 0;
		tA=0;
		tC=0;
		tM=0;
		abierto++;
	}
	
	public double pagarVehículo(double km, char tipo) {
		if (ind == false) {
			return -1; //cerrado no se hace nada
		}
		tipo = Character.toUpperCase(tipo);
		double paga = 0;
		switch (tipo) {
			case 'A':
				paga = 0.2*km;
				tA++;
				break;
			case 'M':
				paga = 0.1*km;
				tM++;
				break;
			case 'C':
				paga = 5*km;
				tC++;
				break;
		}
		impT=impT+paga;
		return paga;
		
	}
	
	//Obtener si esta abierto o cerrado
	public boolean getInd() {
		return ind;
	}

	//Abrir o cerrar
	public void setInd(boolean cond) {
		if (ind != cond) {
			ind = cond;
			if (ind == false) {
				abierto--;
			}else {
				abierto++;
			}
		}
	}
	

	//obtener numero de cabinas abiertas
	public static int getAbierto() {
		return abierto;
	}
	
	//Obtener info de una cabina
	@Override
	public String toString() {
		return "Cabina [nCab=" + nCab + ", tA=" + tA + ", tM=" + tM + ", tC=" + tC + ", ind=" + ind + ", impT=" + impT
				+ "]";
	}
	
	//Obtener la cabina que mayor trafico ha tenido
	public static int mayorTrafico(Cabina c1, Cabina c2, char tipo) {
		if (tipo == 'A') {
			if (c1.tA == c2.tA) {
				return 0;
			}else {
				if (c1.tA > c2.tA) {
					return c1.nCab;
				}else {
					return c2.nCab;
				}
			}
		}
		if (tipo == 'C') {
			if (c1.tC == c2.tC) {
				return 0;
			}else {
				if (c1.tC > c2.tC) {
					return c1.nCab;
				}else {
					return c2.nCab;
				}
			}
		}
		if (tipo == 'M') {
			if (c1.tM == c2.tM) {
				return 0;
			}else {
				if (c1.tM > c2.tM) {
					return c1.nCab;
				}else {
					return c2.nCab;
				}
			}
		}
		return -1;
		
		
	}

	public int getnCab() {
		return nCab;
	}
	
	
	

	

}
