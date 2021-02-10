package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import entities.Users_Exemplo54;
import entities.Users_Exemplo541;

public class Program_Exemplo54 {
	
	public static void main(String[] args) {
		String arquivo = ".\\.\\PastaBase\\ListaLogsURL.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){
			
			Set<Users_Exemplo54> set1 = new HashSet<>();
			Set<Users_Exemplo541> set2 = new HashSet<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(" ");
				set1.add(new Users_Exemplo54(fields[0], fields[1]));
				set2.add(new Users_Exemplo541(fields[0], fields[1]));
				
				line = br.readLine(); //Solicita a leitura da prox linha
			}
			
			
			/*
			 * O HashSet, por conta do hashCode e Equals focando só em nome, 
			 * não armazena valores duplicados.
			 * 
			 */
			System.out.println("Users");
			System.out.println("Total Unic Users: " + set1.size());
			System.out.println("Total Users Access: " + set2.size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
