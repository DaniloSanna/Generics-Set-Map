package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program_Problema5 {

	public static void main(String[] args) {
		
		Set<String> setHash = new HashSet<>();//Não mantem a ordem dos dados
		Set<String> setTree = new TreeSet<>();//Mantem a ordem dos dados, como string a ordem é alfabética.
		Set<String> setLink = new LinkedHashSet<>();//Mantem a ordem (ADD) dos dados.
		
		setHash.add("TV");
		setHash.add("Celular");
		setHash.add("Notebook");
		
		setTree.add("TV");
		setTree.add("Notebook");
		setTree.add("Celular");
		
		setLink.add("TV");
		setLink.add("Celular");
		setLink.add("Notebook");
		
		System.out.println("setHash tem a palavra Notebook: " + setHash.contains("Notebook"));
		System.out.println("setTree tem a palavra TV: " + setTree.contains("TV"));
		System.out.println("setLink tem a palavra Celular: " + setLink.contains("Celular"));

		
		System.out.println();
		System.out.println("Imprimindo setHash:");
		for (String p : setHash) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Imprimindo setTree:");
		for (String p : setTree) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Imprimindo setLink:");
		for (String p : setLink) {
			System.out.println(p);
		}
		
		setHash.remove("Tablet");
		setTree.remove("Tablet");
		setLink.remove("Tablet");
		
		System.out.println();
		System.out.println("Imprimindo setHash(Removido Tablet):");
		for (String p : setHash) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Imprimindo setTree(Removido Tablet):");
		for (String p : setTree) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Imprimindo setLink(Removido Tablet):");
		for (String p : setLink) {
			System.out.println(p);
		}
		
		setHash.removeIf(x -> x.length()>=3);//Remove elemento x que tem tamanho (caracteres) maior que 3
		setTree.removeIf(x -> x.charAt(0)=='T');//Remove elemento que inicie com a letra T
		setLink.removeIf(x -> x.charAt(0)!='C');
		
		
		System.out.println();
		System.out.println("Imprimindo setHash(RemovidoIf):");
		for (String p : setHash) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Imprimindo setTree(RemovidoIf):");
		for (String p : setTree) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Imprimindo setLink(RemovidoIf):");
		for (String p : setLink) {
			System.out.println(p);
		}
	}

}
