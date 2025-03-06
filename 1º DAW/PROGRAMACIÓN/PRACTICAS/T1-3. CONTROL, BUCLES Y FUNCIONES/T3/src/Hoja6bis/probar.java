package Hoja6bis;
import java.util.*; 
public class probar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int cap;
		do {
			System.out.println("Introduce capacidad:");
			cap = sc.nextInt();
		}while(cap<0);
		
		int peso=0, acum=0;
		
		while (true) {
			System.out.println("Introduce peso: ");
			peso = sc.nextInt();
			if (peso==-1) {
				break;
			}
			if (cap >= peso) {
				cap = cap - peso;
				acum = acum + 1;
				if (cap == 0) {
					break;
				}
			}else {
				System.out.println("no entra");
			}
		}
		System.out.println("CUANTOS ENTRAN: "+acum);
	}

}
