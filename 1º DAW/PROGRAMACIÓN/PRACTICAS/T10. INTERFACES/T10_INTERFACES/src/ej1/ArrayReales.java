package ej1;

public class ArrayReales implements Estadisticas {
	private double numeros[];
	private int tam; //tamaño maximo del array.
	private int num; //numero de datos que tiene actualmente el array
	
	public ArrayReales(int tam) {
		numeros = new double[tam];
		this.tam=tam;
	}

	public boolean add(double n) {
		//introducir ese dato dentro de mi array
		if (num==tam) {
			return false;
		}else {
			numeros[num] = n;
			num++;
			return true;
		}
	}

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		double min = numeros[0];
		for (int i = 0; i<tam; i++) {
			if (numeros[i]<min) {
				min = numeros[i];
			}
		}
		return min;
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		double max = numeros[0];
		for (int i = 0; i<tam; i++) {
			if (numeros[i]>max) {
				max = numeros[i];
			}
		}
		return max;
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		double sumatorio=0;
		for (int i = 0; i<tam; i++) {
			sumatorio += numeros[i];
		}
		return sumatorio;
	}
}
