/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otro;

public class pedido {
    public int codigo, cantidad;
    public double p,t;
    
    public pedido(int c,int ca,double pr){
        codigo=c;
        cantidad=ca;
        p=pr;
        t=p*cantidad;
    }
    
    public double rebajar(double por){
        t=t-(t*por)/100;
        return t;
    }
    
}
