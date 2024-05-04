import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  private List<Integer> lista;

  public OrdenacaoNumeros() {
    lista = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    lista.add(numero);
  }

  public List<Integer> ordenarAscendente() {
    if (lista.isEmpty()) {
      throw new RuntimeException("lista vazia");
    }
    List<Integer> listaAscendente = new ArrayList<>(lista);

    Collections.sort(listaAscendente);

    return listaAscendente;
  }

  public List<Integer> ordenarDescendente() {
    if (lista.isEmpty()) {
      throw new RuntimeException("lista vazia");
    }
    List<Integer> listaDescendente = new ArrayList<>(lista);

    listaDescendente.sort(Collections.reverseOrder());
    return listaDescendente;
  }

  public void exibirNumeros() {
    if (lista.isEmpty()) {
      System.out.println("A lista está vazia!");
    }
    System.out.println(this.lista);
  }

  public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println(numeros.ordenarAscendente());

    // Exibindo a lista
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem descendente
    System.out.println(numeros.ordenarDescendente());

    // Exibindo a lista
    numeros.exibirNumeros();
  }
}
