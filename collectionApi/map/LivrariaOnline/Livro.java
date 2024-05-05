import java.util.Comparator;
import java.util.Map;

public class Livro {
  private String titulo;
  private String autor;
  private Double preco;

  public Livro(String titulo, String autor, Double preco) {
    this.autor = autor;
    this.preco = preco;
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public Double getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return "[" + titulo + ", " + preco + "," + autor + "]";
  }

}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {

  @Override
  public int compare(Map.Entry<String, Livro> arg0, Map.Entry<String, Livro> arg1) {
    return Double.compare(arg0.getValue().getPreco(), arg1.getValue().getPreco());
  }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {

  @Override
  public int compare(Map.Entry<String, Livro> arg0, Map.Entry<String, Livro> arg1) {
    return arg0.getValue().getAutor().compareTo(arg1.getValue().getAutor());
  }

}
