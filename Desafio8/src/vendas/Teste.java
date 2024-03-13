package vendas;

public class Teste {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setNomeProduto("Caneta");
		produto.setPrecoProduto(60);
		produto.setQuantidadeProduto(30);
		produto.setDescontoProduto(5);
		
		Servico servico = new Servico();
		servico.setNomeServico("Mecanico de Carro");
		servico.setPrecoServico(1500);
		servico.setDescontoServico(4);
		
		System.out.println("\n...............................................................\n");
		System.out.println("Nome produto....................................: " + produto.getNomeProduto());
		System.out.println("Preço unitário do produto:......................: " + "R$ " + produto.getPrecoProduto());
		System.out.println("Quantidade de produto...........................: " + produto.getQuantidadeProduto());
		System.out.println("Desconto para o produto.........................: " + produto.getDescontoProduto() + "%");
		produto.calculaPrecoTotalProduto();
		System.out.println("\n...............................................................\n");
		System.out.println("nome do serviço.................................: " + servico.getNomeServico());
		System.out.println("Preso do serviço................................: " + "R$ " + servico.getPrecoServico());
		System.out.println("Desconto no serviço.............................: " + servico.getDescontoServico() + "%");
		servico.calculaPrecoTotalProduto();
		System.out.println("\n...............................................................\n");
		
		produto.calculaPrecoTotalProduto();
		servico.calculaPrecoTotalProduto();
		double valorTotalPrecoServico = produto.getPrecoTotalProduto() + servico.getPrecoTotalServico();
		System.out.println("Valor total da operação.........................: " + "R$ " + valorTotalPrecoServico);
		System.out.println("\n...............................................................\n");

	}

}
