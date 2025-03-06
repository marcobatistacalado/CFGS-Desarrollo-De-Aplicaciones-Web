package Hoja3;
import java.util.*;
public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner (System.in);
		int cod;
		while (true) {
			System.out.println("Introduce el codigo: ");
			cod = sc.nextInt();
			
			if (cod > 999 && cod < 10000 ) {
				break;
			}
			else {
				System.out.println("No tiene 4 digitos");
				sc.nextLine();//limpiar buffer
			}
		}
		System.out.println(cod);*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el codigo: ");
		int cod = sc.nextInt();
		while (cod>9999) {
			System.out.println("ERROR: CÓDIGO NO VÁLIDO.");
			cod=sc.nextInt();
		}
		int c1 = cod/1000;
		System.out.println("PROVINCIA	"+c1);
		cod = cod%1000;
		c1 = cod/100;
		System.out.println("TIPO DE OPERACIÓN	"+c1);
		c1=cod%100;
		System.out.print("TIPO DE OPERACIÓN	"+c1);
		
		/*FORMA CON CHAR Y SELECCIONAR CARACTER A CARACTER PERO AUN NO HEMOS VISTO ESTO Y SUBSTR
		
		String c = null;
		if (cod >= 0 && cod <10) {
			//numeros del 0 al 9 - 0001, 0002...
			c = "000" + cod;	// string concatenado con int, VARIABLE STRING
		}else if (cod >= 10 && cod < 100) {
			//numero del 10 al 99 - 0010,0011...
			c = "00" + cod;
		}else if (cod>=100 && cod < 1000){
			//numero del 100 al 999
			c = "0" + cod;
		}else {
			c = "" + cod;
		}
		
		System.out.println("PROVINCIA	"+c.charAt(0));
		System.out.println("TIPO DE OPERACIÓN	"+c.charAt(1));
		System.out.println("NÚMERO DE OPERACIÓN   "+c.charAt(2)+c.charAt(3));
		*/
		
		/* UNA FORMA QUE NO TERMINA DE ESTAR BIEN JE.
		 
		for  (int i = 0; i < c.length(); i++) {
			char caracter = c.charAt(i), caracter2 = 'x';
			if (i==0) {
				System.out.println("PROVINCIA	"+caracter);
			}
			if (i==1) {
				System.out.println("TIPO DE OPERACIÓN	"+caracter);
			}
			if (i==2) {
				caracter2 = caracter;
			}
			if (i==3) {
				System.out.print("TIPO DE OPERACIÓN	"+caracter2+""+caracter);;
			}
			
			
		}
		*/
		
		
		
			
	}

}
