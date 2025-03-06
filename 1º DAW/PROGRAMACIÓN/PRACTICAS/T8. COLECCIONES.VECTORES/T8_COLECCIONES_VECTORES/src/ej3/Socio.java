package ej3;

public class Socio extends Cliente {
	private String carnet;

	public Socio(String nombre, String pelicula, int nEntradas, String carnet) {
		super(nombre, pelicula, nEntradas);
		this.carnet = carnet;
	}
	
	//METODO PAGO ENTRADAS: 20% descuento 4 max. Resto precio normal
	public double comprar () {
		double compra;
		double descuento = (pEntrada*20)/100; //Descuento por entrada.
		if (this.nEntradas>4) {
			this.nEntradas -= 4;
			compra = 4*descuento; //Lo aplicamos al maximo que es 4.
			compra += this.nEntradas*pEntrada; // Sumamos el precio de las entradas normales.
		}else {
			compra = this.nEntradas*descuento; // Si es menor si o si es descuento
		}
		return compra;
	}

	@Override
	public String toString() {
		return super.toString()+"--- Socio [carnet=" + carnet + "]";
	}
	
	
}
