package br.com.alura.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Produto A", 10.0));
        listaProdutos.add(new Produto("Produto B", 5.0));
        listaProdutos.add(new Produto("Produto C", 15.0));
        listaProdutos.add(new Produto("Produto D", 8.0));

        Collections.sort(listaProdutos);

        for (Produto produto : listaProdutos) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }

	}

}
