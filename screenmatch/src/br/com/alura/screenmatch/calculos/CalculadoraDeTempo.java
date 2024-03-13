package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	
	private int tempoTotal;

	public int getTempoTotal() {
		return this.tempoTotal;
	}

	
//	public void inclui(Filme filme) {
//		
//		this.tempoTotal += filme.getDuracaoEmMinutos();
//	}
//	
//	public void inclui(Serie serie) {
//		
//		this.tempoTotal += serie.getDuracaoEmMinutos();
//	}
	
	
	public void inclui(Titulo titulo) { // chamo a super classe como parametro dentro do método, herdando assim os métodos.
		
		System.out.println("Adicionando duração em minutos de: " + titulo);
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
	
	
	

}