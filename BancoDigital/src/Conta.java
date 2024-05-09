/**
 * Conta
 */
public class Conta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  double saldo;
  int agencia;
  int numero;
  Cliente cliente;

  public Conta(Cliente cliente) {
    this.cliente = cliente;
    saldo = 0D;
    agencia = Conta.AGENCIA_PADRAO;
    numero = SEQUENCIAL++;
  }

  public void sacar(Double dinheiro) {
    saldo -= dinheiro;
  }

  public void depositar(Double dinheiro) {
    saldo += dinheiro;
  }

  public void transferir(Double dinheiro, Conta conta) {
    saldo -= dinheiro;

    conta.depositar(dinheiro);
  }

  protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }

  public double getSaldo() {
    return saldo;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  protected void imprimirExtrato() {
  }
}
