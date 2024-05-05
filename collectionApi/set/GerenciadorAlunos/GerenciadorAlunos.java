import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    alunosSet = new HashSet<>();
  }

  //
  public void adicionarAluno(String nome, Long matricula, double nota)// : Adiciona um aluno ao conjunto.
  {
    alunosSet.add(new Aluno(matricula, nome, nota));
  }

  public void removerAluno(long matricula)// : Remove um aluno ao conjunto a partir da matricula, se estiv er presente.
  {
    Aluno alunoRemover = null;
    for (Aluno a : alunosSet) {
      if (a.getMatricula() == matricula) {
        alunoRemover = a;
        break;
      }
    }
    if (alunoRemover == null) {
      System.out.println("aluno ausente");
    } else {
      alunosSet.remove(alunoRemover);
    }
  }

  public Set<Aluno> exibirAlunosPorNome()// : Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
  {
    Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
    return alunosPorNome;
  }

  public Set<Aluno> exibirAlunosPorNota()// : Exibe todos os alunos do conjunto em ordem crescente de nota.
  {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
    alunosPorNota.addAll(alunosSet);
    return alunosPorNota;

  }

  public void exibirAlunos()// Exibe todos os alunos do conjunto.
  {
    if (alunosSet.isEmpty()) {
      System.out.println("conjunto vazio");

    } else {
      System.out.println(alunosSet);
    }
  }

  public static void main(String[] args) {
    // Criando uma instância do GerenciadorAlunos
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador:");
    gerenciadorAlunos.exibirAlunos();

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAluno(000L);
    gerenciadorAlunos.removerAluno(123457L);
    gerenciadorAlunos.exibirAlunos();

    // Exibindo alunos ordenados por nome
    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

    // Exibindo alunos ordenados por nota
    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
  }
}
