package desafio12;

public class Aluno {
	
	private String nome;
	private double notas1;
	private double notas2;
	private double notas3;

			
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotas1() {
		return notas1;
	}
	public void setNotas1(double notas1) {
		this.notas1 = notas1;
	}
	public double getNotas2() {
		return notas2;
	}
	public void setNotas2(double notas2) {
		this.notas2 = notas2;
	}
	public double getNotas3() {
		return notas3;
	}
	public void setNotas3(double notas3) {
		this.notas3 = notas3;
	}

	
	public double mediaDasNotas() {
		

		return (notas1 + notas2 + notas3) / 3;
	}
}
