package Hoja3;
import java.util.*;
public class EJ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una nota númerica: ");
		int nota = sc.nextInt();
		if (nota >= 1 && nota <5) {
			System.out.println(nota+" Insuficiente");
		}else if (nota == 5) {
			System.out.println(nota+" Suficiente");
		}else if (nota == 6) {
			System.out.println(nota+" Bien");
		}else if (nota == 7 || nota == 8) {
			System.out.println(nota +" Notable");
		}else if (nota == 9 || nota == 10) {
			System.out.println(nota+" Sobresaliente");
		}
		/*switch (nota){
			case 1:
				System.out.print("Insuficiente");
				break;
			case 2:
				System.out.print("Insuficiente");
				break;
			case 3:
				System.out.print("Insuficiente");
				break;
			case 4:
				System.out.print("Insuficiente");
				break;
			case 5:
				System.out.print("Suficiente");
				break;
			case 6:
				System.out.print("Bien");
				break;
			case 7:
				System.out.print("Notable");
				break;
			case 8:
				System.out.print("Notable");
				break;
			case 9:
				System.out.print("Sobresaliente");
				break;
			case 10:
				System.out.print("Sobresaliente");
				break;
				
		
		}*/
		
		
	}

}
