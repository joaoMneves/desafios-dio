import java.util.Arrays;
import java.util.List;

/**
 * Desafio2 Imprima a soma dos números pares da lista:
 */
public class Desafio2 {

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    System.out.println(numeros.stream().reduce(0, (n1, n2) -> n1 + n2));
  }
}
