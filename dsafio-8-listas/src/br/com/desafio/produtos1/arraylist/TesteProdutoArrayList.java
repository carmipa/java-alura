package br.com.desafio.produtos1.arraylist;

import java.util.ArrayList;

public class TesteProdutoArrayList {

	public static void main(String[] args) {

		Produto produto1 = new Produto();

		produto1.setNome("caneta");
		produto1.setPreco(2.50);
		produto1.setQuantidade(10);

		Produto produto2 = new Produto();

		produto2.setNome("carro Toyota Corola 2024");
		produto2.setPreco(158.000);
		produto2.setQuantidade(1);

		ArrayList<Produto> lista = new ArrayList<Produto>();

		lista.add(produto1);
		System.out.println("Lista de produto " + lista.size());
		System.out.println("Produto.......: " + lista.get(0).getNome());
		System.out.println("Preço.........: " + lista.get(0).getPreco());
		System.out.println("Quantidade....: " + lista.get(0).getQuantidade());
		System.out.println(".............................................\n");

		lista.add(produto2);
		System.out.println("Lista de produto " + lista.size());
		System.out.println("Produto.......: " + lista.get(1).getNome());
		System.out.println("Preço.........: " + lista.get(1).getPreco());
		System.out.println("Quantidade....: " + lista.get(1).getQuantidade());
		System.out.println(".............................................\n");

	}

}
