package br.com.syonet;

public class Aluno {
    String nome;
    String matricula;
    double nota;

    Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Nota: " + nota;
    }
}
