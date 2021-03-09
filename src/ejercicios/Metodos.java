package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
	
		stringConcat("Hola", "Adios");
		
		integerToChar(10);
		
		System.out.println(charToDecimal('F'));

	}

	static String stringConcat (String cadena1, String cadena2) {
		
		return cadena1 + " " + cadena2;
	}
	
	static char integerToChar (int numero) {
		
		return (char)numero;
	}
	
	static double charToDecimal (char caracter) {
		
		return (int)caracter;
	}

}
