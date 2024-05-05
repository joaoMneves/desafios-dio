import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * LivrariaOnline
 */
public class LivrariaOnline {
  private Map<String, Livro> livros;

  public LivrariaOnline() {
    livros = new HashMap<>();
  }

  public void adicionarLivro(String link, Livro livro) {
    livros.put(link, livro);
  }

  public void removerLivro(String titulo) {
    String keyRemover = null;

    for (Map.Entry<String, Livro> e : livros.entrySet()) {
      if (e.getValue().getTitulo().equalsIgnoreCase(titulo)) {
        keyRemover = e.getKey();
      }
    }
    livros.remove(keyRemover);
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {

    List<Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

    Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

    Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

    for (Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
      livrosOrdenados.put(entry.getKey(), entry.getValue());
    }
    return livrosOrdenados;
  }

  public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
    List<Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

    Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorAutor());

    Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

    for (Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
      livrosOrdenados.put(entry.getKey(), entry.getValue());
    }
    return livrosOrdenados;
  }

  public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
    Map<String, Livro> livrosComAutor = new HashMap<>();

    for (Map.Entry<String, Livro> entry : livros.entrySet()) {
      if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
        livrosComAutor.put(entry.getKey(), entry.getValue());
      }
    }
    return livrosComAutor;
  }

  public Map.Entry<String, Livro> obterLivroMaisCaro() {
    if (livros.isEmpty()) {
      throw new RuntimeException("map vazio");
    }

    List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livros.entrySet());

    Collections.sort(livrosOrdenados, new ComparatorPorPreco());
    Collections.reverse(livrosOrdenados);

    return livrosOrdenados.get(0);
  }

  public Map.Entry<String, Livro> obterLivroMaisBarato() {
    if (livros.isEmpty()) {
      throw new RuntimeException("map vazio");
    }

    List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livros.entrySet());

    Collections.sort(livrosOrdenados, new ComparatorPorPreco());

    return livrosOrdenados.get(0);
  }

  public static void main(String[] args) {
    LivrariaOnline livrariaOnline = new LivrariaOnline();
    // Adiciona os livros à livraria online
    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun",
        new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6",
        new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4",
        new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

    // Exibe todos os livros ordenados por preço
    System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

    // Exibe todos os livros ordenados por autor
    System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

    // Pesquisa livros por autor
    String autorPesquisa = "Josh Malerman";
    livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

    // Obtém e exibe o livro mais caro
    System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

    // Obtém e exibe o livro mais barato
    System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

    // Remover um livro pelo título
    livrariaOnline.removerLivro("1984");
    System.out.println(livrariaOnline.livros);

  }
}
