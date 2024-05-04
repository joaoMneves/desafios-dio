import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> numeros;

  public SomaNumeros() {
    numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    numeros.add(numero);
  }

  public int calcularSoma() {
    int somaTotal = 0;

    for (int i : numeros) {
      somaTotal += i;
    }

    return somaTotal;
  }

  public int encontrarMaiorNumero() { // O(n)
    if (numeros.isEmpty()) {
      throw new RuntimeException("lista vazia");
    }
    int maiorNumero = Integer.MIN_VALUE;

    for (int i : numeros) {
      if (i > maiorNumero) {
        maiorNumero = i;
      }
    }

    return maiorNumero;
  }

  public int encontrarMenorNumero() {
    if (numeros.isEmpty()) {
      throw new RuntimeException("lista vazia");
    }
    int menorNumero = Integer.MAX_VALUE;

    for (int i : numeros) {
      if (i < menorNumero) {
        menorNumero = i;
      }
    }

    return menorNumero;

  }

  public void exibirNumeros() {
    if (numeros.isEmpty()) {
      System.out.println("A lista está vazia!");
    }
    System.out.println(this.numeros);
  }

  public static void main(String[] args) {
    // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);

    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  }
}
