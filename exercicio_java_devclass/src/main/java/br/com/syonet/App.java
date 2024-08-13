package br.com.syonet;

public class App {
    public static void main(String[] args) {
        Turma turma = new Turma();

        turma.adicionarAluno(new Aluno("Carlos", "101", 7));
        turma.adicionarAluno(new Aluno("João", "102", 8.5));
        turma.adicionarAluno(new Aluno("Alberto", "103", 6));
        turma.adicionarAluno(new Aluno("Renato", "104", 9));

        String matriculaProcurada = "101";
        Aluno alunoEncontrado = turma.encontrarAlunoMatricula(matriculaProcurada); //encontrar aluno pela matrícula

        String matriculaParaRemover = "101";
        
        if (matriculaParaRemover != null && !matriculaParaRemover.isEmpty()) {
            turma.removerAluno(matriculaParaRemover);
        }
        System.out.println("Lista de alunos: ");
        for (Aluno aluno : turma.listarAlunos()) {
            System.out.println(aluno);
        }

        double media = turma.calcularMedia();
        System.out.println("Média das notas: " + media);

        if (alunoEncontrado == null) {
            System.out.println("");
        } else {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
        }
    }
}


