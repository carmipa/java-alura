package br.com.desafio.produtos2.tostring;

public class ProdutoToString {

	private String nome;
	private double preco;
	private int quantidade;

	public ProdutoToString(String string, double d, int i) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String toSTring() {
		return "Produto [nome: " + nome + " Preço: " + preco + " Quantidade: " + quantidade + "]";

	}

}
