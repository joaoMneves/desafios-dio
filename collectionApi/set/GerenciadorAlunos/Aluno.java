import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
  private long matricula;
  private String nome;
  private double nota;

  public Aluno(long matricula, String nome, double nota) {
    this.nota = nota;
    this.matricula = matricula;
    this.nome = nome;
  }

  public long getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public double getNota() {
    return nota;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Aluno aluno))
      return false;
    return aluno.getMatricula() == matricula;
  }

  @Override
  public int compareTo(Aluno a) {
    return nome.compareTo(a.getNome());
  }

  @Override
  public String toString() {
    return "[" + nome + ", " + nota + "]";
  }
}

class ComparatorPorNota implements Comparator<Aluno> {

  @Override
  public int compare(Aluno aluno1, Aluno aluno2) {
    return Double.compare(aluno1.getNota(), aluno2.getNota());
  }

}
