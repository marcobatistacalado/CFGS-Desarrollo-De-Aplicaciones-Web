package BatistaMarco2;
import java.util.Random;
//MARCO BATISTA 2
public class Tarjeta {
	
	private int num, clave, mes, ano;
	private String titular;
	private double saldo;
	private boolean bloqueo;
	private static int operaciones=0;
	
	public Tarjeta(int num, int clave, int mes, int ano, String titular, double saldo) {
		Random random = new Random ();
		this.num = num;
		this.clave = clave;
		//tambien se podria hacer asi pero con string seria el unico dato que no haria falta pedir: random.nextInt(10)*1000+random.nextInt(10)*100+random.nextInt(10)*10+random.nextInt(10);
		this.mes = mes;
		this.ano = ano;
		this.titular = titular;
		this.saldo = saldo;
		bloqueo = false;
	}

	public boolean pagar(double imp, int clave, int mes, int ano) {
		if (bloqueo == true) {
			System.out.println("Tarjeta bloqueada no puedes realizar pago");
			return false;
		}
		if (imp>0 && this.clave == clave) {
			if (this.ano > ano|| (ano == this.ano && this.mes >= mes)) {
				if (imp <= saldo) {
					saldo = saldo - imp;//actualizacion de saldo
					System.out.println("Compra realizada");
					operaciones++;
					return true;
				}else {
					System.out.println("El importe es mayor que el saldo");
				}
			}else {
				System.out.println("Tarjeta caducada");
			}
		}else {
			System.out.println("Clave incorrecta");
		}
		return false;
	}
	
	
	public void recargarSaldo(double saldo) {
		this.saldo += saldo;
		System.out.println("Tarjeta recargada");
		operaciones++;
	}
	
	public void setBloqueo() {
		if (bloqueo == false) {
			bloqueo = true;
		}else {
			bloqueo = false;
		}
	}
	
	public static boolean igualTarjeta (Tarjeta t1, Tarjeta t2) {
		if (t1.getNum() != t2.getNum()) {
			return false;
		}
		if (t1.getTitular() != t2.getTitular() ) {
			return false;
		}
		return true;
	}

	public int getNum() {
		return num;
	}

	public String getTitular() {
		return titular;
	}

	
	public static int getOperaciones() {
		return operaciones;
	}

	@Override
	public String toString() {
		return "Tarjeta [num=" + num + ", clave=****"+ ", mes=" + mes + ", ano=" + ano + ", titular=" + titular
				+ ", saldo=" + saldo + ", bloqueo=" + bloqueo + "]";
	}

	
	
	
	
}
