package hoja8;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Viaje viaje1 = new Viaje ("Madrid", "Barcelona", 100, 20);
		System.out.println(viaje1.toString());
		
		//le estoy pasando numero de pasajeros y niños
		double reserva = viaje1.reservaPlazas(10, 2);
		if (reserva==0) {
			System.out.println("No se ha podido realizar la reserva");
		}else {
			System.out.println("Costo de la reserva = "+reserva);
		}
		
		if (viaje1.modPlazas(10)) {
			System.out.println("Plazas modificadas");
		}else {
			System.out.println("Plazas no modificadas");
		}
		
		System.out.println("Recaudado: "+Viaje.getRecaudado());
		
	}

}
