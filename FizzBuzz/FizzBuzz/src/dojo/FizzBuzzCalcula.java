package dojo;


public class FizzBuzzCalcula {

	public static String converte(int numero) {
		if ((numero % 3 == 0) && (numero % 5 == 0)) return "FizzBuzz"; 
		if ((numero % 3) == 0) return "Fizz";
		if ((numero % 5) == 0) return "Buzz";
		return Integer.toString(numero);

	}
}
