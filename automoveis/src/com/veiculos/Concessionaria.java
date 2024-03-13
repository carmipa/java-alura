package com.veiculos;

public class Concessionaria {
	

	public void venderVeiculo(Veiculo veiculo) {
        System.out.println("Veículo vendido: " + veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getAno());
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Onix", 2022, 4);
        Moto moto = new Moto("Honda", "CB 500", 2021, true);

        Concessionaria concessionaria = new Concessionaria();
        concessionaria.venderVeiculo(carro);
        concessionaria.venderVeiculo(moto);
    }

}
