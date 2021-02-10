package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import entities.Candidato_Problema6;

public class Program_Problema6 {

	public static void main(String[] args) {
		String arquivo = ".\\.\\PastaBase\\Urnas.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String line = br.readLine();
			Map<Candidato_Problema6, Integer> eleicao = new LinkedHashMap<>();
				
			while(line!=null){
				System.out.println(line);

				String[] entrada = line.split(",");
				Candidato_Problema6 candidato = new Candidato_Problema6(entrada[0], Integer.parseInt(entrada[1]));

				//int votos = candidato.getQtdvotos();
				if(eleicao.containsKey(candidato)) {
					//votos += eleicao.get(candidato);
					//eleicao.put(candidato, votos);
					eleicao.put(candidato, candidato.getQtdvotos() + eleicao.get(candidato) );
				}else
				{
					//eleicao.put(candidato, votos);
					eleicao.put(candidato, candidato.getQtdvotos());
				}
				line = br.readLine();
			}
			
			System.out.println();
			System.out.println("Candidatos: ");
			for(Candidato_Problema6 key : eleicao.keySet() ) {
				System.out.println(key + ": "+ eleicao.get(key));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
