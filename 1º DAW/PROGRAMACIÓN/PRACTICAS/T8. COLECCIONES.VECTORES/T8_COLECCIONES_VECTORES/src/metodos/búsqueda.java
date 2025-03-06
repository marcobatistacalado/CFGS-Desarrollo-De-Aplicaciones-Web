package metodos;

import java.util.Objects;
import java.util.Vector;

import ej1.Alumno;

public class búsqueda {

	// METODO BUSCAR COMO CUANDO LO HACIAMOS EN ARRAYS
	public static int buscarAlumno(Vector<Alumno> alumnos, String alumno) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equals(alumno)) {
				return i;
			}
		}
		return -1;
	}

	// 1º AÑADIR ESTE METODO EN CLASE haciendo clicke derecho añadir source, hashcode y
	// equals.

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}
	*/
	// 2º CREAR UN CONSTRUCTOR PARA USAR LA BUSQUEDA CON EL EQUALS.
	/*public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	3º USAR INDEXOF EN EL MAIN 
	*/
}
