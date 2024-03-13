package com.veiculos;

public abstract class Veiculo {
	
	private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void acelerar();

    public abstract void frear();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
	

}