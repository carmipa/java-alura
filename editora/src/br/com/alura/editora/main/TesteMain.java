package br.com.alura.editora.main;

import br.com.alura.editora.bean.Artigo;
import br.com.alura.editora.bean.Livro;
import br.com.alura.editora.bean.Revista;

public class TesteMain {

	public static void main(String[] args) {

		System.out.println("\n.............................................................................\n");

		Livro livro = new Livro();

		livro.setAutor("C.S.Lewis");
		livro.setTitulo("As Cronicas de Narnia - O Leão, a Feiticeira e o Guarda Roupas");
		livro.setAnoDePublicacao(2002);
		System.out.println(livro.exibirInformacao());

		Artigo artigo = new Artigo();

		artigo.setAutor("C.S.Lewis");
		artigo.setTitulo("O propósito princípal do ser humano");
		artigo.setPalavraChave("Lewis");
		System.out.println(artigo.exibirInformacao());

		Revista revista = new Revista();

		revista.setTitulo("Batman - O cavaleiro das Trevas");
		revista.setMesPublicacao("janeiro");
		revista.setEditora("Panini");
		System.out.println(revista.exibirInformacao());

	}

}
