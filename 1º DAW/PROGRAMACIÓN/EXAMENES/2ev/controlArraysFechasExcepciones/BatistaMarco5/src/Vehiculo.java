import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Vehiculo {
	Random random = new Random();
	private static int minimo = 1, maximo = 100;
	private String mat;
	private LocalTime hInicio, hFinal;
	private long precio;
	private int estado, codReserva;  //0.Disponible; 1.Reservado; 2.Funcionamiento;
	public Vehiculo(String mat) {
		super();
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Vehiculo [mat=" + mat + ", estado=" + estado + "]";
	}
	public int reservar() {
		if (estado == 0) {
			this.estado = 1;//reservado
			codReserva = random.nextInt(maximo - minimo + 1) + minimo; //cod reserva
			return codReserva;
		}
		return -1;
	}
	public int getCodReserva() {
		return codReserva;
	}
	public int getEstado() {
		return estado;
	}
	public String getMat() {
		return mat;
	}
	public void funcionamiento() {
		hInicio = LocalTime.now();
		this.estado = 2;
		
	}
	public long aparcar() {
		hFinal = LocalTime.now();
		precio = (long) (ChronoUnit.SECONDS.between(hInicio, hFinal)*0.8);
		this.estado = 0;
		return precio;
		
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
