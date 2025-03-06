package debbuger;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Rosa
 */
public class Debug1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int num,div=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Hola");
        
        do{
            System.out.println("Anota un número");
            num=sc.nextInt();
        }while(num<=0);
        
        System.out.println("\nSus divisores son:");
      
        while(div<=num){
            if (num%div==0)
                System.out.println(div);
            div++;
        }
    }
    
}