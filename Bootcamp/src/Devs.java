import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Devs
 */
public class Devs {

  private String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public Devs() {
  }

  public void inscreverBootcamp(Bootcamp bootcamp) {
    conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();

    if (conteudo.isPresent()) {
      conteudosInscritos.remove(conteudo.get());
      conteudosConcluidos.add(conteudo.get());
    } else {
      System.err.println("vc não está matriculado");
    }
  }

  public double calcularTotalXP() {
    return this.conteudosConcluidos.stream().map(n -> n.calcularXP()).reduce(0d, (n1, n2) -> n1 + n2);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }

}
