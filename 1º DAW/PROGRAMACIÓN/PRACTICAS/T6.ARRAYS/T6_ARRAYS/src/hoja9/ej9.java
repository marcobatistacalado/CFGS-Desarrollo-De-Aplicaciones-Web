package hoja9;
import java.util.*;
public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String nombre, apellidos, num, dni;
		int menu;
		Alumno alumnos[] = new Alumno[25];
		int numAlumnos = 0, buscar;
	while(true) {
		System.out.println("1-Matricular; 2-Poner notas; 3-ORden nota media; 4-Orden alfabetico; 5-Mostrar notas; 6-Anular matricula");
		menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			if (alumnos.length == numAlumnos) {
				System.out.println("Ya no se pueden dar mas alta alumnos");
			}else {
				System.out.println("Nombre:");
				nombre = sc.nextLine();
				System.out.println("Apellidos:");
				apellidos = sc.nextLine();
				do {
					System.out.println("Numero:");
					num = sc.nextLine();
				}while (validarNumero(num)==-1);
				do {
					System.out.println("DNi:");
					dni = sc.nextLine();
				}while(validarDNI(dni)==false);
				
				alumnos[numAlumnos] = new Alumno(nombre,apellidos,dni,num);
				numAlumnos++;
			}
			break;
		case 2:
			int nota, asignatura;
			do {
				System.out.println("Numero de asignatura (1-3):");
				asignatura = sc.nextInt();
			}while(asignatura!=1 && asignatura !=2 && asignatura != 3);
			for (int i=0; i<numAlumnos;i++) {
				System.out.println(alumnos[i].toString());
				System.out.println("Nota que quieres ponerle:");
				nota = sc.nextInt();
				alumnos[i].actualizarNota(asignatura, nota);
			}
			break;
		case 3:
			burbuja1(alumnos, numAlumnos);
			mostrarAlumnos(alumnos, numAlumnos);
			break;
		case 4:
			burbuja2(alumnos, numAlumnos);
			mostrarAlumnos(alumnos, numAlumnos);
			break;
		case 5:
			do {
				System.out.println("DNI:");
				dni = sc.nextLine();
				buscar = buscarDNI(alumnos, dni, numAlumnos);
				if (buscar == -1) {
					System.out.println("No se encontro el alumno");
				}
			}while(buscar == -1);
			System.out.println("Nota 1:"+alumnos[buscar].getN1());
			System.out.println("Nota 2:"+alumnos[buscar].getN2());
			System.out.println("Nota 3:"+alumnos[buscar].getN3());
		case 6:
			do {
				System.out.println("DNI:");
				dni = sc.nextLine();
				buscar = buscarDNI(alumnos, dni, numAlumnos);
				if (buscar == -1) {
					System.out.println("No se encontro el alumno");
				}
			}while(buscar == -1);
			//BORRADO
			for (int j=buscar; j<numAlumnos-1; j++) {
				alumnos[j] = alumnos[j+1];
			}
			alumnos[numAlumnos-1] = null; //si es de objetos pues null.
			numAlumnos--;
			System.out.println("Matricula anulada");
			break;
		}
	}
			
	
	}
	//MOSTRAR ALUMNOS
	private static void mostrarAlumnos(Alumno[] alumnos, int numAlumnos) {
		for (int i = 0; i<numAlumnos; i++) {
			System.out.println(alumnos[i].toString());
		}
	}
	
	public static int validarNumero (String num) {
		if (num.charAt(0) != '6') {
			return -1;
		}
		if (num.length()!=9) {
			return -1;
		}
		for (int i = 0; i<num.length(); i++) {
			if (num.charAt(i)<'0' || num.charAt(i)>'9') {
				return -1;
			}
		}
		return 0;
	}
	
	public static boolean validarDNI(String DNI) {
		//LONGITUD
		if (DNI.length()<2 || DNI.length()>9) {
			return false;
		}
		//OBTENER EL ULTIMO CARACTER
		// tambien--> DNI.charAT(8);
		char letra = DNI.charAt(DNI.length() - 1);
		letra = Character.toUpperCase(letra);
		if (letra < 'A' || letra > 'Z') {
			return false;
		}

		//COMPROBAR QUE SON NUMEROS
		for (int i = 0; i<DNI.length()-2; i++) {
			int num = Integer.parseInt(DNI.substring(i,i+1));
			if (num<0 || num>9)
				return false;
			if (DNI.charAt(i)<'0'||DNI.charAt(i)>'9') {
				return false;
			}
		}
		//Integer.parseInt --> pasar String a Int.
				//substring
		int entero = Integer.parseInt(DNI.substring(0,DNI.length()-1));
		char letraCalculada = calcularLetraDNI(entero);		
		if(letraCalculada != letra) {
			return false;
		}
		return true;
		
	}
	public static char calcularLetraDNI(int dni) {
        final String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;

        return caracteres.charAt(resto);
    }
	
	//ORDENADO POR NOTA MEDIA
	public static void burbuja1(Alumno v[], int TAM){
		int j,k;
		Alumno aux;
		for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
			
			for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al final del array.
	
				if (v[k].getNmedia()<v[k+1].getNmedia()) // Si un elemento es mayor que el siguiente, los intercambio
			
				{
				aux=v[k];
				v[k]=v[k+1];
				v[k+1]=aux;
				}
	}
	
	//ORDENADO ALFABETICAMENTE
	public static void burbuja2(Alumno v[], int TAM){
		int j,k;
		Alumno aux;
		for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
			
			for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al final del array.
				//NO ENTIENDO COMO HACER ESTO
				if (v[k].getNombre().compareTo(v[k+1].getNombre()) > 0) // Si un elemento es mayor que el siguiente, los intercambio
			
				{
				aux=v[k];
				v[k]=v[k+1];
				v[k+1]=aux;
				}
	}
	
	//BUSCAR DNI
	public static int buscarDNI(Alumno alumnos[], String DNI, int numAlumnos) {
		for (int i=0; i<numAlumnos; i++) {
			if (alumnos[i].getDNI().equalsIgnoreCase(DNI)) {
				return i;
			}
		}
		return -1;
	}

}