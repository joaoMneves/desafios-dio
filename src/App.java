import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("digite a sua agencia: ");
    String agencia = scanner.next();

    System.out.print("digite o seu nome: ");
    String nome = scanner.next();

    System.out.print("digite o numero de sua agencia: ");
    int numero = scanner.nextInt();

    System.out.print("digite o seu saldo: ");
    double saldo = scanner.nextDouble();

    ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
        conta.RetornarNumero(), conta.RetornarAgencia(), conta.RetornarAgencia(), conta.RetornarSaldo());

  }
}
