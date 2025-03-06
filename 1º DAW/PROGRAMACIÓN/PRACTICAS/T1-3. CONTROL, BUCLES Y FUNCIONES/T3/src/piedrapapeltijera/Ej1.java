package piedrapapeltijera;
import java.util.*;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("1 - PIEDRA");
		System.out.println("2 - PAPEL");
		System.out.println("3 - TIJERA");
		System.out.println("4 - LAGARTO");
		System.out.println("5 - SPOCK");
		System.out.println("Jugador elige tu jugada:");
		int j1 = sc.nextInt();
		Random random = new Random();
		int cpu = random.nextInt(5)+1;
		
		switch (j1) {
			case 1:
				System.out.println("JUGADA J1: PIEDRA");
				break;
			case 2:
				System.out.println("JUGADA J1: PAPEL");
				break;
			case 3:
				System.out.println("JUGADA J1: TIJERA");
				break;
			case 4:
				System.out.println("JUGADA J1: LAGARTO");
				break;
			case 5:
				System.out.println("JUGADA J1: SPOCK");
				break;
		}
		switch (cpu) {
		case 1:
			System.out.println("JUGADA CPU: PIEDRA");
			break;
		case 2:
			System.out.println("JUGADA CPU: PAPEL");
			break;
		case 3:
			System.out.println("JUGADA CPU: TIJERA");
			break;
		case 4:
			System.out.println("JUGADA CPU: LAGARTO");
			break;
		case 5:
			System.out.println("JUGADA CPU: SPOCK");
			break;
	}
	
		
		if (j1 == cpu) {
			System.out.println("EMPATE");
		}
		
		//ES MEJORABLE USANDO UN BOOLEAN Y ASI NO ESCRIBIR SYSOUT 80 VECES.
		//TAMBIEN ES MEJORABLE CON UN SWITCH PENSANDO QUE SI EN CASO 1 DEL JUGADOR 1 QUE PUEDE GANAR SACANDO 1 (UNIENDO CONDICIONES DE LA CPU)
		//LAS TIJERAS CORTAN EL PAPEL.
		if (j1 == 3 && cpu == 2) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 2 && cpu == 3) {
			System.out.println("Gana la máquina");
		}
		//EL PAPEL CUBRE A LA PIEDRA
		if (j1 == 2 && cpu == 1) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 1 && cpu == 2) {
			System.out.println("Gana la máquina");
		}
		//LA PIEDRA APLASTA AL LAGARTO
		if (j1 == 1 && cpu == 4) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 4 && cpu == 1) {
			System.out.println("Gana la máquina");
		}
		//EL LAGAR ENVENENA A SPOCK
		if (j1 == 5 && cpu == 3) {
			System.out.println("Gana el jugador");
		}
		if (cpu == 5 && j1 == 3) {
			System.out.println("Gana la máquina");
		}
		//LAS TIJERAS DECAPITAN AL LAGARTO
		if (j1 == 3 && cpu == 4) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 4 && cpu == 3) {
			System.out.println("Gana la máquina");
		}
		//EL LAGARTO SE COME EL PAPEL
		if (j1 == 4 && cpu == 2) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 2 && cpu == 4) {
			System.out.println("Gana la máquina");
		}
		//EL PAPEL REFUTA A SPOCK
		if (j1 == 2 && cpu == 5) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 5 && cpu == 2) {
			System.out.println("Gana la máquina");
		}
		//SPOCK VAPORIZA LA PIEDRA
		if (j1 == 5 && cpu == 1) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 1 && cpu == 5) {
			System.out.println("Gana la máquina");
		}
		//LA PIEDRA APLASTA LAS TIJERAS
		if (j1 == 1 && cpu == 3) {
			System.out.println("Gana el jugador");
		}
		if (j1 == 3 && cpu == 1) {
			System.out.println("Gana la máquina");
		}
	}

}
