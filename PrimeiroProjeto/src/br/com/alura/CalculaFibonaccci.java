package br.com.alura;

public class CalculaFibonaccci {

    public static void main(String[] args) {
        int contador = 0;
        int numeroAnterior = 0;
        int numeroAtual = 1;

        System.out.println("Sequência de Fibonacci:");

        while (contador < 20) {
            System.out.println(numeroAtual);

            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;

            contador++;
        }
    }
}