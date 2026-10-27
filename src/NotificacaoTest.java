public class NotificacaoTest {

    public static void main(String[] args) {

        // Criamos uma fábrica de e-mail
        CriadorNotificacao fabrica = new FabricaEmail();

        // A fábrica cria o objeto de notificação
        Notificacao notificacao = fabrica.criarNotificacao();

        // Enviamos a mensagem
        notificacao.enviar("Seu pedido foi aprovado!");

        // Agora utilizamos a fábrica de SMS
        fabrica = new FabricaSMS();

        notificacao = fabrica.criarNotificacao();

        notificacao.enviar("Seu pedido foi aprovado!");

        // Por último, utilizamos a fábrica de WhatsApp
        fabrica = new FabricaWhatsapp();

        notificacao = fabrica.criarNotificacao();

        notificacao.enviar("Seu pedido foi aprovado!");
    }
}
