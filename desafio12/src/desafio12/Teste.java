package desafio12;

public class Teste {

	public static void main(String[] args) {
		
		
		// 2
		System.out.println("\n......................................................................\n");
		
		IdadePessoa idade = new IdadePessoa();
		
		idade.setNome("Paulo André Carminati");
		idade.setIdade(44);
		
		System.out.println("Nome...: " + idade.getNome());
		System.out.println("Idade..: " + idade.getIdade());
		idade.verificaIdade();
		
		System.out.println("-----------------------------------");
		
		idade.setNome("Clara Carminati");
		idade.setIdade(8);
		
		System.out.println("Nome...: " + idade.getNome());
		System.out.println("Idade..: " + idade.getIdade());
		idade.verificaIdade();
		
		System.out.println("\n......................................................................\n");
		
				
		// 3
		
		Produto produto = new Produto();
		
		produto.setNomeProduto("camisa");
		produto.setPrecoProduto(200);
		produto.aplicarDesconto(7);
		System.out.println("O preço com desconto é de: R$ " + produto.getPrecoProduto());
		
		System.out.println("\n......................................................................\n");
		
		// 4
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Paulo André Carminati");
		aluno.setNotas1(10);
		aluno.setNotas2(7);
		aluno.setNotas3(8);
		
		System.out.println("Nome do Aluno..........................: " + aluno.getNome());
		System.out.println("Primeira nota..........................: " + aluno.getNotas1());
		System.out.println("Segunda nota...........................: " + aluno.getNotas2());
		System.out.println("Terceira nota..........................: " + aluno.getNotas3());
		System.out.println("A média das notas do aluno foi de......: " + aluno.mediaDasNotas());
				
		System.out.println("\n......................................................................\n");
		
		
		// 5
		
		Livro livro = new Livro();
		
		livro.setAutor("C.S.Lewis");
		livro.setTitulo("Cronicas de Narnia - volume único");
		
		livro.exibeDetalhes();		

	}

}
