package br.com.alura;

import java.util.Scanner;

public class VerificaParOuImpar {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número para saber se ele é para ou impar: ");
        numero = leitura.nextInt();

        if (numero % 2 == 0){

            System.out.println("O número diitado é PAR: " + numero);

        }else{
            System.out.println("Número digitado é IMPAR: " + numero);
        }

        leitura.close();

    }
}
