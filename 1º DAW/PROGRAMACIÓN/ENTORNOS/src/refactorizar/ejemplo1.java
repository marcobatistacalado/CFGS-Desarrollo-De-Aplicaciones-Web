package refactorizar;

public class ejemplo1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=3,y=5;
		double suma=x+y+3.14;
		
		
		System.out.println("Resultado:"+suma);
		double resta=x-y-3.14;
		System.out.println("Resultado:"+resta);
		double producto=x*y*3.14;
		System.out.println("Resultado:"+producto);
		int num=6;
		boolean result = isPrime(num);
	        if (result) {
	            System.out.println("Number is Prime");
	        } else {
	            System.out.println("Number is Not Prime");
	        }
	   x=x+3;
		
		
	}
	
	public static Boolean isPrime(int num) {
       for (int i=2;i<num;i++) {
    	   if (num%i==0)
    		   return false;
       }
       return true;
    }


}