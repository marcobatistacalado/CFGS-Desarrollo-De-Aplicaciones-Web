package voluntarios;

public class Usuario {
	private String nombre, password;
	private int mins;

	public Usuario(String nombre, String password, int mins) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.mins = mins;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public int getMins() {
		return mins;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", password=" + password + ", mins=" + mins + "]";
	}
}
