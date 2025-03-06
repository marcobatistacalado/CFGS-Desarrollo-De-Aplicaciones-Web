import java.util.*;
//MARCO BATISTA CALADO1
public class BatistaMarco1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int preciou, seccion, uds, continuar = 1, lacteos = 0, persona = 1, enviost = 0, jubi = 0;
		double presupuesto, preciotproductos, preciototal = 0, compra1 = 0, compra2 = 0;
		String cod;
		
		while(true) {
			//reinciar variables dependientes de cada persona
			lacteos = 0;
			continuar = 1;
			preciototal = 0;
			
			System.out.println("PERSONA: "+persona );//numero de persona
			//PRESUPUESTO
			System.out.println("Presupuesto max:");
			presupuesto = sc.nextInt();
			//se acabaron las compras si ponen 0
			if (presupuesto == 0) {
				break;
			}
		
			while (continuar == 1) {
				//Reiniciar variables dependientes de cada comprita
				preciotproductos = 0;
				//LECTURA PRODUCTOS
				sc.nextLine();
				//VALIDAR COD
				do {
					System.out.println("Codigo producto:");
					cod = sc.nextLine().toUpperCase();
					if (cod.equals("P0-000")) {
						break;
					}
				}while(validarCod(cod)==false);
				//salir de esta compra
				if (cod.equals("P0-000")) {
					break;
				}
				//PASAR A NUMEROS LA SECCION Y EL PRECIO PARA SU POSTERIOR UTILIZACION
				seccion = Integer.parseInt(cod.substring(1, 2));
				preciou =Integer.parseInt(cod.substring(3, 6));
				
				//mostrar el precio por unidad
				System.out.println("El precio/ud es de "+preciou);
				
				
				//NUM DE UNIDADES DE ESE PRODUCTO --> positivo
				do {
					System.out.println("Unidades:");
					uds = sc.nextInt();
				}while(uds<0);
				
				//SI QUIERE ALGUNA UNIDAD DE ESE PRODUCTO
				if (uds != 0) { 
					//INSUFICIENTE DINERO
					if (calcularPrecio(seccion, preciou, uds)>presupuesto) {
						System.out.println("No tienes suficinete dinero");
						System.out.println("Presupuesto: "+presupuesto);
						//HASTA QUE TENGA SUFICINETE DINERO O NO QUIERA NINGUNA UNIDAD
						do {
							System.out.println("Anota uds (si = 0 anulas este producto)");
							uds = sc.nextInt();
							preciotproductos = calcularPrecio(seccion, preciou, uds);
						}while (uds<0 || preciotproductos > presupuesto);
					}else {
						preciotproductos = calcularPrecio(seccion, preciou, uds);
					}
					//aqui ya entan ambos tanto si habia dinero como si no
					if (uds != 0) {
						System.out.println("Precio añadido: "+preciotproductos);
						//llevar la cuenta de los lacteos de cada compra
						if (seccion == 4) {
							lacteos += uds;
						}
					}
				}
				presupuesto -= preciotproductos;
				System.out.println("Presupuesto que tienes: "+presupuesto);
				preciototal += preciotproductos;
				System.out.println("Quieres mas  productos si = 1");
				continuar = sc.nextInt();
			}
		
				//ENVIO A DOMICILIO
				System.out.println("¿quieres envio si = 1?");
				int envio = sc.nextInt();
				if (envio == 1) {
					System.out.println("Tipo de zona envio:");
					envio = sc.nextInt();
					if (envio != 1 && envio != 2 && envio != 3) {
						System.out.println("Zona no valida");
					}else {
						enviost++;//envios totales
						System.out.println("Eres jubilado si = 1 ?");
						int jub = sc.nextInt();
						if (jub == 1) {
							jubi++;//envios jubiletas
							System.out.println("No tienes costo por el envio");
						}else {
							if (envio == 1) {
								System.out.println("Se le suman 5€ más a su envio");
								preciototal += 5;
							}
							if (envio == 2) {
								System.out.println("Se le suman 7€ más a su envio");
								preciototal += 7;
							}
							if (envio == 3) {
								System.out.println("Se le suman 10€ más a su envio");
								preciototal += 10;
							}
						}
					}
					
				}
				//compras mas caras
				if (preciototal>compra1) {
					compra2 = compra1;
					compra1 = preciototal;
				}else if (preciototal>compra2) {
					compra2 = preciototal;
				}
				System.out.println("El precio total de la compra es:"+preciototal);
				System.out.println("Nº de lacteos: "+lacteos);
				
				persona++; //pasamos a la siguiente persona
				System.out.println();
		}
		
		//porcentaje jubiletas
		if (enviost > 0) {//VALIDACION DIVIDIDO 0
		System.out.println("El porcentaje de jubilados es: "+((100*jubi)/enviost)+"%");
		}else {
		System.out.println("El porcentaje de jubilados es: 0%");
		}
		//compras mas caras
		System.out.println("La compra mas cara es: "+compra1);
		System.out.println("La 2ª compra mas cara es: "+compra2);
	}
		
	
	public static boolean validarCod(String cod) {
		if (cod.length() != 6) {
			return false;
		}
		if (!cod.startsWith("P")) {
			return false;
		}
		if (cod.charAt(1) < '0' || cod.charAt(1) > '9' ) {
			return false;
		}
		if (cod.charAt(2)!= '-') {
			return false;
		}
		for (int i = 3; i<= cod.length()-1;i++) {
			char codigo = cod.charAt(i);
			if (codigo < '0' || codigo > '9' ) {
				return false;
			}
		}
		return true;
	}
	
	public static double calcularPrecio (int seccion, int preciou, int uds) {
		double preciot = preciou * uds;
		if (seccion == 3) {
			preciot -= preciot*0.2;
		}
		if (seccion == 4) {
			if (uds > 3) {
			preciot -= 2;
			}
		}
		return preciot;
	}
	

}
