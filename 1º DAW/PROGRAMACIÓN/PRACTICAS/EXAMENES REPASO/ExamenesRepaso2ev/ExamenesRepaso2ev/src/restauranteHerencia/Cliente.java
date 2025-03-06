package restauranteHerencia;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Cliente {
// tenedor / gourmet
	private int numPersonas;
	private static int numMesas = 0;
	private int numMesa;
	private int servidoPorCamarero = 0;
	protected int bebidas, raciones;
	protected double cuenta;
	private static int totalComensales = 0;

	public Cliente(int numPersonas) {
		super();
		this.numPersonas = numPersonas;
		this.numMesa = ++numMesas;
		totalComensales += numPersonas;
	}

	public int getNumMesa() {
		return numMesa;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void ServidoPorCamarero(int bebidas, int raciones) {
		this.servidoPorCamarero++;
		this.bebidas += bebidas;
		this.raciones += raciones;

	}

	public int getServidoPorCamarero() {
		return servidoPorCamarero;
	}

	public int getBebidas() {
		return bebidas;
	}

	public int getRaciones() {
		return raciones;
	}

	public double pagar() {
		LocalDate fHoy = LocalDate.now();
		DayOfWeek diaSemana = fHoy.getDayOfWeek();
		// que este entre el lunes(0) y viernes(4)
		if (diaSemana.ordinal() >= 0 && diaSemana.ordinal() <= 4) {
			this.cuenta = bebidas * 2 + (raciones * 15) - (raciones * 15 * 10) / 100;
		}

		return this.cuenta;
	}

	public void transferirConsumiciones(Cliente mesa2) {
		this.bebidas += mesa2.getBebidas();
		this.raciones += mesa2.getRaciones();
		mesa2.setBebidas(0); //aunque da igual porque vamos a eliminar el obj
		mesa2.setRaciones(0);
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public void setRaciones(int raciones) {
		this.raciones = raciones;
	}

	public static int getTotalComensales() {
		return totalComensales;
	}


	@Override
	public String toString() {
		return "Cliente [numPersonas=" + numPersonas + ", numMesa=" + numMesa + ", servidoPorCamarero="
				+ servidoPorCamarero + ", bebidas=" + bebidas + ", raciones=" + raciones + ", cuenta=" + cuenta + "]";
	}

}
