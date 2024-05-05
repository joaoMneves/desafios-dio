import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> palavras;

  public ContagemPalavras() {
    palavras = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    palavras.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    palavras.remove(palavra);
  }

  public int exibirContagemPalavras() {
    int contagem = 0;

    for (int i : palavras.values()) {
      contagem += i;
    }

    return contagem;
  }

  public String encontrarPalavraMaisFrequente() {
    String PalavraMaisFrequente = null;
    int frequencia = 0;

    for (Map.Entry<String, Integer> p : palavras.entrySet()) {
      if (p.getValue() > frequencia) {
        PalavraMaisFrequente = p.getKey();
        frequencia = p.getValue();
      }
    }
    return PalavraMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemLinguagens = new ContagemPalavras();

    // Adiciona linguagens e suas contagens
    contagemLinguagens.adicionarPalavra("Java", 2);
    contagemLinguagens.adicionarPalavra("Python", 8);
    contagemLinguagens.adicionarPalavra("JavaScript", 1);
    contagemLinguagens.adicionarPalavra("C#", 6);

    // Exibe a contagem total de linguagens
    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

    // Encontra e exibe a linguagem mais frequente
    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
  }
}
