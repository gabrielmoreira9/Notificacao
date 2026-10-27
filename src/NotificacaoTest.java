public class NotificacaoTest {

    public static void main(String[] args) {

        CriadorNotificacao fabrica = new FabricaEmail();

        Notificacao notificacao = fabrica.criarNotificacao();

        notificacao.enviar("Seu pedido foi aprovado!");

        fabrica = new FabricaSMS();

        notificacao = fabrica.criarNotificacao();

        notificacao.enviar("Seu pedido foi aprovado!");

        fabrica = new FabricaWhatsapp();

        notificacao = fabrica.criarNotificacao();

        notificacao.enviar("Seu pedido foi aprovado!");
    }
}
