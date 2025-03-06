package ej1;
import java.util.Comparator;

public class AutomovilPorFecha implements Comparator <Automovil>{

	@Override
	public int compare(Automovil a1, Automovil a2) {
		//*************************IMPORTENTE DOUBLE ES EL WRAPPER QUE SI TIENE EL METODO COMPARETO
		// TODO Auto-generated method stub
		//ORDENAR DE MAS ANTIGUO A NUEVO
		int orden = a1.getFcompra().compareTo(a2.getFcompra());
		if (orden == 0) {
			//si son igual fecha ordenamos segun precio de menor a mayor
			return ((Double)a1.getPrecio()).compareTo((Double)a2.getPrecio());
		}
		return orden;
		
	}

}
