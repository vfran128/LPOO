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
import java.util.Scanner;

public class ClasePrimaria {
	public static void main(String[] args) {
		boolean programa = true;
		Scanner scanner = new 	Scanner(System.in);
		while (programa == true) {
			
			System.out.println("¿Que quiere hacer? \n1)Sumar \n2)Restar \n3)Multiplicar \n4)Dividir \n5)Salir");
			
			if(scanner.hasNextInt()) {
	        	int numeroEntero = scanner.nextInt();
	        	switch (numeroEntero) {
	        	//cada variaable tendra la inicial de su operacion al final
	        	default:
	        		System.out.println("Seleccion Invalida");
	        		break;
	        	case 1: 
	        		System.out.println("Elija dos numeros para sumar");
	        		int numeroXs = scanner.nextInt();
	        		int numeroYs= scanner.nextInt();
	        		int resultados = numeroXs + numeroYs;
	        		System.out.println(numeroXs + "+" + numeroYs + "=" + resultados );
	        		break;
	        	case 2: 
	        		//el programa cammbiara el orden de algunos numeros para parcerse mas a una calculadora no cientifica
	        		System.out.println("Elija dos numeros para restar, el programa es incapas de dar negativo");
	        		int numeroXn = scanner.nextInt();
	        		int numeroYn = scanner.nextInt();
	        		int resultadon = 0;
	        		if (numeroXn < numeroYn) {
	        			resultadon = numeroYn - numeroXn;
	        			System.out.println(numeroYn + "-" + numeroXn + "=" + resultadon );
	        		}
	        		else {
	        			resultadon = numeroXn - numeroYn;
	        			System.out.println(numeroXn + "-" + numeroYn + "=" + resultadon );
	        		}
	        		
	        		break;
	        	case 3: 
	        		System.out.println("Elija dos numeros para multiplicar");
	        		int numeroXm = scanner.nextInt();
	        		int numeroYm = scanner.nextInt();
	        		int resultadom = numeroXm * numeroYm;
	        		System.out.println(numeroXm + "*" + numeroYm + "=" + resultadom );
	        		break;
	        	case 4: 
	        		System.out.println("Elija dos numeros para dividir, el programa es incapas de dar con conma");
	        		int numeroXd = scanner.nextInt();
	        		int numeroYd = scanner.nextInt();
	        		int resultadod = 0;
	        		if (numeroXd < numeroYd && numeroYd % numeroXd == 0) {
	        			resultadod = numeroYd / numeroXd;
	        			System.out.println(numeroYd + "/" + numeroXd + "=" + resultadod );
	        		}
	        		else if (numeroXd > numeroYd && numeroXd % numeroYd == 0) {
	        			resultadod = numeroXd / numeroYd;
	        			System.out.println(numeroXd + "/" + numeroYd + "=" + resultadod );
	        		}
	        		else {
	        			System.out.println("Division Invalida");
	        		}
	        		break;
	        	case 5: 
	        		return;
	        	 
	        	}
			}
		}
		scanner.close();
	}
}
	        
	
//PUNTO CINCO
public class ClasePrimaria {
	public static void main(String[] args) {
	// se quiere encontrar el numero mayor de un array de enteros
		int[] array = {1,2,4,6,9,10,99};
		int mayor = 0;
		for (int numero : array) {		
			if (numero > mayor) {
				mayor = numero;
			}
			
		}
		System.out.println(mayor);
	}
}
	
