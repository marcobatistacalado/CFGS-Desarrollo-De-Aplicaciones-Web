package codigo;

public class Examen {
	public static boolean validarTirada(int numero) {
		if (numero > 1 || numero < 10)
			return true;
		return false;
	}

	public static int tirada(int numero) {
		int puntos = 0;
		switch (numero) {
		case 1:
		case 2:
			puntos = -5;
			break;
		case 3:
		case 5:
			puntos = 5;
			break;
		case 4:
			puntos = 50;
			break;
		}
		return puntos;
	}

	public static int juego(int numero) {
		int puntos = -2;
		if (validarTirada(numero))
			puntos = tirada(numero);
		return puntos;

	}

}
