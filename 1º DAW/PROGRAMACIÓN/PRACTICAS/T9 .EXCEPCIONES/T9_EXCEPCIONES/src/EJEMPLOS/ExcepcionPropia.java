package EJEMPLOS;

import java.util.*;

/**
 * Programa que recibe un n�mero y devuelve el n�mero de divisores de �ste.
 * Descarta usando excepciones los n�meros incorrectos o los menores o iguales que 0
 * @author Bego
 *
 */

public class ExcepcionPropia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un n�mero:");
		try{
			numero=sc.nextInt();
			System.out.println("N�mero de divisores:"+divisoresNumero(numero));
			
		}catch(InputMismatchException e){
			System.out.println("Formato incorrecto");
		}catch(NumeroIncorrectoException e){
			System.out.println(e.getMessage());
			
		}

	}
	
	/**
	 * Funci�n que recibe un n�mero y devuelve el n�mero de divisores de �ste
	 * @param num n�mero a procesar
	 * @return n�mero de divisores
	 * @throws NumeroIncorrectoException si el n�mero recibido es negativo � 0
	 */
	
	public static int divisoresNumero(int num) throws NumeroIncorrectoException{
		int contador=0;
		if (num<=0)
			throw new NumeroIncorrectoException("Valor no permitido");
		for (int i=1;i<=num;i++)
			if (num%i==0)
				contador++;
		return contador;
	}

}
