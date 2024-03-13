package br.com.alura.screenmatch.main;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {

		System.out.println("\n......................................................................\n");
		
		Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
		
		//meuFilme.setNome("O Poderoso Chefão");
		//meuFilme.setAnoDeLancamento(1972);
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
					
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avaliações: "  + meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegaMedia());
		
		System.out.println("\n......................................................................\n");
		
		Serie lost = new Serie("Lost", 2000);
		
		lost.setTemporadas(10);
		lost.setEpisodioPorTemporada(10);
		lost.setMinutosPorTemporada(50);
		lost.exibeFichaTecnica();
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
		
		System.out.println("\n......................................................................\n");
		
		Filme outroFilme = new Filme("Avatar 2 - Caminho das Águas", 2023);
		
		//outroFilme.setNome("Avatar 2 - Caminho das Águas");
		//outroFilme.setAnoDeLancamento(2023);
		outroFilme.setDuracaoEmMinutos(200);
		outroFilme.exibeFichaTecnica();
				
		System.out.println("\n......................................................................\n");
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		System.out.println("\n......................................................................\n");
		
		FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
				
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		
		System.out.println("\n......................................................................\n");
		
		Filme filmeDoPaulo = new Filme("DogVille", 2003);
		
		//filmeDoPaulo.setNome("DogVille");
		filmeDoPaulo.setDuracaoEmMinutos(200);
		// filmeDoPaulo.setAnoDeLancamento(2003);
		filmeDoPaulo.avalia(10);
		
		/*
		 * System.out.println("Tamanho da lista...: " + lista.size());
		 * System.out.println("Primeiro Filme.....: " + lista.get(0).getNome());
		 * System.out.println(lista); System.out.println("Lista do filme " +
		 * lista.get(0).toString());
		 */

	}

}
