package desafio9;

public class Musica {
	
	String titulo = "But Still";
	String artista = "Aimer";
	int anoDeLancamento = 2004;
	int avaliacao = 9;
	int numeroDeAvaliacoes = 1000;
	double somaDasAvaliacoes;
	String linkDaMusica = "https://www.youtube.com/watch?v=vZdKESXKgPU";
	
	void exibeFichaTecnica() {
		
		System.out.println("Nome da música............: " + titulo);
		System.out.println("Nome do artista...........: " + artista);
		System.out.println("Ano de lançamento.........: " + anoDeLancamento);
		System.out.println("Avaliações................: " + avaliacao);
		System.out.println("Número de avaliações......: " + numeroDeAvaliacoes);
		System.out.println("link para ouvir a música..: " + linkDaMusica);
				
	}
	
	void avalia(double nota) {
		
		somaDasAvaliacoes += nota;
		numeroDeAvaliacoes++;
	}
	
	double mediaAvaliacoes() {
		
		return somaDasAvaliacoes / numeroDeAvaliacoes;
	}

}
