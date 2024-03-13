package vendas;

public class Produto implements IVendavel{
	
	private String nomeProduto;
	
	private double precoProduto;
	private int quantidadeProduto;
	private double precoProdutoQuantidade;
	private double descontoProduto;
	private double precoDescontoProduto;
	private double precoTotalProduto;
	
	public double getPrecoTotalProduto() {
		return precoTotalProduto;
	}
	public void setPrecoTotalProduto(double precoTotalProduto) {
		this.precoTotalProduto = precoTotalProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public double getDescontoProduto() {
		return descontoProduto;
	}
	public void setDescontoProduto(double descontoProduto) {
		this.descontoProduto = descontoProduto;
	}

	@Override
	public void calculaPrecoTotalProduto() {
		
		precoProdutoQuantidade = precoProduto + quantidadeProduto;
		precoDescontoProduto = (precoProdutoQuantidade * descontoProduto) /100;
		precoTotalProduto = precoProdutoQuantidade + precoDescontoProduto;
		
		System.out.println("Preco do produto com desconto é de..............: R$ " + precoTotalProduto);
			
	}
}
