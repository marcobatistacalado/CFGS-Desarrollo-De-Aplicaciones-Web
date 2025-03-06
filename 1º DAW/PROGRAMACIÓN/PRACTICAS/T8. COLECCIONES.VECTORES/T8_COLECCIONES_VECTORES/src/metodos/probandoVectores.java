package metodos;
import java.util.Vector;

public class probandoVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector nombre = new Vector(); // capacidad inicial 10. Pero se incrementa doble al llenarse.
		Vector<String> cadenas = new Vector<String>(); // por defecto los objetos son object. Pero nosotros vamos a
														// PARAMETRIZAR para que no haya operaciones tipo casting.
		// .add añade al final
		cadenas.add("Hola");
		cadenas.add("Buenos dias");
		cadenas.add("Dias");
		System.out.println(cadenas);
		// puedes excoger una posición concreta a añadir. Y desplaza los demás.
		cadenas.add(0, "primero"); // No se puede meter fuera de celdas que no estén dadas de alta. Sin huecos.
		System.out.println(cadenas);
		System.out.println("Nº de cadenas: " + cadenas.size()); // saber cuantas
		System.out.println("El elemento 4 es: " + cadenas.get(2));
		cadenas.set(0, "cambio"); // modificar elemento.
		System.out.println(cadenas);
		cadenas.remove(2);// borrar elemento = recoloca y cambia indice.
		int pos = cadenas.indexOf("Dias"); //posicion en la que se encuentra la pos.
		if (pos == -1) {
			System.out.println("No existe esta cadena");
		} else {
			System.out.println("Cadena encontrada en la posicion: " + pos);
		}

		for (int i = 0; i < cadenas.size(); i++) {
			if(cadenas.get(i).equals("Dias")) { //en este caso puedo usar equals perosi es de mis objetos tendria que redefinir
				pos = i;
				System.out.println("Cadena encontrada en la posicion: "+pos);
				break;
			}
		}
		if (pos == -1) {
			System.out.println("No he encontrado la cadena.");
		}

	}

}
