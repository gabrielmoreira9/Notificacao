public class NotificacaoWhatsapp implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Whatsapp enviado: " + mensagem);
    }
}
