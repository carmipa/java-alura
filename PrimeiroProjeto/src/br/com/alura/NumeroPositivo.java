package br.com.alura;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número para saber se ele é positovo ou negativo: ");
        numero = leitura.nextInt();

        if (numero >= 0){
            System.out.println("O número digitado é positivo!");

        }else{
            System.out.println("O número digitado é negativo");
        }

        leitura.close();


    }
}
