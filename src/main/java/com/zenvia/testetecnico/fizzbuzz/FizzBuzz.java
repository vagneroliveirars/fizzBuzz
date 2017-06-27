package com.zenvia.testetecnico.fizzbuzz;

import java.util.List;

/**
 * Interface que recebe uma lista de números inteiros e devolve uma lista de
 * objetos. Escreve o número ou "Fizz" para os múltiplos de 3 ou "Buzz" para os
 * múltiplos de 5 ou "FizzBuzz" para os múltiplos de 3 e 5.
 * 
 * @author vagner
 *
 */
public interface FizzBuzz {
	
	public String getFizz(int numero);
	
	public String getBuzz(int numero);

	public List<Object> imprimeNumeros(List<Integer> numeros);
	
}
