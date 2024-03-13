package br.com.alura.editora.bean;

public class Artigo implements Iinformacao {

	private String titulo;
	private String autor;
	private String palavraChave;

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

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	@Override
	public String exibirInformacao() {

		return "Artigo: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nPlavra Chave: "
				+ this.getPalavraChave()
				+ "\n.............................................................................\n";
	}

}
