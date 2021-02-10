package entities;

public class Candidato_Problema6 {
	private String nome;
	private int qtdvotos;

	public Candidato_Problema6(String nome, Integer qtdvotos) {
		this.nome = nome;
		this.qtdvotos = qtdvotos;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdvotos() {
		return qtdvotos;
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato_Problema6 other = (Candidato_Problema6) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	

	



	
}
