package com.zenvia.testetecnico.fizzbuzz;

/**
 * Classe FizzBuzz somente para números múltiplos de 3 e 5
 * 
 * @author vagner
 *
 */
public class FizzBuzzSomenteMultiplo extends FizzBuzzImpl {
	
	public String getFizz(int numero) {
		return numero % 3 == 0 ? "Fizz" : "";
	}
	
	public String getBuzz(int numero) {
		return numero % 5 == 0 ? "Buzz" : "";
	}

}
