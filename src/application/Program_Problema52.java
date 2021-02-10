package application;

import java.util.HashSet;
import java.util.Set;

import entities.Produto_Problema52;

public class Program_Problema52 {
	public static void main(String[] args) {
		Set<Produto_Problema52> set = new HashSet<>();
		
		set.add(new Produto_Problema52("TV",900.00));
		set.add(new Produto_Problema52("Notebook",1200.00));
		set.add(new Produto_Problema52("Tablet",400.00));
		
		Produto_Problema52 prod = new Produto_Problema52("Notebook",1200.00);
		
		/*
		 * Sem HashCode e Equals o sistema compara com base no 
		*endereço da memória(ref Ponteiro na memória).
		*Com HashCode e Equals o sistema compara por conteúdo.
		*
		*/
		System.out.println(set.contains(prod));
		
	}
}
