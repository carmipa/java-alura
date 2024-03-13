package br.com.alura.referenciaDeObjetos;

import java.util.List;

public class Turma {
	
    private List<Aluno> alunos;

    public Turma(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int calcularMediaIdade() {
        int somaIdades = 0;
        for (Aluno aluno : alunos) {
            somaIdades += aluno.getIdade();
        }
        return somaIdades / alunos.size();
    }
}
