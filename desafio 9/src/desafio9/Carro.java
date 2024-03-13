package desafio9;

public class Carro {
	
	String modelo = "Corolla";
	int ano = 2024;
	String cor = "preto-eclipse";
	String menu;
	
	void exibeFichaTecnica() {
		
		System.out.println("Modelo do carro....: " + modelo);
		System.out.println("Ano de fabricação..: " + ano);
		System.out.println("Cor do carro.......: " + cor);
		
	}
	
	int calculaAnoDoCarro() {
		
		return 2024 - ano;
	}
	

}
