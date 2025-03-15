public class ServicoSMS implements ServicoMensagem {
  @Override
  public void enviarMensagem(String mensagem) {
      System.out.println("Enviando SMS: " + mensagem);
  }
}