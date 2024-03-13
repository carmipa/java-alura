package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao{
	
	private String diretor;

	public Filme(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);	
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		return (int) (pegaMedia() / 2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
	}
	
	
	
	
	

}
