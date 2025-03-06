package ej4;

public class Videojuego implements Prestable {
	private String titulo, genero, compania;
	private int horasEstimadas;
	private boolean prestado;
	private int contadorPrestamos;
	public Videojuego(String titulo, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horasEstimadas = 10;
		this.prestado = false;
		this.contadorPrestamos = 0; // Inicializa el contador de préstamos en 0
	}
	public String getTitulo() {
		return titulo;
	}
	public void aumentarContadorPrestamos() {
        this.contadorPrestamos++;
    }
	@Override
	public boolean prestar() {
		if (!this.prestado) {
			this.prestado = true;
			return true;
		}else {
			return false;
		}
	}
	@Override
	public boolean devolver() {
		// TODO Auto-generated method stub
		if (this.prestado) {
			this.prestado = false;
			return true;
		}else {
			return false;
		}
	}
	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.prestado;
	}
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", compania=" + compania + ", horasEstimadas="
				+ horasEstimadas + ", prestado=" + prestado + "]";
	}
	
	public int getContadorPrestamos() {
		// TODO Auto-generated method stub
		return this.contadorPrestamos;
	}
	
}
