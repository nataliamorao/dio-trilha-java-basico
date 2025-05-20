import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  //atributo
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  //metodo para remover tarefa

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    if (tarefaList.isEmpty()) {
      for (Tarefa t : tarefaList) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  } else {
      System.out.println("A lista de tarefas está vazia.");
    }
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    if (!tarefaList.isEmpty()) {
      System.out.println(tarefaList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }
}