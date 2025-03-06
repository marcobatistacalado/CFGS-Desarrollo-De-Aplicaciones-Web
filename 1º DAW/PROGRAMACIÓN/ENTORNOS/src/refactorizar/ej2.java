/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;
import java.util.*;
import java.io.*;
/**
 *
 * @author Bego
 */
public class ej2 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        pedido p1=new pedido(2,4,5.3);
        pedido p2=new pedido(3,5,7.2);
        if (p1.getT()<p2.getT())
            System.out.println("El pedido mÃ¡s caro es el de cÃ³digo:"+p2.getCodigo());
        else
            if (p1.getT()>p2.getT())
                System.out.println("El pedido mÃ¡s caro es el de codigo:"+p1.getCodigo());
        
       System.out.println("\nAnota el nuevo precio del primer pedido:");
       p1.setP(sc.nextDouble());
       p1.setT(p1.getP()*p1.getCantidad());
       System.out.println("\nEl nuevo precio es:"+p1.getT());
       
       System.out.println("\nEl precio del primer pedido con una rebaja del 20% es de:"+p1.rebajar(20));
       
       System.out.println("\nInformaciÃ³n del primer pedido,cod:" + p1.getCodigo() + ",precio unidad:"+ p1.getP() + ",cantidad:"+ p1.getCantidad());
       System.out.println("\nInformaciÃ³n del segundo pedido,cod:" + p2.getCodigo() + ",precio unidad:"+ p2.getP() + ",cantidad:"+ p2.getCantidad());
    }
}
