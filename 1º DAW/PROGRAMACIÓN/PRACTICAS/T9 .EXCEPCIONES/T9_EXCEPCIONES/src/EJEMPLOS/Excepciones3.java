package EJEMPLOS;
import java.io.*;

//Lee n�meros y los mete en un array de tres posiciones.
//Se controlan dos excepciones, la de formato incorrecto al intentar leer como n�mero algo
//que no lo es (Si leemos con BufferedReader la excepci�n que se produce es NumberFormatException),
//y ArrayIndexOutBoundsException cuando nos salimos del array.

public class Excepciones3 {

	public static void main(String[] args) throws IOException{
		
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    boolean incorrecto;
		    int  lista[]=new int[3];
		    // Bucle infinito
		    for(int i=0;;i++){
		        System.out.println("Introduce Casilla " + i);
		        try{
		            lista[i]=Integer.parseInt(br.readLine());
		        
		        }
		        catch (NumberFormatException e){
		            System.out.println("\nNumero introducido incorrecto");
		            i--;
		        }
		       catch (ArrayIndexOutOfBoundsException e) {
		           System.out.println("te has pasado de casillas");
		           break;
		       }
		    }
		    for (int i=0;i<lista.length;i++){
		        System.out.println("Casilla " + i + "- "+lista[i] );
		    }
		 }
		
	}
