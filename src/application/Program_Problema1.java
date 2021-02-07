package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entities.Produtos_Problema1;
import services.ServicesProdutos_Problema1;

public class Program_Problema1 {
	public static void main(String[] args) {
		
		String caminho = ".\\.\\PastaBase";
		String arquivo = ".\\.\\PastaBase\\ListaProdutos.txt";
		
		try ( BufferedReader br = new BufferedReader(new FileReader(arquivo))){
			ArrayList<Produtos_Problema1> lista = new ArrayList<>();
				
			String[] item;
			String line = br.readLine();
			
			while(line!=null) {
				item = line.split(",");
				System.out.println("Nome: " + item[0] + " - R$: " + item[1] );
				lista.add(new Produtos_Problema1(item[0], Double.parseDouble(item[1])));
				line = br.readLine();
			}
			System.out.println();
			System.out.println("Maior Preço: ");
			System.out.println(ServicesProdutos_Problema1.maiorPreco(lista));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
