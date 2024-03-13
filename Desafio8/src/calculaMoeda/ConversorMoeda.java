package calculaMoeda;

public class ConversorMoeda implements IConvercaoFinanceira{

	private double cotacaoDollar = 4.94;
	private double valorReal;
	
	@Override
	public void converteDollarParaReal(double valorDollar) {
		
		valorReal = valorDollar * cotacaoDollar;
		System.out.println("O valor do Dollar convertido para reais é de: R$ " + valorReal);
			
		
	}
		
	}
