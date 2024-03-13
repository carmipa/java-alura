package br.com.alura.desafio.ex6;

public class ContaBancaria {
	
	private int numeroDaConta;
	private double saldo;
	
	 public ContaBancaria(int numeroDaConta, double saldo) {
	        this.numeroDaConta = numeroDaConta;
	        this.saldo = saldo;
	    }

	    public int getNumeroConta() {
	        return numeroDaConta;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

}
