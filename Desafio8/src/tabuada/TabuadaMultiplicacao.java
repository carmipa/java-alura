package tabuada;

public class TabuadaMultiplicacao implements ITabuada{

	public int numero;
	public int resultado;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public void motrarTabuada() {
		
		 System.out.println("Tabuada do " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	}

}
