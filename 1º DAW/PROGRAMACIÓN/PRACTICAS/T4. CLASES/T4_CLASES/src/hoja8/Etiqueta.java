package hoja8;

public class Etiqueta {
	
	private int h,b;
	private char car;
	
	public Etiqueta(int altura, int ancho, char caracter) {
		h = altura;
		b = ancho;
		car = caracter;
	}

	public void setCar(char car) {
		this.car = car;
	}

	public void mostrar() {
		int hmax = h;
		int bmax = b;
		for (;h>0;h--) {
			if (h == 1 || h ==hmax) {
				for (;b>0;b--) {
					System.out.print(car);
				}
			}else {
				for (;b>1;b--) {
					if (b == bmax || b == 2) {
						System.out.print(car);
					}
					if (b!=2) {
					System.out.print(" ");
					}
				}
			}
			System.out.println();
			b=bmax;
		}
	}
	
	

}
