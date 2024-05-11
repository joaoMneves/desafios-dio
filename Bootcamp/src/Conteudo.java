/**
 * Conteudo
 */
public abstract class Conteudo {

  protected static final double XP_PADRAO = 10d;

  private String titulo;
  private String descricao;

  public abstract double calcularXP();

  public String getTitulo() {
    return titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "titulo: " + titulo +
        "descricao: " + descricao;
  }
}
