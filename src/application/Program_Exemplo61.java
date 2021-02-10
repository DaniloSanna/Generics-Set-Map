package application;

import java.util.HashMap;
import java.util.Map;

import entities.Produto_Problema61;

public class Program_Exemplo61 {

	public static void main(String[] args) {
		
		Map<Produto_Problema61, Double> stock = new HashMap<>();
		
		Produto_Problema61 p1 = new Produto_Problema61("Tv", 900.00);
		Produto_Problema61 p2 = new Produto_Problema61("Notebook", 1200.00);
		Produto_Problema61 p3 = new Produto_Problema61("Tablet", 400.00);
		
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Produto_Problema61 p4 = new Produto_Problema61("Tv", 900.00);

		/*
		 * Sem Equals e HashCode a ref seria os ponteiros entre p4 e os obj de Stock
		 * Uma vez criada os métodos o Contains.Key compara o conteúdo dos objs
		 */
		
		System.out.println("Contains 'p4' Key: " + stock.containsKey(p4));
	
		
	}

}
