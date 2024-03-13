package br.com.alura.desafio12;

import java.util.ArrayList;
import java.util.Collections;

public class Teste1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(2);
		numeros.add(8);
		numeros.add(1);

		Collections.sort(numeros);

		System.out.println("Lista ordenada: " + numeros);

	}

}
