package Hoja3;
import java.util.*;
public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la hora, a continuacion los minutos y a continuacion los segundos:");
		int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
		s = s + 1;
		if (s == 60) {
			s = 0;
			if (m == 59) {
				m = 0;
				h = h+1;
				if (h == 24) {
					h = 0;
				}	
			}	
		}
		System.out.println(h+":"+m+":"+s);
	}
}
