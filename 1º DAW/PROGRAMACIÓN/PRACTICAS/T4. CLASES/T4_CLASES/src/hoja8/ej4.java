package hoja8;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Repartidor repartidor1 = new Repartidor(1);
        Repartidor repartidor2 = new Repartidor(2);

        repartidor1.realizarPedido(30, 5);
        repartidor2.realizarPedido(25, 3);

        System.out.println("Total de pedidos: " + Repartidor.getTotalPedidos());
        System.out.println("Ganancias de repartidor1: " + repartidor1.getTgan());
        System.out.println("Ganancias de repartidor2: " + repartidor2.getTgan());
    }

}
