package a_2022_bucles_paquetes;
import java.util.*;

public class a_2022_bucles_paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double madrid = 100, barcelona = 65, peso, precio, pmm = 0, pmmi = 0, pesomax = 0;
		char destino;
		while (madrid != 0 || barcelona != 0) { //El proceso se repite hasta que no quede sitio en ningún contenedor
			System.out.println("Introduce el destino: ");
			destino = sc.nextLine().charAt(0);
			destino = Character.toLowerCase(destino);
			if (destino == 's') {
				break;
			}
			
			//FALTA EL ULTIMO APARTADOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!
			
			if (destino == 'm') {
				if (madrid == 0) {
					System.out.println("LLENO NO PUEDES INTRODUCIR ESTE DESTINO");
					break;
				}
			}else if (destino == 'b') {
				if (barcelona == 0) {
					System.out.println("LLENO NO PUEDES INTRODUCIR ESTE DESTINO");
					break;
				}
			}

			if (destino == 'm' || destino == 'b') { // SI NO ES NINGUNA DE LAS OPCIONES MOSTRAMOS ERROR Y EL BUCLE VUELVE A PREGUNTAR
				System.out.println("Introduce peso:");
				peso = sc.nextDouble();
				while (peso < 0 || peso > 60) { // PARA SOLICITAR INFINITAMENTE HASTA QUE EL PESO ESTÉ ENTRE 0 Y 60
                    System.out.println("Introduce peso:");
                    peso = sc.nextDouble();
                    
                    if (peso < 0 || peso > 60) {
                        System.out.println("Peso incorrecto");
                    }
                }
					if (destino == 'm') { //CALCULO DE QUE ENTRE DENTRO DEL DE MADRID
						madrid = madrid - peso;
						if (madrid<0) {
							madrid = madrid + peso; //SI NO ENTRA HAY QUE VOLVERLE A SUMAR
							System.out.println("El paquete no entra en este contenedor");
						}else {//CALCULO PRECIO TOTAL
							System.out.println("PAQUETE ENTRANDO ... ");
							System.out.println("A MADRID, QUEDA ESPACIO PARA "+madrid);
							if (peso > 0 && peso < 10) {
								precio = 0.5 * peso;
							}else {
								precio = 0.7 * peso;
							}
							pmm = precio + pmm; //sumar todos los precios
							pmmi = pmmi + 1; //contador para hacer la media
							System.out.println("PRECIO TOTAL: "+precio);
						}
					}else {//CALCULO DE QUE ENTRE DENTRO DEL DE BARCELONA
						barcelona = barcelona - peso;
						if (barcelona<0) {
							barcelona = barcelona + peso; //SI NO ENTRA HAY QUE VOLVERLE A SUMAR
							System.out.println("El paquete no entra en este contenedor");
						}else {//CALCULO PRECIO TOTAL
							System.out.println("PAQUETE ENTRANDO ... ");
							System.out.println("A BARCELONA, QUEDA ESPACIO PARA "+barcelona);
							if (pesomax < peso) {
								pesomax = peso;
							}
							if (peso > 0 && peso < 10) {
								precio = 0.5 * peso;
								precio = precio + (precio*0.2);
							}else {
								precio = 0.7 * peso;
								precio = precio + (precio*0.2);
							}
							System.out.println("PRECIO TOTAL CON 20% RECARGO POR SER BARCELONA: "+precio);
						}
					}
					
			}else {
				System.out.println("DESTINO INCORRECTO");
			}
			sc.nextLine();//IMPORTANTE LIMPIAR PARA LA SIGUIENTE VUELTA
			//¡¡¡¡¡FUNCIONA RAROOOO!!!!!
		}
		
		//totales
		pmmi = pmm/pmmi;
		System.out.println();
		System.out.println("PRECIO MEDIO MADRID: "+pmmi);
		System.out.println("PESO MAXIMO BARCELONA: "+pesomax);
		
		
	}

}
