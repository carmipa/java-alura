package br.com.alura.compras.main;

import java.util.Collections;
import java.util.Scanner;

import br.com.alura.compras.beans.Compras;
import br.com.alura.compras.beans.Credito;

public class TesteCompras {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o limite do cartão: ");
		double limite = leitura.nextDouble();
		Credito cartao = new Credito(limite);

		int sair = 1;
		while (sair != 0) {
			System.out.println("Produto:");
			String descricao = leitura.next();

			System.out.println("Preço: R$ ");
			double preco = leitura.nextDouble();

			Compras compra = new Compras(descricao, sair, preco);
			boolean compraRealizada = cartao.lancaCompra(compra);

			if (compraRealizada) {
				System.out.println("Compra realizada!");
				System.out.println("Digite 0 para sair ou 1 para continuar");
				sair = leitura.nextInt();
			} else {
				System.out.println("Saldo insuficiente!");
				sair = 0;
			}
		}

		System.out.println("***********************");
		System.out.println("COMPRAS REALIZADAS:\n");
		Collections.sort(cartao.getCredito());
		Collections.sort(cartao.getCredito());
		
		for (Compras c : cartao.getCredito()) {
			System.out.println(c.getProduto() + " - " + c.getPreco());
		}
		
		System.out.println("\n***********************");

		System.out.println("\nSaldo do cartão: " + cartao.getSaldo());

	}

}
