
public class Item {
  private String nome;
  private double preco;
  private int quantidade;

  public Item(String nome, double preco, int quantidade) {
    this.quantidade = quantidade;
    this.preco = preco;
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

}
