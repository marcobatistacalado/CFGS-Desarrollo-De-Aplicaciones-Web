package juguemosalosdardos;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in );
		int dardo1=0,dardo2=0, turno=20, punt1=501, punt2=501, jug1=3,jug2=3;
		
		System.out.println("PUNTUACIÓN INICIAL: 501");
		while(turno>0) {
			while(jug1>0) {
				dardo1 = (int) (Math.random() * 21);
				System.out.println("DARDO JUGADOR1: "+dardo1);
				if (dardo1<punt1) {
					punt1 = punt1 - (dardo1);
				}
				jug1--;
			}
			jug1=3;
			System.out.println("PUNTUACION1: "+punt1);
			if(punt1==0) {
				System.out.println("Gano Jugador1");
				break;
			}
			while(jug2>0) {
				dardo2 = (int) (Math.random() * 21);
				System.out.println("DARDO JUGADOR2: "+dardo2);
				if (dardo2<punt2) {
					punt2 = punt2 - (dardo2);
				}
				jug2--;
			}
			jug2=3;
			System.out.println("PUNTUACION2: "+punt2);
			if(punt2==0) {
				System.out.println("Gano Jugador2");
				break;
			}
			turno--;
		}
		if (punt1>punt2) {
			System.out.println();
			System.out.println("Gana Jugador2");
		}else if (punt2>punt1) {
			System.out.println();
			System.out.println("Gana Jugador1");
		}else if (punt1 == punt2) {
			System.out.println();
			System.out.println("Empate");
		}
		
	}

}
