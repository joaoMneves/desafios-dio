interface ReprodutorMusical {
  public void tocar();

  public void pausar();

  public void selecionarMusica();
}

interface Telefone {
  public void ligar();

  public void atender();

  public void iniciarCorreioVoz();
}

interface NavegadorInternet {
  public void exibirPagina();

  public void adicionarNovaAba();

  public void atualizarPagina();
}

public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet {
  public void tocar() {
    System.out.println("tocando");
  }

  public void pausar() {
    System.out.println("pausando");
  }

  public void selecionarMusica() {
    System.out.println("selecionando musica");
  }

  public void ligar() {
    System.out.println("ligando");
  }

  public void atender() {
    System.out.println("atendendo");
  }

  public void iniciarCorreioVoz() {
    System.out.println("iniciando Correio voz");
  }

  public void exibirPagina() {
    System.out.println("exibindo");
  }

  public void adicionarNovaAba() {
    System.out.println("adicionando nova aba");
  }

  public void atualizarPagina() {
    System.out.println("atualizando");
  }

}
