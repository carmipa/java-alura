package vendas;

public class Servico implements IVendavel{
	
	private String nomeServico;
	private double precoServico;
	private double descontoServico;
	private double precoServicoComDesconto;
	private double precoTotalServico;
	
	public double getPrecoTotalServico() {
		return precoTotalServico;
	}
	public void setPrecoTotalServico(double precoTotalServico) {
		this.precoTotalServico = precoTotalServico;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public double getPrecoServico() {
		return precoServico;
	}
	public void setPrecoServico(double precoServico) {
		this.precoServico = precoServico;
	}
	public double getDescontoServico() {
		return descontoServico;
	}
	public void setDescontoServico(double descontoServico) {
		this.descontoServico = descontoServico;
	}

	@Override
	public void calculaPrecoTotalProduto() {
		
		precoServicoComDesconto = (precoServico * descontoServico) / 100;
		precoTotalServico = precoServico - precoServicoComDesconto;
		
		System.out.println("Preço total do serviço com desconto é de:.......: R$ " + precoTotalServico );
	}

}
