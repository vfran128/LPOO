//PUNTO UNO
public class ClasePrimaria {
	public static void main(String[] args) {
		//itera hasta 100
		for (int i = 0; i <= 10; i++) {
			//calcula su resto al dividirse por 2
		    int resto = i % 2;
		    //si el resto es 0, es par, por ende lo imprime
	        if  (resto  == 0) {
	        System.out.println("El numero " + i + " es par");
		}
	        
	}
	     
 }
}
//PUNTO DOS
public class ClasePrimaria {
	public static void main(String[] args) {
		   for(int j = 50; j <= 100; j++) {
		    	 	boolean esPrimo = true;
		    	 	int numero = j;
		            for (int i = 2; i <= Math.sqrt(numero); i++) {
		            	if (numero % i == 0 ) {
		            		esPrimo = false;
		            		}	
		            	}
		            if (esPrimo == true) {
		            	System.out.println("primo " +numero );
		            }
		            }
		     }
	}
