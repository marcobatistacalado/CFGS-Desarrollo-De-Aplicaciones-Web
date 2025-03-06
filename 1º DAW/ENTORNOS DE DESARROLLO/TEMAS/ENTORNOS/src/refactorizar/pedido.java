/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

public class pedido {
    private int codigo, cantidad;
    private double precio,total;
    
    public double getP() {
		return precio;
	}

	public void setP(double p) {
		this.precio = p;
	}

	public double getT() {
		return total;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setT(double t) {
		this.total = t;
	}

	public pedido(int c,int ca,double pr){
        codigo=c;
        cantidad=ca;
        precio=pr;
        total=precio*cantidad;
    }
    
    public double rebajar(double por){
        total=total-(total*por)/100;
        return total;
    }
    
}