package desafio9;

public class Teste {

	public static void main(String[] args) {
		
		
		
		// 1
		System.out.println("\n.................................\n");
		Pessoa pessoa = new Pessoa();
		pessoa.exibeMensagem();
		System.out.println("\n.................................\n");
		
				
		//2 -- nesse método é onde apanhei e surgira dúvidas e mais dúvidas.
		Calculadora calculadora = new Calculadora();
		int numero = 10;
		int resultado = calculadora.dobrarNumero(numero);
		System.out.println("O dobro do número de : " + numero + " é " + resultado);
		System.out.println("\n.................................\n");
		
		// 3
		
		Musica musica = new Musica();
		
		musica.exibeFichaTecnica();
		
		musica.avalia(10);
		musica.avalia(8);
		musica.avalia(9);
		
		System.out.println("Média das avaliações: " + musica.mediaAvaliacoes());
		System.out.println("\n.................................\n");
		
		// 4
		
		Carro carro = new Carro();
		
		carro.exibeFichaTecnica();
		
		System.out.println("Idade do Carro: " + carro.calculaAnoDoCarro() + " anos");
		System.out.println("\n.................................\n");
		
		// 5
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Paulo André Bormanas Carminati D'Brambilla";
		aluno.idade = 44;
		
		aluno.exibeInformacoes();
		System.out.println("\n.................................\n");
		

	}

}
