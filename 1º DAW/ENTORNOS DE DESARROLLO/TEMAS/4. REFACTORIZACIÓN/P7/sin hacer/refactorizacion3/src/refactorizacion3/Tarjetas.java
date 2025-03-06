/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion3;
import java.util.*;

/**
 *
 * @author BEGO
 */
public class Tarjetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double saldo;
        String n;
        System.out.println("Anota nombre");
        n=sc.nextLine();
        do{
            System.out.println("Anota saldo:");
            saldo=sc.nextDouble();
            if (saldo<1000)
                System.out.println("Saldo menor del permitido");
        }while(saldo<1000);
        Tarjeta c1=new Tarjeta(n,saldo);
        System.out.println("Anota nombre");
        n=sc.nextLine();
        do{
            System.out.println("Anota saldo:");
            saldo=sc.nextDouble();
            if (saldo<1000)
                System.out.println("Saldo menor del permitido");
        }while(saldo<1000);
        Tarjeta c2=new Tarjeta(n,saldo);
        System.out.println("Anota el importe a ingresar:");
        double importe=sc.nextDouble();
        c1.saldo=c1.saldo+importe;
        System.out.println("Anota importe a sacar");
        importe=sc.nextDouble();
        c1.s(importe);
        System.out.println("Información de la tarjeta 1:"+ c1.numero+","+ c1.nombre+ ","+ c1.saldo);
        c2.numero=Tarjeta.t;
        Tarjeta.t++;
        System.out.println("Nuevo nombre de la tarjeta:");
        String s=sc.nextLine();
        c2.nombre=s;
        System.out.println("Información de la tarjeta 2:"+ c2.numero+","+ c2.nombre+ ","+ c2.saldo);
    }
}
