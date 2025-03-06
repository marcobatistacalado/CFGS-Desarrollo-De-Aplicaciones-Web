package ej1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayReales miarray = new ArrayReales(5);
		miarray.add(10);
		miarray.add(5);
		miarray.add(30);
		miarray.add(35);
		miarray.add(15);
		System.out.println("Numero max: "+miarray.maximo());
		System.out.println("Numero min: "+miarray.minimo());
		System.out.println("Sumatorio: "+miarray.sumatorio());
	}

}
