package br.com.alura.editora.bean;

public class Revista implements Iinformacao {

	private String titulo;
	private String editora;
	private String mesPublicacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getMesPublicacao() {
		return mesPublicacao;
	}

	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}

	@Override
	public String exibirInformacao() {

		return "Revista: " + this.getTitulo() + "\nEditora: " + this.getEditora() + "\nMês de Publicação: "
				+ this.getMesPublicacao()
				+ "\n.............................................................................\n";
	}

}
