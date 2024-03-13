package br.com.alura.desafioHoraDaPratica.bean;

public class PessoaBean {
	
	private String nome;
	private int idade;
	
	public PessoaBean(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa: " + nome + " (idade: " + idade + ")";
	}


}
