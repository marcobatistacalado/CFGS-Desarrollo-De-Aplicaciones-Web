package Hoja5;
import java.util.*;
public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una nota: ");
		int nota = sc.nextInt(), suspenso = 0, aprobado = 0, notable = 0, sobresaliente = 0 ;
		
		while (nota != -1) {
			System.out.println("Introduce una nota: ");
			nota = sc.nextInt();
			if (nota > 10 || nota < -1) {
				System.out.println("Nota introducida incorrecta");
			}else {
				switch (nota) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
					suspenso = suspenso + 1;
					break;
				case 5:
				case 6:
					aprobado = aprobado + 1;
					break;
				case 7:
				case 8:
					notable = notable + 1;
					break;
				case 9:
				case 10:
					sobresaliente = sobresaliente + 1;
					break;
				}
			}
		}
		System.out.println("Numero suspensos: "+suspenso);
		System.out.println("Numero aprobados: "+aprobado);
		System.out.println("Numero notables: "+notable);
		System.out.println("Numero de sobresaliente: "+sobresaliente);
		
		
	}

}
