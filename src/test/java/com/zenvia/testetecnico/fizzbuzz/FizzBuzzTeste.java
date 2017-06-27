package com.zenvia.testetecnico.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de testes unitários para {@link FizzBuzz}
 * 
 * @author vagner
 *
 */
public class FizzBuzzTeste {
	
	private List<Integer> multiplosDeTres;
	
	private List<Integer> multiplosDeCinco;
	
	private List<Integer> multiplosDeTresECinco;
	
	private List<Integer> numerosDeZeroACem;
	
	private List<Object> saidaSomenteMultiplo;
	
	private List<Object> saidaMultiploOuTemNumero;

	/**
	 * Inicializa os dados de testes
	 * 
	 */
	@Before
	public void inicializa() {
		this.multiplosDeTres = new ArrayList<Integer>();
		
		this.multiplosDeCinco = new ArrayList<Integer>();
		
		this.multiplosDeTresECinco = new ArrayList<Integer>();
		
		this.numerosDeZeroACem = new ArrayList<Integer>();
		
		this.saidaSomenteMultiplo = new ArrayList<Object>();
		
		for (int i = 1; i <= 100; i++) {
			boolean multiploDeTres = false;
			boolean multiploDeCinco = false;
			
			this.numerosDeZeroACem.add(i);
			
			if (i % 3 == 0) {
				this.multiplosDeTres.add(i);
				multiploDeTres = true;
			} 
			
			if (i % 5 == 0) {
				this.multiplosDeCinco.add(i);
				multiploDeCinco = true;
			}
			
			if (multiploDeTres && multiploDeCinco) {
				this.multiplosDeTresECinco.add(i);
				this.saidaSomenteMultiplo.add("FizzBuzz");
			} else if (multiploDeTres) {
				this.saidaSomenteMultiplo.add("Fizz");
			} else if (multiploDeCinco) {
				this.saidaSomenteMultiplo.add("Buzz");
			} else {
				this.saidaSomenteMultiplo.add(i);
			}
		}
		
		
		/* 
		 * Stage 2 - new requirements
		 * A number is fizz if it is divisible by 3 or if it has a 3 in it
		 * A number is buzz if it is divisible by 5 or if it has a 5 in it
		 */
		this.saidaMultiploOuTemNumero = new ArrayList<Object>();
		
		for (int i = 1; i <= 100; i++) {
			boolean multiploDeTres = false;
			boolean multiploDeCinco = false;
			
			if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				multiploDeTres = true;
			}
			
			if (i % 5 == 0 || String.valueOf(i).contains("5")) {
				multiploDeCinco = true;
			}
			
			if (multiploDeTres && multiploDeCinco) {
				this.saidaMultiploOuTemNumero.add("FizzBuzz");
			} else if (multiploDeTres) {
				this.saidaMultiploOuTemNumero.add("Fizz");
			} else if (multiploDeCinco) {
				this.saidaMultiploOuTemNumero.add("Buzz");
			} else {
				this.saidaMultiploOuTemNumero.add(i);
			}	
		}
	}
	
	@Test
	public void testeImprimeFizzParaMultiplosDeTres() {
		FizzBuzz fizzBuzz = new FizzBuzzSomenteMultiplo();
		
		for (Integer numero : this.multiplosDeTres) {			
			assertEquals("Fizz", fizzBuzz.getFizz(numero));
		}
	}
	
	@Test
	public void testeImprimeBuzzParaMultiplosDeCinco() {
		FizzBuzz fizzBuzz = new FizzBuzzSomenteMultiplo();
		
		for (Integer numero : this.multiplosDeCinco) {			
			assertEquals("Buzz", fizzBuzz.getBuzz(numero));
		}
	}
	
	@Test
	public void testeImprimeFizzBuzzParaMultiplosDeTresECinco() {
		FizzBuzz fizzBuzz = new FizzBuzzSomenteMultiplo();
		
		for (Integer numero : this.multiplosDeTresECinco) {			
			assertEquals("FizzBuzz", fizzBuzz.getFizz(numero) + fizzBuzz.getBuzz(numero));
		}
	}
	
	@Test
	public void testeImprimeNumerosSomenteMultiplos() {
		FizzBuzz fizzBuzz = new FizzBuzzSomenteMultiplo();
		assertEquals(this.saidaSomenteMultiplo, fizzBuzz.imprimeNumeros(this.numerosDeZeroACem));
	}
	
	@Test
	public void testeImprimeNumerosMultiplosOuTemNumero() {
		FizzBuzz fizzBuzz = new FizzBuzzMultiploOuTemNumero();
		assertEquals(this.saidaMultiploOuTemNumero, fizzBuzz.imprimeNumeros(this.numerosDeZeroACem));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeListaDeNumerosNulaOuVazia() {
		FizzBuzzSomenteMultiplo fizzBuzz = new FizzBuzzSomenteMultiplo();
		fizzBuzz.imprimeNumeros(new ArrayList<Integer>());
		fizzBuzz.imprimeNumeros(null);
	}

}
