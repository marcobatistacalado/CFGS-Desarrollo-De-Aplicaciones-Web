package ej8;

import java.util.Vector;

public class Normal {
	private boolean status = false; // abierto-cerrado
	protected Vector <Vehiculo> cola = new Vector <Vehiculo>();
	public Normal() {
		super();
	}

	public void abrirCabina() {
		if (!this.status) {
			this.status = true;
			System.out.println("Cabina abierta con éxito.");
		} else {
			System.out.println("La cabina ya estaba abierta.");
		}
	}

	public double pagar(Vehiculo v1) {
		double pago = -1;
		double dist = v1.getDistancia();
		if (v1.getTipo() == 0) { // que sea otro tipo de vehiculo
			pago = 4;
			if (dist > 14) {
				pago += 0.5 * (dist - 15);
			}
		} else { //turismo
			if (dist <= 5) {
				pago = dist * 1.5;
			} else if (dist <= 30) {
				pago = dist * 30;
			} else if (dist > 30) {
				pago = dist * 0.25;
			}
		}

		return pago;
	}

	@Override
	public String toString() {
		return "Normal [status=" + status + ", cola=" + cola + "]";
	}
	

}
