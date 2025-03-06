package ejemplo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Ppal {
	public static void main(String args[]) {
		// ArrayList<Student> al=new ArrayList<Student>();
		Vector<Student> al = new Vector();
		al.add(new Student(101, "Luis", 23));
		al.add(new Student(106, "Gemma", 27));
		al.add(new Student(105, "Pedro", 21));

		Collections.sort(al);
		/*
		 * Para usar Sort hay que obligar a la clase a implementer el metodo compareTo
		 * por eso usamos una interface y hacemos el metodo para comparar por el dato 
		 * que nos interesa. Ya que si recordamos el sort solo se podia utilizar con 
		 * elementos simples porque esos si tienen definidio el metodo CompareTo
		 */
		for (Student st : al) {
			System.out.println(st);
		}

	}
}
