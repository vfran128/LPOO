//PUNTO UNO
import java.util.Scanner;

public class ClasePrimaria {
	public static void main(String[] args) {
	System.out.println("Ingrese su nombre");
	Scanner scanner = new Scanner(System.in);
	String nombre = scanner.next();
	System.out.println("Nombre = "+ nombre);
	scanner.close();
	return;
	}
}
//PUNTO DOS
import java.util.Scanner;

public class ClasePrimaria {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Ingrese su palabra");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.next().toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				count ++;
				}
			}
		
	System.out.println("Hay "+count+" vocales");
	scanner.close();
	return;
	}
 }
	
	
