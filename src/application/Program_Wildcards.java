package application;

import java.util.Arrays;
import java.util.List;

public class Program_Wildcards {

	public static void main (String[] args) {
		List<Integer> myInts = Arrays.asList(5,2,10);
		List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
		printList(myInts);
		printList(myStr);
	}
	
	public static void printList(List<?> list) {
		/*
		 * Listas Curingas n�o aceitam .add, pois h� erro de compila��o.
		 * Uma vez que o item adicionado pode n�o ser do tipo correto quando a list<?> for chamada;
		 * list.add() -> Erro
		 */

		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
