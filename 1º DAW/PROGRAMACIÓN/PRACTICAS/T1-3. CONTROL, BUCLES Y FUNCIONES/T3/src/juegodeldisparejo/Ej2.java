package juegodeldisparejo;

import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int i = 0;
		while (i != 5) {
			int j1 = random.nextInt(2), j2 = random.nextInt(2), j3 = random.nextInt(2);
			System.out.println(j1+"-"+j2+"-"+j3);
			
			if (j1 == j2 && j2 == j3) {
				System.out.println("EMPATE");
			}
			if (j1 == j2 && j2 != j3) {
				System.out.println("GANA J3");
			}
			if (j2 == j3 && j3 != j1) {
				System.out.println("GANA J1");
			}
			if (j1 == j3 && j3 !=j2) {
				System.out.println("GANA J2");
			}
			i++;
		}
	}

}
