package com.veiculos;

public class Moto extends Veiculo{
	
	private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    public void frear() {
        System.out.println("Moto freando...");
    }

    public boolean hasPartidaEletrica() {
        return partidaEletrica;
    }

}
