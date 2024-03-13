package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;

	public Titulo(String nome, int anoDeLancamento) {

		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}

	// get set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	// outro métodos

	public void exibeFichaTecnica() {

		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}

	public void avalia(double nota) {

		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double pegaMedia() {

		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

	@Override
	public int compareTo(Titulo outroTitulo) { // comparar pelo nome do filme em ordem alfabetica
		
		return this.getNome().compareTo(outroTitulo.getNome());
	}

}