package hoja8;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Satelite s1 = new Satelite();
		Satelite s2 = new Satelite (2000,14,15);
		Satelite s3 = new Satelite (21,62);
		
		if (s2.estaOrbita()) {
			System.out.println("Segundo satelite en orbita.");
		}else {
			System.out.println("Segundo satelite no está en orbita");
		}
		
		if (s3.estaOrbita()) {
			System.out.println("Tercer satelite en orbita.");
		}else {
			System.out.println("Tercer satelite no está en orbita");
		}
		
		s3.setDistancia(3000);
		
		if (s3.estaOrbita()) {
			System.out.println("Tercer satelite en orbita.");
		}else {
			System.out.println("Tercer satelite no está en orbita");
		}
		System.out.println("INFORMACION SATELITES:");
		System.out.println(s1.toString());
		
		
		
	}

}
