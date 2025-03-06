package hoja8;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargamento carga1 = new Cargamento ("Platano", "Madrid", 30, 10, 20);
		Cargamento carga2 = new Cargamento ("Naranja", "Valencia", 40, 20, 30);
		Cargamento carga3 = new Cargamento ("Manzana", "Madrid", 40, 10, 20);
		
		System.out.println(carga1.toString());
		System.out.println(carga2.toString());
		System.out.println(carga3.toString());
		
		carga1.rebajar(5);
		System.out.println(carga1.toString());
		
		if (carga2.vender(40) != -1) {
			System.out.println(carga2.toString());
		}else {
			System.out.println("no se ha podido realizar la venta");
		}

		if (Cargamento.mismaProcedencia(carga1,carga3)) {
			System.out.println("Tienen la misma procedencia");
		}
		//TAMBIEN SE PUEDE LLAMAR DE ESTA FORMA:
		if (carga1.mismoCargamento2(carga2)) { //-- ORIENTACION A OBJETOS
			System.out.println("Misma procedencia");
		}
		System.out.println(Cargamento.getGanancia());
		
	}

}
