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
//PUNTO TRES 
import java.util.Scanner;

public class ClasePrimaria {
	public static void main(String[] args) {
		boolean programa = true;
		while (programa == true) {
			
		Scanner scanner = new 	Scanner(System.in);
		
		System.out.print("Ingresa un número entero: ");
		//verifica que sea un numero
        if(scanner.hasNextInt()) {
        	int numeroEntero = scanner.nextInt();
        	if (numeroEntero >100) {
        		programa = false;
        		break;
        	}
        	System.out.println("Número entero ingresado: " + numeroEntero);
        }
        //Aviso si no se ingreso un numero o tipo de dato valido
        else {
        	System.out.println("Tipo de dato INCORRECTO");
        	scanner.close();
        }
        
		}
	
		System.out.println("CERRANDO PROGRAMA");
		return;
	 }
	}
//PUNTO CUATRO
