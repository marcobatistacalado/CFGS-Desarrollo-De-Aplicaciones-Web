package ej6_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main_Correcto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        HashMap<String, Integer> nacionalidades = new HashMap<String, Integer>();
        System.out.println("Anota nacionalidad, FIN para terminar:");
        n = sc.nextLine();
        while (!n.equalsIgnoreCase("FIN")) {
            if (nacionalidades.containsKey(n)) {
                int cuantos = nacionalidades.get(n);
                nacionalidades.put(n, cuantos + 1);
            } else {
                nacionalidades.put(n, 1);
            }
            System.out.println("Anota nacionalidad, FIN para terminar: ");
            n = sc.nextLine();
        }
        // Mostrar las nacionalidades y cuántas personas hay de cada una
        for (String i : nacionalidades.keySet()) {
            System.out.println("Hay " + nacionalidades.get(i) + " personas de nacionalidad " + i);
        }
    }
}
