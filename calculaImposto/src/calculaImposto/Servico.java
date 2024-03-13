package calculaImposto;

public class Servico extends Item implements Tributavel {

    private int quantidadeHoras;

    public double calculaImposto() {
        //serviço tem 12% de imposto:
        return getPreco() * 0.12;
    }

	private double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

    // outros métodos da classe Servico

}