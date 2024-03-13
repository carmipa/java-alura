package br.com.alura;

import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();


        System.out.println(" Quan o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println(" Diga sua avaliação do file: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano: " + anoDeLancamento);
        System.out.println("Avaliação: "+ avaliacao);


        leitura.close();

    }
}
