package livro;

public class Teste {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		produtoFisico produto = new produtoFisico();
						
		livro.setNome("O Hobbit");
		livro.setPrecoLivro(100);
		livro.setTaxasLivro(5);
		livro.setDescontoLivro(10);
				
		produto.setPrecoLivro(100);
		produto.setTaxasLivro(5);
		produto.setDescontoLivro(10);
				
		System.out.println("\n..........................................\n");
		livro.calculaPrecoFinal();
		produto.calculaPrecoFinal();
		System.out.println("\n..........................................\n");

	}

}

