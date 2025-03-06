package metodos;

public class splitStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad = "23.2$12$1.1$15.7$2.02";
		String resultado[];
		resultado=cad.split("\\$"); //METODO SPLIT
		
		for (int i = 0; i<resultado.length; i++) {
			System.out.println(resultado[i]);
		}
		
		//Ahora lo quiero en decimales no de cadenas
		double decimales[];
		decimales = new double [resultado.length];
		for (int i = 0; i<resultado.length; i++) {
			decimales[i] =Double.parseDouble(resultado[i]);//IMPORTANTE LA TRANSOFRMACION
		}
		double suma=0;
		System.out.println();
		for (int i = 0; i<decimales.length; i++) {
			System.out.println(decimales[i]);
			suma += decimales[i];
		}
		System.out.println("Suma total: "+suma);
	}

}
