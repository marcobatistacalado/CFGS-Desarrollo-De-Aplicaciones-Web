package Hoja6;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		char cat;
		int catA = 0,catB = 0,catC= 0;
		while (true) {
			System.out.println("Introduce calibre:");
			int cal = sc.nextInt();
			if (cal == 0) {
				break;
			}
			if (cal >= 1 && cal <3) {
				catA = catA + 1;
			}else if (cal >= 3 && cal <= 5) {
				catB = catB + 1;
			}else if (cal>5) {
				catC = catC+ 1;
			}
			
		}
		System.out.println("Categoria A: "+catA);
		System.out.println("Categoria B: "+catB);
		System.out.println("Categoria C: "+catC);
	}

}
