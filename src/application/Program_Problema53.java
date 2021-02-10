package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Produto_Problema53;

public class Program_Problema53 {
	public static void main(String[] args) {
		
		Set<Produto_Problema53> set = new TreeSet<>();
		
		set.add(new Produto_Problema53("TV",900.00));
		set.add(new Produto_Problema53("Notebook",1200.00));
		set.add(new Produto_Problema53("Tablet",400.00));
		
		
		/*
		 * Sem a IMPLEMENTAÇÃO de Comparable dará o erro:
		 * class entities.Produto_Problema52 cannot be cast to class java.lang.Comparable 
		 * (entities.Produto_Problema52 is in unnamed module of loader 'app'
		 * ; java.lang.Comparable is in module java.base of loader 'bootstrap')
		 */
		
		
		for (Produto_Problema53 p : set) {
			System.out.println(p);
		}
	}
}
