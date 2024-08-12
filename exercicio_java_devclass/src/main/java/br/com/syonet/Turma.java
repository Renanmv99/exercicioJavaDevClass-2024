package br.com.syonet;

import java.util.ArrayList;
import java.util.List;

public class Turma implements Gerenciamento {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).matricula.equals(matricula)) {
                alunos.remove(i);
                break;
            }
        }
    }

    public List<Aluno> listarAlunos() {
        ArrayList<Aluno> copiaAlunos = new ArrayList<Aluno>();
        for (int i = 0; i < alunos.size(); i++) {
            copiaAlunos.add(alunos.get(i));
        }
        return copiaAlunos;
    }

    public double calcularMedia() {
        if (alunos.size() == 0) {
            return 0.0;
        }

        double somaNotas = 0.0;
        for (int i = 0; i < alunos.size(); i++) {
            somaNotas += alunos.get(i).nota;
        }

        return somaNotas / alunos.size();
    }

    public Aluno encontrarAlunoMatricula(String matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).matricula.equals(matricula)) {
                return alunos.get(i);
            }
        }
        return null;
    }
}
