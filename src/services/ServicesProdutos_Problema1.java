package services;

import java.util.ArrayList;

public class ServicesProdutos_Problema1 {
	
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
