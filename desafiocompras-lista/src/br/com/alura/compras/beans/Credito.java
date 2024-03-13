package br.com.alura.compras.beans;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.compras.interfaces.ICredito;

public class Credito implements ICredito{

	private double limite;
	private double saldo;
	private List<Compras> credito;

	public double getLimite() {
		return limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<Compras> getCredito() {
		return credito;
	}

	public void setCredito(List<Compras> credito) {
		this.credito = credito;
	}

	public Credito(double limite) {
		super();
		this.limite = limite;
		this.saldo = limite;
		this.credito = new ArrayList<Compras>();
	}

	@Override
	public boolean lancaCompra(Compras compras) {

		if (this.saldo > compras.getPreco()) {
			this.saldo -= compras.getPreco();
			this.credito.add(compras);
			return true;
		}
		return false;
	}

}
