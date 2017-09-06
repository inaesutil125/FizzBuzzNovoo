package dojo;
import static dojo.FizzBuzzCalcula.converte;

import static org.junit.Assert.assertEquals;




import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void retornaFizzParaMultiploDeTres() {
		
		assertEquals("Multiplo de 3 deve-se retornar 'Fizz'", "Fizz", converte(3));
		
	}
	
	@Test
	public void retornaBuzzParaMultiploDeCinco() {
		
		assertEquals("Multiplo de 5 deve-se retornar 'Buzz'", "Buzz", converte(5));
		
	}
	
	@Test
	public void retornaProprioNumeroParaCasoDeNaoMultiploDeTresOuCinco() {
		
		assertEquals("Número não múltiplo de 3 e 5, retorna-se o próprio número", "2", converte(2));
		
	}
	@Test
	public void retornaFizzBuzzParaNumeroMultiploDeTresECinco() {
		
		assertEquals("Número múltiplo de 3 e 5, retorna-se FizzBuzz", "FizzBuzz", converte(15));
		
	}
	
}


