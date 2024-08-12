package br.com.syonet;

import java.util.List;

public interface Gerenciamento {
    void adicionarAluno(Aluno aluno);
    void removerAluno(String matricula);
    List<Aluno> listarAlunos();
    double calcularMedia();
}
