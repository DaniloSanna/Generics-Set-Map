package services;

import java.util.ArrayList;

import entities.Produtos_Problema1;

public class ServicesProdutos_Problema1 {
	
	public static String maiorPreco( ArrayList<Produtos_Problema1> lista) {
		
		double max = 0;
		String retorno = "";
		if(lista.isEmpty()) {
			System.out.println("Erro, lista vazia");
		}
		
		for(Produtos_Problema1 x : lista) {
			if (max < x.getPreco()) {
				max = x.getPreco();
				retorno = x.toString();
			}
		}
		
		return retorno;
	}
	
	
}
