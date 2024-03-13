package livro;

public class Livro implements ICalculavel{
	
	public String nome;
	public double precoLivro;
	public double taxasLivro;
	public double precoLivroComTaxa;
	public double descontoLivro;
	public double precoLivroComDesconto;
	public double precoFinalLivro;
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	public double getPrecoFinalLivro() {
		return precoFinalLivro;
	}
	public void setPrecoFinalLivro(double precoFinalLivro) {
		this.precoFinalLivro = precoFinalLivro;
	}

	
	@Override
	public double calculaPrecoFinal() {
		
		precoLivroComTaxa =(precoLivro * taxasLivro) / 100;
		precoLivroComDesconto = (precoLivro + precoLivroComTaxa * descontoLivro) /100;	
		precoFinalLivro = precoLivro + precoLivroComDesconto;
		
		System.out.println("O preço do livo incluido taxas e decontos é de: R$ " + precoFinalLivro);
		
		return precoFinalLivro;
	}

}
