package com.zenvia.testetecnico.fizzbuzz;

/**
 * Classe FizzBuzz para números múltiplos de 3 e 5 ou que tenham 3 ou 5
 * 
 * @author vagner
 *
 */
public class FizzBuzzMultiploOuTemNumero extends FizzBuzzImpl {

	public String getFizz(int numero) {
		return numero % 3 == 0 || String.valueOf(numero).contains("3") ? "Fizz" : "";
	}

	public String getBuzz(int numero) {
		return numero % 5 == 0 || String.valueOf(numero).contains("5") ? "Buzz" : "";
	}

}
