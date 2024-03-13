package desafio12;

public class Produto {
	
	private String nomeProduto;
	private double precoProduto;
	
	 double desconto;
	
	
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
	
	
	
	public void aplicarDesconto(double valorPercentual) {
		
		desconto = precoProduto * (valorPercentual / 100);
		precoProduto -= desconto;
		
	}
	
	

}
