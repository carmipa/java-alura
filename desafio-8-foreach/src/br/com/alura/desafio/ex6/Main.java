package br.com.alura.desafio.ex6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(1989, 650.0);
		ContaBancaria conta2 = new ContaBancaria(2008, 1000.0);
		ContaBancaria conta3 = new ContaBancaria(6963, 5000.0);
		ContaBancaria conta4 = new ContaBancaria(7854, 98999.0);
		
		ArrayList<ContaBancaria> lista = new ArrayList<ContaBancaria>();
		lista.add(conta1);
		lista.add(conta2);
		lista.add(conta3);
		lista.add(conta4);
		
		ContaBancaria contaMaiorSaldo = lista.get(0);
        for (ContaBancaria conta : lista) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
		
		

	}

}
