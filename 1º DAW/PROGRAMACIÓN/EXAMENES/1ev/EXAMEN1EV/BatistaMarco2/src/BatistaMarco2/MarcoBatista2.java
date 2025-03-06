package BatistaMarco2;
//MARCO BATISTA 2
public class MarcoBatista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarjeta t1 = new Tarjeta (1, 1234,11, 2023, "Marco", 1000);
		Tarjeta t2 = new Tarjeta (2, 4321, 12, 2025, "Jerome", 1000);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		t1.recargarSaldo(100);
		t2.recargarSaldo(20);
		
		System.out.println();
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		//Pagar
		t1.pagar(1100, 1234, 10, 2023);
		System.out.println();
		System.out.println(t1.toString());
		
		//recargar
		t1.recargarSaldo(50);
		System.out.println();
		System.out.println(t1.toString());
		
		//tarjeta caducada
		t1.pagar(20, 1234, 12, 2023);
		System.out.println();
		System.out.println(t1.toString());
		
		//pin erroneo
		t2.pagar(20, 1111, 11, 2023);
		
		//pago superior a saldo
		System.out.println();
		t2.pagar(1770, 4321, 10, 2023);
		System.out.println(t2.toString());
		
		//bloqueo e intentar pagar
		t1.setBloqueo();
		System.out.println();
		System.out.println(t1.toString());
		t1.pagar(20, 1234, 10, 2023);
		System.out.println();
		System.out.println(t1.toString());
		
		//comparacion de tarjetas
		if (Tarjeta.igualTarjeta(t1, t2)==true) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		//mostrar numero total
		System.out.println("Operaciones realizadas:"+Tarjeta.getOperaciones());
		
		
	}

}
