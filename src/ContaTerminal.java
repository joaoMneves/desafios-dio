public class ContaTerminal {
  int numero;
  String agencia;
  String nomeCliente;
  double saldo;

  public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
    this.numero = numero;
    this.agencia = agencia;
    this.nomeCliente = nomeCliente;
    this.saldo = saldo;
  }

  public int RetornarNumero() {
    return this.numero;
  }

  public String RetornarAgencia() {
    return this.agencia;
  }

  public String RetornarNomeCliente() {
    return this.nomeCliente;
  }

  public double RetornarSaldo() {
    return this.saldo;
  }
}
