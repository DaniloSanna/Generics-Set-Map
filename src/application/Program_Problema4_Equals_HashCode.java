package application;

import entities.Cliente_Problema4;

public class Program_Problema4_Equals_HashCode {
	public static void main(String[] args) {

		Cliente_Problema4 c1 = new Cliente_Problema4("Maria","maria@gmail.com");
		Cliente_Problema4 c2 = new Cliente_Problema4("Alex","alex@gmail.com");
		Cliente_Problema4 c3 = new Cliente_Problema4("Maria","alex@gmail.com");
		Cliente_Problema4 c4 = new Cliente_Problema4("Maria","maria@gmail.com");
		
		String s1 = "Test", s2="Test";
		String s3 = new String("Test"), s4 = new String("Test");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println();
		System.out.println(c1 == c4); //Procura a localização na memória
		System.out.println(s1 == s2); //Faz a verificação "Literal"
		System.out.println(s3 == s4); //Procura a localização na memória
		System.out.println(s1 == s4); //???

	}
}
