package Hoja6;
import java.util.*;
public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i = 1, grupo = 1;
		double total = 0, suma = 0;
		while (true) {
			System.out.println("Introduce el numero de adultos:");
			double numa = sc.nextInt();
			System.out.println("Introduce el numero de niños:");
			double numn = sc.nextInt();
			System.out.println("Introduce 'S' si es tarifa reducida:");
			sc.nextLine();
			char tar = sc.nextLine().charAt(0);
			
			if (tar == 'S') {
				numa = numa*2;
				numn = numn*1.2;
			}else {
				numa = numa*3;
				numn=numn*2;
			}
			total = numa+numn;
			double total2 = 0;
			if (i==1) {
				total2 = total;
			}
			if (total > total2) {
				grupo = i;
			}
			suma = suma + total;
			System.out.println("Grupo "+i+": "+total);
			if (suma > 20) {
				break;
			}
			i++;
		}
		System.out.println("El grupo que mas se ha gastado es el: "+grupo);
	}

}
