package br.com.biblioteca.main;

import br.com.biblioteca.beans.LivrosBean;

public class PrincipalMain {

	public static void main(String[] args) {
		
		LivrosBean livros = new LivrosBean("As Crônicas de Narnia - o leão a feiticeira e o guarda roupas", "C.S.Lewis",2006, 750);
		
		String titulo = livros.getTituloLivro();
		System.out.println("Titulo do livro: " + titulo);

	}

}
