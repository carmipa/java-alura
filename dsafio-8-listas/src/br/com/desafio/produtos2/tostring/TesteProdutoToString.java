package br.com.desafio.produtos2.tostring;

import java.util.ArrayList;

public class TesteProdutoToString {

	public static void main(String[] args) {
		
		ArrayList<ProdutoToString> lista = new ArrayList<>();
		ProdutoToString produto = new ProdutoToString("mouse", 44.50, 10);
		
		//lista.add(new ProdutoToString("mouse", 44.50, 30));

		for (ProdutoToString produtoS : lista) {
			System.out.println(produto);
		}

	}

}
