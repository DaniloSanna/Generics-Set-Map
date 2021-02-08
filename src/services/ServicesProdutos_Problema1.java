package services;

import java.util.ArrayList;

public class ServicesProdutos_Problema1 {
	
	/*
	 * static <t extends Comparable<? super T>> T maiorPreco(...)
	 * Dessa forma é: um tipo comparavel T ou qualquer super classe de T.
	 * 
	 * public static <T extends Comparable<T> > T maiorPreco( ArrayList<T> lista) {
	 * 
	 */
	public static <T extends Comparable<T> > T maiorPreco( ArrayList<T> lista) {
		T max = lista.get(0);

		if(lista.isEmpty()) {
			System.out.println("Erro, lista vazia");
		}
		
		for(T x : lista) {
			if (x.compareTo(max) > 0) {
				max = x;
			}
		}
		
		return max;
	}
	
	
}
