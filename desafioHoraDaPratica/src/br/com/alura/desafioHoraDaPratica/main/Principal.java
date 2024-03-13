package br.com.alura.desafioHoraDaPratica.main;

import java.util.ArrayList;

import br.com.alura.desafioHoraDaPratica.bean.PessoaBean;

public class Principal {
	
	public static void main(String[] args) {
				
		ArrayList<PessoaBean> listaDePessoas = new ArrayList<>();
		
		PessoaBean pessoa1 = new PessoaBean("Akemi", 18);
		PessoaBean pessoa2 = new PessoaBean("Rodrigo", 30);
		PessoaBean pessoa3 = new PessoaBean("Caroline", 35);
				
		listaDePessoas.add(pessoa1);
		listaDePessoas.add(pessoa2);
		listaDePessoas.add(pessoa3);
		
		System.out.println("Tamanho da lista: " + listaDePessoas.size());
		
		
	}

}
