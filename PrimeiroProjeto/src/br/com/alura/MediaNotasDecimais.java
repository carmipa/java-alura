package br.com.alura;

public class MediaNotasDecimais {

    public static void main(String[] args) {

        double nota1 = 10;
        double nota2 = 20;
        double media = 0;

        int nota3 = 0;

        char letra = 'a';
        String palavra = "ator";
        String mensagem = "a letra é " + letra + " e a palavra é " + palavra;

        double precoProduto = 1500;
        int quantidade = 50;
        double valorTotal = precoProduto * quantidade;

        double valorEmDolares = 1500;
        double valorEmReal = 4.94;
        double valorDaConversao = valorEmDolares * valorEmReal;

        double precoOriginal = 150;
        double percentualDeDesconto = 5;
        double valorDoDesconto = (percentualDeDesconto / 100) * precoOriginal;

        media = (nota1 + nota2) / 2;
        System.out.println(media);


        media = (nota1 + nota3) / 2;
        System.out.println(media);


        System.out.println(mensagem);

        System.out.println("Valor total: " + valorTotal);

        System.out.println("O valor do Dollar convertido em Reais é de: R$" + valorDaConversao);

        System.out.println("O valor de desconto será de: R$ " + valorDoDesconto);


    }


}
