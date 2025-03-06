package ej8;

public class Abonado extends Normal {
	public double pagar(Vehiculo v1) {
		double pago = -1;
		double dist = v1.getDistancia();
		if (dist <= 5) {
			pago = dist;
		} else if (dist <= 30) {
			pago = dist * 3;
		} else if (dist > 30) {
			pago = dist * 5;
		}
		if (v1.getTipo() == 0) { // que sea otro tipo de vehiculo
			pago += (pago*20)/100; //20% más
		}
		return pago;
	}

	@Override
	public String toString() {
		return super.toString()+"------ Abonado []";
	}
}
