package br.com.alura;

import java.util.Scanner;

public class ComparaNumeros {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int comparacao = 0;

        System.out.println("Digite doi número para que estes sejam comparados. ");

        System.out.println("Digite o Primeiro número: ");
        numero1 = leitura.nextInt();

        System.out.println("Digite o Primeiro número: ");
        numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Ou dois números são iguais");

        }else if (numero1 != numero2){
                System.out.println("Os números são diferentes!");
        }

        if (numero1 > numero2){
            System.out.println("O primeiro número é maior que o segundo número");

        }else if(numero2 > numero1 ){
            System.out.println("O segundo número é maior que o primeiro número");

        }
    }
}