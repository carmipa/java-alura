package br.com.alura.referenciaDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
    	
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João", 20));
        alunos.add(new Aluno("Maria", 18));
        alunos.add(new Aluno("Pedro", 22));

        Turma turma = new Turma(alunos);
        int mediaIdade = turma.calcularMediaIdade();
        System.out.println("A média de idade da turma é: " + mediaIdade);
        
        System.out.println("\n...........................................................\n");
        
        List<Aluno> alunos2 = new ArrayList();
        alunos2.add(new Aluno("Paulo", 44));
        alunos2.add(new Aluno("Pedro", 18));
        alunos2.add(new Aluno("Thiago", 25));
        
        Turma turma2 = new Turma(alunos2);
        int mediaIdade2 = turma2.calcularMediaIdade();
        System.out.println("A média de idade dos alunos da turma 2 é: " + mediaIdade2);
    }
}