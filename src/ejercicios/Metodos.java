package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
	
		stringConcat("Hola", "Adios");
		
		integerToChar(10);

	}

	static String stringConcat (String cadena1, String cadena2) {
		
		return cadena1 + " " + cadena2;
	}
	
	static char integerToChar (int numero) {
		
		return (char)numero;
	}

}
