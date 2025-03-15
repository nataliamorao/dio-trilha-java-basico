public class ServicoWhatsApp implements ServicoMensagem {
  @Override
  public void enviarMensagem(String mensagem) {
      System.out.println("Enviando mensagem para WhatsApp: " + mensagem);
  }
}