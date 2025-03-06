//MARCO BATISTA CALADO
package tienda;

public class Garantia extends Arreglo {

	public Garantia() {
		super();
		// TODO Auto-generated constructor stub
		this.contG++; //actualizar numero de arreglos de garantia;
	}
	
	public double finalizar(int mins) throws FinalizadoException {
		if (finalizado) {
			throw new FinalizadoException ("El arreglo ya estaba finalizado.");
		}else {
			finalizado = true; //marcar como finalizado
			this.importe = (int)(30 * Math.random()); //numero entre 0-30.
			return this.importe;
		}
	}

	@Override
	public String toString() {
		return super.toString()+" --- TIPO: Garantia []";
	}

}
