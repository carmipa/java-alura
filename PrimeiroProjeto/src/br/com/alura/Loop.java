package br.com.alura;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println(" Diga sua avaliação do file: ");
            nota = leitura.nextDouble();

            mediaAvaliacao += nota;

        }
        System.out.println(" A Média das avaliaçãoes é: " + mediaAvaliacao/3);


    leitura.close();


    }
}
