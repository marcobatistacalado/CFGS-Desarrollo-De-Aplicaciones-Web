package Hoja4;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el día:");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes:");
		int mes = sc.nextInt();
		System.out.println("Introduce el año:");
		int ano = sc.nextInt();
		
		if (ano > 2023 || ano < 0) {
			System.out.println("Has introducido un año incorrecto");
		}else {
		
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia >= 1 && dia <=30) {
					dia += 1;
					if (dia == 31) {
						dia = 1;
						mes += 1;
						if (mes == 13) {
							mes = 1;
							ano +=1;
						}
					}
				}else {
					System.out.println("Has introducido un dia incorrecto");
				}
			}else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia >= 1 && dia <=31) {
				dia += 1;
					if (dia == 32) {
						dia = 1;
						mes += 1;
						if (mes == 13) {
							mes = 1;
							ano +=1;
						}
					}
				}else {
					System.out.println("Has introducido un dia incorrecto");
				}
			}else if (mes == 2) {
				if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
					
						if (dia >= 1 && dia <=29) {
							dia += 1;
							if (dia == 30) {
								dia = 1;
								mes += 1;
								if (mes == 13) {
									mes = 1;
									ano +=1;
								}
							}
						}else {
							System.out.println("Has introducido un dia incorrecto");
						}
				}else {
					if (dia >= 1 && dia <=28) {
						dia += 1;
						if (dia == 29) {
							dia = 1;
							mes += 1;
							if (mes == 13) {
								mes = 1;
								ano +=1;
							}
						}
					}else {
						System.out.println("Has introducido un dia incorrecto");
					}
				}
			}else{
				System.out.println("Has introducido un mes invalido");
			}
		
		}
	}
}
