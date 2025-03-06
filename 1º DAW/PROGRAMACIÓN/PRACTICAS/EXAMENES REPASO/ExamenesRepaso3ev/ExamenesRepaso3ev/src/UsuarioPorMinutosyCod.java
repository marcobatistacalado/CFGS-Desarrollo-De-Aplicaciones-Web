import java.util.Comparator;

public class UsuarioPorMinutosyCod implements Comparator <Usuario>{

	@Override
	public int compare(Usuario o1, Usuario o2) {
		//*************************IMPORTENTE INTEGER ES EL WRAPPER QUE SI TIENE EL METODO COMPARETO
		// TODO Auto-generated method stub
		int minutos = ((Integer)o2.getMinutos()).compareTo((Integer)o1.getMinutos());
		if (minutos == 0) {
			return o1.getCodSocio().compareTo(o2.getCodSocio());
		}
		return minutos;
		
	}

}
