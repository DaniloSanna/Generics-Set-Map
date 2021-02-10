package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program_Problema51 {
	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10,11));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1,5,6,7,8,9,10));
		
		System.out.println("Conjunto 1: " + a);
		System.out.println("Conjunto 2: " + b);
		
		
		//Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("União " + c + " - Une-se tudo.");
		
		//Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Intersecção " + d + " - Mantém os repetidos/Comum");
		
		//Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Diferença " + e + " - Mantém os únicos");
		
		
	}
}
