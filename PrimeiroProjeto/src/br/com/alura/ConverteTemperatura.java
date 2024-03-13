package br.com.alura;

import java.util.Scanner;

public class ConverteTemperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;

        System.out.println("Digite a temperatura em Celsius que você deseja converter para Fahrenheit: ");
        celsius = scan.nextDouble();

        fahrenheit = (celsius * 1.8) +32;

        System.out.println("A temperatura convertida de Celsius para Fahrenheit é de: " + fahrenheit + '°');

    }
}
