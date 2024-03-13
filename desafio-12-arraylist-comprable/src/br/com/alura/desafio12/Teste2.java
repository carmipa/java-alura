package br.com.alura.desafio12;

import java.util.ArrayList;
import java.util.Collections;

public class Teste2 {

	public static void main(String[] args) {
		ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo());
        listaTitulos.add(new Titulo());
        listaTitulos.add(new Titulo());

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }

	}

}
