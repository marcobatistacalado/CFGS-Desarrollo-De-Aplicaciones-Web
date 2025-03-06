/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

/**
 *
 * @author BEGO
 */
public class Tarjeta {
 public int numero;
 public String nombre;
 public double saldo;
 public static int t=5000;
 
 public Tarjeta(String n, double s){
     nombre=n;
     saldo=s;
     numero=t;
     t++;
 }
 
 public double s(double d){
     if (d>saldo){
         saldo=0;
         return saldo;
     }
     saldo=saldo-d;
     return d;
 }
 

     
 
 
 
}