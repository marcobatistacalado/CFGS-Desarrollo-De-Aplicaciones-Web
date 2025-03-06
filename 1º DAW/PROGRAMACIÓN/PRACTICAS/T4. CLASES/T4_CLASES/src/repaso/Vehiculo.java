package repaso;

public class Vehiculo {
	private String mat, modelo, marca;
	private int ano, categoria;
	private boolean alquiler;
	private static int numalquiler=0, ganantotal = 0;
	private double ganan;
	
	public Vehiculo(String mat, String modelo, String marca, int ano, int categoria) {
		this.mat = mat;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.categoria = categoria;
		alquiler = false;
		ganan = 0;
	}
	
	public double alquiler(int dias) {
		if (alquiler == true) {
			return 0;//si ya esta alquilado
		}
		double total = 0;
		if (categoria == 1) {
			if (dias<=2) {
				total = 45;
			}else {
				total = 30;
			}
			total *= dias;
		}else if (categoria == 2){
			if (dias<=2) {
				total = 50;
			}else {
				total = 40;
			}
		}
		alquiler = true;
		numalquiler++;
		ganan += total;
		ganantotal += total;
		return total;
	}

	public void setAlquiler() {
		if (alquiler == false) {
			System.out.println("Error");
		}else {
			alquiler = false;
			numalquiler--;
		}
	}

	public boolean saberAlquiler() {
		return alquiler;
	}

	public static int getGanantotal() {
		return ganantotal;
	}
	
	

	

	
	
}
