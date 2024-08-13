Você vai criar um sistema que gerencia uma lista de alunos em uma turma. O sistema deve ser capaz de adicionar, remover e listar alunos, bem como calcular a média de notas de todos os alunos na turma.
  
1 - Crie a classe Aluno:
     - nome: String
     - matricula: String
     - nota: double

Implemente um construtor para inicializar esses atributos..

2 - Crie a interface Gerenciamento:

    - void adicionarAluno(Aluno aluno);
    - void removerAluno(String matricula);
    - List<Aluno> listarAlunos();
    - double calcularMedia();

3 - Crie a classe Turma que implementa a interface Gerenciamento:

    - Use uma ArrayList<Aluno> para armazenar os alunos.
    - Implemente os métodos da interface Gerenciamento:
        - adicionarAluno(Aluno aluno): Adicione um aluno à lista.
        - removerAluno(String matricula): Remova um aluno da lista usando o número de matrícula.
        - listarAlunos(): Retorne a lista de alunos.
        - calcularMedia(): Calcule e retorne a média das notas de todos os alunos.

4 - Crie a classe Principal (Main) para testar o sistema:

    - Na classe Principal, crie uma instância da classe Turma.
    - Adicione alguns alunos à turma.
    - Liste todos os alunos.
    - Calcule e exiba a média das notas.

Tarefas Adicionais (Opcional):

  - Implemente um método para encontrar um aluno pelo número de matrícula.
  - Adicione a funcionalidade de atualizar a nota de um aluno.
  - Crie mais validações, como impedir a adição de alunos com o mesmo número de matrícula.
