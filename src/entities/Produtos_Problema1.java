package entities;

import javax.print.attribute.standard.MediaSize.Other;

public class Produtos_Problema1 implements Comparable<Produtos_Problema1>{
	
	private String nome;
	private Double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produtos_Problema1(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	
	}
	@Override
	public String toString() {
		return "Nome: " + nome + " - R$: " + String.format("%.2f", preco) ;
	}

	@Override
	public int compareTo(Produtos_Problema1 other) {
		return preco.compareTo(other.getPreco());
	}
	
}
