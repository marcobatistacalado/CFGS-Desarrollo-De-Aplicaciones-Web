package Hoja5;
import java.util.*;
public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int ne = 0, c = 0;
		
		while (ne != 10) {
			ne = ne + 1;
			System.out.println("Introduce el salario:");
			int sal = sc.nextInt();
			if (sal>1000) {
				System.out.println("El empleado numero: "+ne+" cobra mas de 1000€");
				c = c + 1; 
			}
		}
		System.out.println("La cantidad de empleados que cobran más de 1000€: "+c);
	}

}
