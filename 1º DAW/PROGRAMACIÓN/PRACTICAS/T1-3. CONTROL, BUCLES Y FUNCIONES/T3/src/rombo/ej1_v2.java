package rombo;
import java.util.*;
public class ej1_v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Numero: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<= n; i++) {
			int j = i;
			int k = n - i;
			
			for (;k>0;k--) {
				System.out.print(" ");
			}
			while (j!=0) {
				System.out.print(i);
				System.out.print(" ");
				j--;
			}
			System.out.println();
		}
		for (int i = n - 1; i>0; i--) {
			int j = i;
			int k = n - i;
			
			for (;k>0;k--) {
				System.out.print(" ");
			}
			while (j!=0) {
				System.out.print(i);
				System.out.print(" ");
				j--;
			}
			System.out.println();
		}
	}
}
