package matrices;
import java.util.Random;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][]=new int[3][3];
		Random random = new Random();
		int minimo = 0;
		int maximo = 100;
		
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz.length; c++) {
				matriz[f][c]=random.nextInt(maximo - minimo + 1) + minimo;
			}
		}
		
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz.length; c++) {
				System.out.print("\t" + matriz[f][c]);
			}
			System.out.println();
		}
	}

}
