package hoja8;

public class Alumno {
	
	String matricula; 
	private int n1,n2,n3, media;
	private static int aprobado=0;//ejercicio 6
	Alumno(String m,int nota1,int nota2,int nota3){
		matricula = m;
		n1 = nota1;
		n2 = nota2;
		n3 = nota3;
		media = (n1+n2+n3)/3;
	}
	public int getMedia() {
		if (media >= 5) {//ejercicio 6
			aprobado++;
		}
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Matricula: "+matricula+"; Nota1: "+n1+"; Nota2: "+n2+" N3: "+n3+"; Media: "+media);
	}
	public static int getAprobado() {
		return aprobado;
	}
	
	
	


}
