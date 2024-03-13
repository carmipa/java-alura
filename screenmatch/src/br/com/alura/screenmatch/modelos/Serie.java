package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

	private int temporadas;
	private boolean ativa;
	private int episodioPorTemporada;
	private int minutosPorTemporada;

	public Serie(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);

	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getEpisodioPorTemporada() {
		return episodioPorTemporada;
	}

	public void setEpisodioPorTemporada(int episodioPorTemporada) {
		this.episodioPorTemporada = episodioPorTemporada;
	}

	public int getMinutosPorTemporada() {
		return minutosPorTemporada;
	}

	public void setMinutosPorTemporada(int minutosPorTemporada) {
		this.minutosPorTemporada = minutosPorTemporada;
	}

	@Override // possibilita que um método seja sobscrito
	public int getDuracaoEmMinutos() {

		return temporadas * episodioPorTemporada * minutosPorTemporada;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
	}

}