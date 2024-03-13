package br.com.alura.screenmatch.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {

		Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
		meuFilme.avalia(9);
		Filme outroFilme = new Filme("Avatar 2 - Caminho das Águas", 2023);
		meuFilme.avalia(9);
		Filme filmeDoPaulo = new Filme("DogVille", 2003);
		meuFilme.avalia(9);
		Serie lost = new Serie("Lost", 2000);
		meuFilme.avalia(9);

		Filme f1 = filmeDoPaulo;

		System.out.println("\n......................................................................\n");

		// ArrayList<Titulo> lista = new ArrayList<>();
		// List<Titulo> lista = new ArrayList<>(); importando pelo objeto tipo lista
		// mais genérico

		List<Titulo> lista = new LinkedList(); // linkedlist - mais rápida e gasta menus memória, usando ponteiro de
												// dados (vectorlist é para multitreed)

		lista.add(filmeDoPaulo);
		lista.add(outroFilme);
		lista.add(meuFilme);
		lista.add(lost);

		for (Titulo item : lista) {
			System.out.println("Titulo: " + item.getNome());
			if (item instanceof Filme filme) { // pode ser assim também: if(item instanceof Filme filme &&
												// filme.getClassificacao() > 2) {
				System.out.println("Classificação: " + filme.getClassificacao());
			}

		}

		System.out.println("\n......................................................................\n");

		ArrayList<String> buscaPorArtista = new ArrayList<String>();
		buscaPorArtista.add("Adan Sandler");
		buscaPorArtista.add("Paulo");
		buscaPorArtista.add("Jaqueline");
		System.out.println(buscaPorArtista);

		System.out.println("\n......................................................................\n");

		Collections.sort(buscaPorArtista);
		System.out.println("print depois do collections sort que coloca em ordem alfabetica: ");
		System.out.println(buscaPorArtista);

		System.out.println("\n......................................................................\n");

		System.out.println("Lista de titulos ordenados: ");
		Collections.sort(lista);
		System.out.println(lista);

		System.out.println("\n......................................................................\n");

		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); // comparator usando lambda para comparar o bjeto
																		// lista
		System.out.println("Ordenando por ano: ");
		System.out.println(lista);

		System.out.println("\n......................................................................\n");

	}

}
