package br.com.alura;

import java.util.Scanner;

public class MediaNotasClasse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int quantidadeAlunos = 0;
        double notas = 0;
        double media = 0;

        System.out.println("Digite a quantidade de alunos: ");
        quantidadeAlunos = scanner.nextInt();

        for(int i = 0; i < quantidadeAlunos; i++){

            System.out.println("Digite a nota dos alunos:");
            notas = scanner.nextDouble();
            notas += notas;
        }

        media = notas /quantidadeAlunos;

        System.out.println("A quantidade de alunos é: " + quantidadeAlunos);
        System.out.println("A média das notas dos alunos é: " + media);

        scanner.close();



    }
}
