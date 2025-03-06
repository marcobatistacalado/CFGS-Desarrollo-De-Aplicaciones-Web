package ej3_v2;

import java.util.Comparator;

public class StudentPorFIncor implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg1.getfIncor().compareTo(arg0.getfIncor()); 
		//PREGUNTAR A BEGOÑA SI CON CAMBIAR EL ORDEN ES VALIDO.
		
	}

}
