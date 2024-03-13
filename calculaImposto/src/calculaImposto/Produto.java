package calculaImposto;

public class Produto extends Item implements Tributavel {

    private double peso;

    public double calculaImposto() {
        //produto tem 10% de imposto:
        return getPreco() * 0.1;
    }

	private double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

    // métodos getters e setters omitidos

}