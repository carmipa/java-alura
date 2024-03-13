package br.com.biblioteca.beans;

public class LivrosBean {

	private String tituloLivro;
	private String autorLivre;
	private int anoPublicacaoLivro;
	private int numeroPaginasLivro;

	public LivrosBean(String tituloLivro, String autorLivro, int anoPublicacaoLivro, int numeroPaginasLivro) {

	}

	public String getTituloLivro() {
		return tituloLivro;
	}

	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	public String getAutorLivre() {
		return autorLivre;
	}

	public void setAutorLivre(String autorLivre) {
		this.autorLivre = autorLivre;
	}

	public int getAnoPublicacaoLivro() {
		return anoPublicacaoLivro;
	}

	public void setAnoPublicacaoLivro(int anoPublicacaoLivro) {
		this.anoPublicacaoLivro = anoPublicacaoLivro;
	}

	public int getNumeroPaginasLivro() {
		return numeroPaginasLivro;
	}

	public void setNumeroPaginasLivro(int numeroPaginasLivro) {
		this.numeroPaginasLivro = numeroPaginasLivro;
	}

}
