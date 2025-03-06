package metodos;
import java.util.*;
public class borrarelementoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num, pos;
		int numeros[] = {3,5,2,7,4};
		int tam = numeros.length;
		
		while (tam > 0) {
			for (int i =0; i<tam; i++) {
				System.out.println(numeros[i]);
			}
			
			System.out.println("Anota numero que quieres borrar");
			num = sc.nextInt();
			
			pos = buscar(numeros, tam, num);
			if (pos == -1) {
				System.out.println("No encontrado");
			}else {
				//BORRADO
				for (int j=pos; j<tam-1; j++) {
					numeros[j] = numeros[j+1];
				}
				numeros[tam-1] = 0; //si es de objetos pues null.
				tam--;
			}
		}
	}
	//BUSQUEDA DE UN ELEMENTO NUMERICO
	public static int buscar (int numeros[], int tam, int num) {
		for (int i = 0; i<tam; i++) {
			if (numeros[i]==num)
			return i;
		}
		return -1;
	}
}