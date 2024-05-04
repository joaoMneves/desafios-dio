
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
  private List<Item> items;

  public Carrinho() {
    this.items = new ArrayList<Item>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    Item i = new Item(nome, preco, quantidade);

    this.items.add(i);
  }

  public void removerItem(String nome) {
    List<Item> itemsRemover = new ArrayList<>();

    for (Item i : items) {
      if (i.getNome().equals(nome)) {
        itemsRemover.add(i);
      }
    }
    items.removeAll(itemsRemover);
  }

  public double calcularValorTotal() {
    double valor = 0;

    for (Item i : items) {
      valor += i.getPreco() * i.getQuantidade();
    }

    return valor;
  }

  public void exibirItens() {
    for (Item i : items) {
      System.out.printf("\tnome: %s, quant: %s, valor unit: %s, valor total: %s\n", i.getNome(), i.getQuantidade(),
          i.getPreco(), i.getQuantidade() * i.getPreco());
    }

    System.out.println("Total a pagar: " + this.calcularValorTotal());
  }

  public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    Carrinho carrinhoDeCompras = new Carrinho();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
  }
}
