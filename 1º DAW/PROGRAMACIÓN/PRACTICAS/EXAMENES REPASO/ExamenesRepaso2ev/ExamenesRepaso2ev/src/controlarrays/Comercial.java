package controlarrays;

import java.util.Arrays;

public class Comercial {
	private String nombre;
	private int marcas[] = new int [3];
	
	public Comercial(String nombre) {
		this.nombre = nombre;
		marcas[0] = 0; 
		marcas[1] = 0; 
		marcas[2] = 0; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setMarcas(int num, int cant) {
		marcas[num] += cant;
	}

	@Override
	public String toString() {
		return "Comercial [nombre=" + nombre + ", marcas=" + Arrays.toString(marcas) + "]";
	}

	public int getVentas() {
		int ventas = marcas[0]+marcas[1]+marcas[2];
		return ventas;
	}
	
}