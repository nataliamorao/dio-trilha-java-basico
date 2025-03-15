public class ServicoRedesSociais implements ServicoMensagem {
  @Override
  public void enviarMensagem(String mensagem) {
      System.out.println("Enviando mensagem para Redes Sociais: " + mensagem);
  }
}