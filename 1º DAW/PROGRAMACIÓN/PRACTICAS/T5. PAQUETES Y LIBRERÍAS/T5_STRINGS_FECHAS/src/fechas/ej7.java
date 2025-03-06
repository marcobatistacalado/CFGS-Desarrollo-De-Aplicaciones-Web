package fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numEmpleados = 0;
		Empleado empleados[] = new Empleado[2];
		
		crearEmpleado(sc, numEmpleados, empleados);
		calcularSalarioArray(empleados);
		
		burbuja(empleados, empleados.length);
		for (int i = 0; i<empleados.length; i++) {
			System.out.println(empleados[i].toString());
		}
		
	}
	private static void crearEmpleado(Scanner sc, int numEmpleados, Empleado[] empleados) {
		String nombre;
		LocalDate fnac = null, fincor = null;
		//int dia,mes,ano;

		while (numEmpleados != empleados.length) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			/*
			System.out.println("Dia Nacimiento:");
			dia = sc.nextInt();
			System.out.println("Mes Nacimiento");
			mes = sc.nextInt();
			System.out.println("Año Nacimiento");
			ano = sc.nextInt();
			fnac = LocalDate.of(ano,mes,dia);
			sc.nextLine();
			System.out.println("Dia Incorporación:");
			dia = sc.nextInt();
			System.out.println("Mes Incorporación");
			mes = sc.nextInt();
			System.out.println("Año Incorporación");
			ano = sc.nextInt();
			fincor = LocalDate.of(ano,mes,dia);
			*/
			
			fnac = fechaCorrecta(sc, "Fecha Nacimiento:");
			fincor = fechaCorrecta(sc, "Fecha Incorporación:");

			empleados[numEmpleados] = new Empleado(nombre, fnac, fincor);
			numEmpleados++;
			sc.nextLine();
			
		}
	}
	//IMPORTANTE LO OPTIMIZADO QUE ESTÁ JEJE.
	private static LocalDate fechaCorrecta(Scanner sc, String queFecha) {
		LocalDate fecha1 = null;
		String fecha;
		Boolean fechaCorrecta = false;
		do {
			System.out.println(queFecha+" yyyy-mm-dd");
			fecha = sc.nextLine();
			try {
				fecha1 = LocalDate.parse(fecha);
				fechaCorrecta = true;
			} catch (DateTimeParseException e) {
				System.out.println("Fecha erronea");
			}
		} while (!fechaCorrecta); // while(fechaCorrecta==false)
		return fecha1;
	}

	private static void calcularSalarioArray(Empleado[] empleados) {
		double salario;
		for (int i = 0; i<empleados.length; i++) {
			System.out.println("Empleado: "+i);
			salario = empleados[i].calcSalario();
			System.out.println("Salario: "+salario);
		}
	}
	
	public static void burbuja(Empleado v[], int TAM){
		int j,k;
		Empleado aux;
		for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
			
			for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al final del array.
	
				if (v[k].calcAnosIncor()<v[k+1].calcAnosIncor()) // Si un elemento es mayor que el siguiente, los intercambio
			
				{
				aux=v[k];
				v[k]=v[k+1];
				v[k+1]=aux;
				}
	}

}
