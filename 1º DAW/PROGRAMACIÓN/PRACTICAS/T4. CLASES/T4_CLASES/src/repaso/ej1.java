package repaso;
import java.util.*;
public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("MAt:");
		String mat = sc.nextLine();
		double presup;
		Vehiculo v1 = new Vehiculo (mat, "Kia", "Ceed", 2021, 1);
		Vehiculo v2 = new Vehiculo ("1234MAR", "TOYOTA", "YARIS", 2020, 2);
		
		if (validarMat(mat)) {
			System.out.println("bien");
		}
		System.out.println("Aluilar");
		int alquilar = sc.nextInt();
		
		if (alquilar == 1) {
			System.out.println("numero dias");
			int dias = sc.nextInt();
			presup = v1.alquiler(dias);
			if (presup == 0) {
				System.out.println("No se puede alquilar");
			}else {
				System.out.println("Alquilado. Presupuesto:"+presup);
			}
		}else {
			
		}
		
	}
	
	public static boolean validarMat (String mat) {
		mat = mat.toUpperCase();
		if (mat.length()!=7) {
			return false;
		}
		for (int i = 0; i<=3;i++) {
			char cod1 = mat.charAt(i);
			if (cod1 < '0' || cod1>'9') {
				return false;
			}
		}
		for (int b=4; b<=mat.length()-1;b++) {
			char cod2 = mat.charAt(b);
			if (cod2 < 'A' || cod2> 'Z') {
				return false;
			}
		}
		return true;
	}

}
