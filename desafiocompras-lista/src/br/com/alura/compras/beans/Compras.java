package br.com.alura.compras.beans;

import java.util.Scanner;
import br.com.alura.compras.interfaces.ICompras;

public class Compras implements ICompras, Comparable<Compras>{

	private String produto;
	private int quantidade;
	private double preco;
	private double totalCompras;

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public Double comprasLoja() {

		return totalCompras = quantidade * preco;

	}

	
	  public void exibeCompras() {
	  
	  System.out.println("Lista de compras"); System.out.println();
	  System.out.println("Produto...................: " + produto);
	  System.out.println("Quantidade................: " + quantidade);
	  System.out.println("Preço unitário............: R$ " + preco);
	  System.out.println("--------------------------- ");
	  System.out.println("Valor total da compra.....: R$ " + totalCompras);
	  
	  }
	 

	
	  public void menuCompras() {
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("**************** LOJA ****************");
	  System.out.println(); System.out.println("Produto...................: " +
	  produto); produto = scanner.nextLine();
	  System.out.println("Quantidade................: " + quantidade); quantidade =
	  scanner.nextInt(); setQuantidade(quantidade);
	  System.out.println("Preco:....................: R$ " + preco); preco =
	  scanner.nextDouble(); setPreco(preco);
	  
	  }
	 

	public Compras(String produto, int quantidade, double preco) {

		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Lista de compras:`" 
				+ "" 
				+ "Produto...................: " + produto
				+ "Quantidade................: " + quantidade
				+ "Preço unitário............: R$ " + preco;
	}

	@Override
	public int compareTo(Compras outraCompra) {
		// TODO Auto-generated method stub
		return Double.valueOf(this.preco).compareTo(Double.valueOf(outraCompra.preco));
	}

}
