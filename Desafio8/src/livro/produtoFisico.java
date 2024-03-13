package livro;

public class produtoFisico  implements ICalculavel{
	
	public String nome;
	public double precoLivro;
	public double taxasLivro;
	public double precoLivroComTaxa;
	public double descontoLivro;
	public double precoLivroComDesconto;
	public double precoFinalProdutoFisico;
	
	public double getPrecoLivro() {
		return precoLivro;
	}
	public void setPrecoLivro(double precoLivro) {
		this.precoLivro = precoLivro;
	}
	public double getTaxasLivro() {
		return taxasLivro;
	}
	public void setTaxasLivro(double taxasLivro) {
		this.taxasLivro = taxasLivro;
	}
	public double getDescontoLivro() {
		return descontoLivro;
	}
	public void setDescontoLivro(double descontoLivro) {
		this.descontoLivro = descontoLivro;
	}

	@Override
	public double calculaPrecoFinal() {
		
		precoLivroComTaxa =(precoLivro * taxasLivro) / 100;
		precoLivroComDesconto = (precoLivro + precoLivroComTaxa * descontoLivro) /100;	
		precoFinalProdutoFisico = precoLivro + precoLivroComDesconto;
		
		System.out.println("O preço final do produto é de: R$ " + precoFinalProdutoFisico);
		
		return precoFinalProdutoFisico;
	}
}
