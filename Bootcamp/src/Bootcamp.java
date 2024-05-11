import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Bootcamp
 */
public class Bootcamp {

  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Conteudo> conteudos = new LinkedHashSet<>();
  private Set<Devs> devsInscritos = new HashSet<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataInicial() {
    return dataInicial;
  }

  public LocalDate getDataFinal() {
    return dataFinal;
  }

  public Set<Conteudo> getConteudos() {
    return conteudos;
  }

  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }

  public Set<Devs> getDevsInscritos() {
    return devsInscritos;
  }

  public void setDevsInscritos(Set<Devs> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }
}
