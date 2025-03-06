package metodos;

public class excepcionParseTransformacion {
		//el throw ese saca la expcepcion fuera
	public static void main(String[] args) /*throws IOException*/{
		// TODO Auto-generated method stub
		String cad = "23.2$12$1.1$15.7A$2.02"; 
		//PRODUCIR UNA EXCEPCION PONINEDO UN CARACTER PORQUE LUEGO REALIZAMOS LA TRANSFORMACION A DOUBLE
		String resultado[];
		resultado=cad.split("\\$"); //METODO SPLIT
		
		for (int i = 0; i<resultado.length; i++) {
			System.out.println(resultado[i]);
		}
		
		//Ahora lo quiero en decimales no de cadenas
		double decimales[];
		decimales = new double [resultado.length];
		for (int i = 0; i<resultado.length; i++) {
			//EXCEPCION
			try {
			decimales[i] =Double.parseDouble(resultado[i]);//IMPORTANTE LA TRANSOFRMACION
			}catch(NumberFormatException e) {
				System.out.println("Este dato no es un double: "+resultado[i]);
				System.out.println("Se ha producido la excepción: "+e.toString()); //si queremos mostrar info de la excepcion
				decimales[i]=0;
				//tambien podemos cerra el programa
				//System.exit(0);
			}
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
