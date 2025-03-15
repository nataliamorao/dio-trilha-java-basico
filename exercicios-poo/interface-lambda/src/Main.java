public class Main {
    public static void main(String[] args) {
        Marketing marketing = new Marketing();

        ServicoMensagem sms = mensagem -> System.out.println("Enviando SMS: " + mensagem);
        ServicoMensagem email = mensagem -> System.out.println("Enviando E-mail: " + mensagem);
        ServicoMensagem redesSociais = mensagem -> System.out.println("Enviando mensagem para Redes Sociais: " + mensagem);
        ServicoMensagem whatsapp = mensagem -> System.out.println("Enviando mensagem para WhatsApp: " + mensagem);

        String mensagem = "Promoção imperdível! 50% de desconto em todos os produtos!";

        marketing.enviarMensagem(sms, mensagem);
        marketing.enviarMensagem(email, mensagem);
        marketing.enviarMensagem(redesSociais, mensagem);
        marketing.enviarMensagem(whatsapp, mensagem);
    }
}