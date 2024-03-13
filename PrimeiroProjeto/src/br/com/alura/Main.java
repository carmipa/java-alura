package br.com.alura;

public class Main {
    public static void main(String[] args) {

            int anoDeLancamento = 2022;
            boolean incluidoNoPlano = true;
            double notaDoFilme = 8.1;

            double media = (9.8 + 6.3 + 8.0) / 3;

            String sinopse;

            int classificacao;
            classificacao = (int) (media /2);


            // esse formato de impressão foi criado e apareceu no java15
            sinopse = """
	                Filme top Gun
	                Filme de aventura com galã dos anos 80
	                Muito bom!
	                Ano de lançamento
	                """ + anoDeLancamento;


            System.out.println("Esse é o Screen Match");
            System.out.println("Filme:  Top Gun: Maverick" + "Ano de lançamento " + anoDeLancamento);

            System.out.println("media = " + media);

            System.out.println(sinopse);


            System.out.println(classificacao);








    }
}