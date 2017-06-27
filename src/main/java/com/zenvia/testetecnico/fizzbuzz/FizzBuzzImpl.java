package com.zenvia.testetecnico.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata de implementação da interface {@link FizzBuzz}
 * 
 * @author vagner
 *
 */
public abstract class FizzBuzzImpl implements FizzBuzz {

	public List<Object> imprimeNumeros(List<Integer> numeros) {
		if (numeros != null && !numeros.isEmpty()) {
			List<Object> saida = new ArrayList<Object>();
			
			for (int numero : numeros) {
				String result = getFizz(numero) + getBuzz(numero);
				
				if (result.equals("")) {
					saida.add(numero);
				} else {
					saida.add(result);
				}
			}
			
			return saida;
		}
		
		throw new IllegalArgumentException("Lista de números não deve ser vazia");
	}

}
