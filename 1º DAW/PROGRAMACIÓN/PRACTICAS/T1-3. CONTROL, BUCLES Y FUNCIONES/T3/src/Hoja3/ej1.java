package Hoja3;
import java.util.*; 
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
			System.out.println("Introduce dos numeros:");
			int n1 = sc.nextInt(), n2 = sc.nextInt(), resultado;
		
			if (n1 > 0 && n2 > 0) {
				resultado = n1+n2;
				System.out.println(resultado);
			}
			else if (n1 < 0 && n2 < 0){
				resultado = n1-n2;
				System.out.println(resultado);
			}
			else{
				System.out.println("Error");
			}
		sc.close();
	}
}
