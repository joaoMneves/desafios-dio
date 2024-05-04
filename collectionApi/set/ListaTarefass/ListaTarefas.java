import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> tarefasSet;

  public ListaTarefas() {
    tarefasSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    Tarefa novaTarefa = new Tarefa(descricao, false);
    tarefasSet.add(novaTarefa);
  }// : Adiciona uma nova tarefa ao Set.

  public void removerTarefa(String descricao) {
    if (tarefasSet.isEmpty()) {
      throw new RuntimeException("Set vazio");
    }
    Tarefa tarefaRemover = null;
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equals(descricao)) {
        tarefaRemover = t;
        break;
      }
    }
    tarefasSet.remove(tarefaRemover);
  }// : Remove uma tarefa do Set de acordo com a descrição, se estiver presente.

  public void exibirTarefas() {
    if (tarefasSet.isEmpty()) {
      throw new RuntimeException("Set vazio");
    } else {
      System.out.println("set: " + tarefasSet);
    }
  }// : Exibe todas as tarefas da lista de tarefas.

  public int contarTarefas() {
    if (tarefasSet.isEmpty()) {
      return 0;
    }
    int count = 0;
    for (Tarefa t : tarefasSet) {
      count++;
    }
    return count;
  }// : Conta o número total de tarefas na lista de tarefas.

  public Set<Tarefa> obterTarefasConcluidas() {
    if (tarefasSet.isEmpty()) {
      throw new RuntimeException("Set vazio");
    }
    Set<Tarefa> tarefasConcluidas = new HashSet<>();

    for (Tarefa t : tarefasSet) {
      if (t.getConcluida()) {
        tarefasConcluidas.add(t);
      }
    }
    return tarefasConcluidas;
  }// : Retorna um Set com as tarefas concluídas.

  public Set<Tarefa> obterTarefasPendentes() {
    if (tarefasSet.isEmpty()) {
      throw new RuntimeException("Set vazio");
    }
    Set<Tarefa> tarefasPendentes = new HashSet<>();

    for (Tarefa t : tarefasSet) {
      if (!t.getConcluida()) {
        tarefasPendentes.add(t);
      }
    }
    return tarefasPendentes;
  }// : Retorna um Set com as tarefas pendentes.

  public void marcarTarefaConcluida(String descricao) {
    if (tarefasSet.isEmpty()) {
      throw new RuntimeException("Set vazio");
    }
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equals(descricao)) {
        t.setConcluida(true);
      }
    }
  }// : Marca uma tarefa como concluída de acordo com a descrição.

  public void marcarTarefaPendente(String descricao) {
    if (tarefasSet.isEmpty()) {
      throw new RuntimeException("Set vazio");
    }
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equals(descricao)) {
        t.setConcluida(false);
      }
    }
  }// : Marca uma tarefa como pendente de acordo com a descrição.

  public void limparListaTarefas() {
    if (tarefasSet.isEmpty()) {
      System.out.println("A lista já está vazia!");
    } else {
      tarefasSet.clear();
    }
  }// : Remove todas as tarefas da lista de tarefas.

  public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

    // Adicionando tarefas à lista
    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    // Exibindo as tarefas na lista
    listaTarefas.exibirTarefas();

    // Removendo uma tarefa
    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}
