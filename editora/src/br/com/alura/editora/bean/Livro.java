package br.com.alura.editora.bean;

public class Livro implements Iinformacao {

	private String titulo;
	private String autor;
	private int anoDePublicacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	@Override
	public String exibirInformacao() {

		return "Livro: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nAno da publicação: "
				+ this.getAnoDePublicacao()
				+ "\n.............................................................................\n";

	}

}
