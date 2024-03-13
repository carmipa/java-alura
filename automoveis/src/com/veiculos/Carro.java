package com.veiculos;

public class Carro extends Veiculo{
	
	private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    public void frear() {
        System.out.println("Carro freando...");
    }

    public int getNumPortas() {
        return numPortas;
    }
    

}
