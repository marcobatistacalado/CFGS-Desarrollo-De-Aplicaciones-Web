package matrices;

import java.util.Scanner;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[][]= new int [4][3];
		Scanner sc = new Scanner (System.in);
		for (int f=0; f<4; f++) {
			for (int c=0; c<3;c++) {
				System.out.print("Introduce dato:");
				tabla[f][c]=sc.nextInt();
			}
			System.out.println();
		}
		
		for (int f=0; f<4; f++) {
			for (int c=0; c<3;c++) {
				System.out.print("\t"+tabla[f][c]);
			}
			System.out.println();
		}
	}

}
