/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemclases1;

//Siempre empiezan EN MAYUS LOS CONSTRUCTORES
public class Persona {
    //atributos
	private String nif;
    private int edad,numHijos;
    private char sexo;
    private boolean casado;
    
    //METODOS CONSTRUCTORES
    public Persona(char s){
        nif="";
        edad=0;
        numHijos=0;
        casado=false;
        sexo=s;
    }
    public Persona(char s, String n, int e, int nh, boolean c){
      nif=n;
      edad=e;
      numHijos=nh;
      sexo=s;
      casado=c;
    }
    public Persona(String n, char s) {
    	nif = n;
    	sexo = s;
    	/*si le pasas un String que se llama nif
    	y pones nif = nif; no vas a rellenar nada obviamente
    	por eso tienes q poner this.nif (de esta caja) = nif (el q le paso)*/
    }
    
    public void cumplirAnyos(){
        edad++;
    }
    
    public boolean casarse(){
        if (casado)
            return false;
        else{
            casado=true;
            return true;
        }
    }
            
    public void tenerHijos(int nh){
        numHijos=numHijos+nh;
    }

    @Override
    public String toString() {
        return "Persona{" + "nif=" + nif + ", edad=" + edad + ", numHijos=" + numHijos + ", sexo=" + sexo + ", casado=" + casado + '}';
    }

    public String getNif() {
        return nif;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }
    
    
}
