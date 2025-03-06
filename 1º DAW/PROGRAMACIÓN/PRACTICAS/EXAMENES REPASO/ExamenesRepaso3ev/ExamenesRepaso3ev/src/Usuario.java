import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Usuario {
	private String codSocio;
	private int minutos;

	public Usuario(String codSocio) {
		super();
		this.codSocio = codSocio;
	}

	public String getCodSocio() {
		return codSocio;
	}

	public void setMinutos(int minutos) {
		this.minutos += minutos;
	}

	public int getMinutos() {
		return minutos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // apuntan a la misma dirección de memoria
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(codSocio, other.codSocio);
	}

	@Override
	public String toString() {
		return "Usuario [codSocio=" + codSocio + ", minutos=" + minutos + "]";
	}

}
