import java.util.Objects;

public class Tarefa {
  private String descricao;
  private Boolean concluida;

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Tarefa tarefa))
      return false;
    return Objects.equals(getDescricao(), tarefa.getDescricao());
  }

  @Override
  public String toString() {
    return "[ desc:" + descricao + ", concluida: " + concluida + "]";
  }

  public Tarefa(String descricao, boolean concluida) {
    this.descricao = descricao;
    this.concluida = concluida;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Boolean getConcluida() {
    return concluida;
  }

  public void setConcluida(Boolean concluida) {
    this.concluida = concluida;
  }

}
