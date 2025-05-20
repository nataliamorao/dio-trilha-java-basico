public class Main {
  public static void main(String[] args) {
      ListaTarefa listaTarefa = new ListaTarefa();
      System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

      listaTarefa.adicionarTarefa("Tarefa 1"); 
      listaTarefa.adicionarTarefa("Tarefa 2"); 
      listaTarefa.adicionarTarefa("Tarefa 3"); 
      System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

      listaTarefa.obterDescricoesTarefas();;
  }
}

