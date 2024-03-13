package br.com.alura.desafio8;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		/*
		 * ArrayList<String> listaStrings = new ArrayList<>(); listaStrings.add("Java");
		 * listaStrings.add("C++"); listaStrings.add("Python");
		 * 
		 * for (String elemento : listaStrings) { System.out.println(elemento); }
		 */

		/*
		 * Cachorro cachorro = new Cachorro(); Animal animal = (Animal) cachorro;
		 */

		/*
		 * Animal animal = new Cachorro();
		 * 
		 * if (animal instanceof Cachorro) { Cachorro cachorro = (Cachorro) animal; //
		 * Agora você pode usar o objeto 'cachorro' como um Cachorro. } else {
		 * System.out.println("O objeto não é um Cachorro."); }
		 */

		Produto produto1 = new Produto("Ar condicionado", 2000.0);
		Produto produto2 = new Produto("Aquecedor", 800.0);
		Produto produto3 = new Produto("Ventilador", 150.0);

		ArrayList<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(produto1);
		listaProdutos.add(produto2);
		listaProdutos.add(produto3);

		double somaPrecos = 0;
		for (Produto produto : listaProdutos) {
			somaPrecos += produto.getPreco();
		}

		double precoMedio = somaPrecos / listaProdutos.size();
		System.out.println("Preço médio dos produtos: " + precoMedio);
	}
}
