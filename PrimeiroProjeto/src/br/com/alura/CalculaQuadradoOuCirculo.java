package br.com.alura;

import java.util.Scanner;

public class CalculaQuadradoOuCirculo {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        // quadrado
        double baseQuadrado = 0;
        double alturaQuadrado = 0;
        double areaQuadrado = 0;

        // circulo
        double raioCirculo = 0;
        double areaCirculo = 0;

        System.out.println("Digite a opção desejada:"
        + "\nCalculo da Área do Quadrado: 1"
        + "\nCalculo da Área do Circulo.: 2");
        opcao = leitura.nextInt();

        if (opcao == 1){
            System.out.println("Calculo da Área do Quadrado");
            System.out.println("Digite o tamanho da base do quadrado: ");
            baseQuadrado = leitura.nextDouble();
            System.out.println("Digite o tamanho da altura do quadrado: ");
            alturaQuadrado = leitura.nextDouble();

            alturaQuadrado = baseQuadrado * alturaQuadrado;

            System.out.println("A área do quadrado mede: " + alturaQuadrado);


        }else if(opcao == 2){
            System.out.println("Cáculo da Área do circulo");
            System.out.println("Digite o raio do circulo: ");
            raioCirculo = leitura.nextDouble();

            areaCirculo = (raioCirculo * raioCirculo) * 3.14;

            System.out.println("A áre do circulo mede: " + areaCirculo);

        }

        leitura.close();

    }
}
