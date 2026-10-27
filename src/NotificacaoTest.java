public class NotificacaoTest {
    public static void main ( String [] args) {

        FabricaNotificacoes fabrica = new FabricaNotificacoes();

        Notificacao notificacao = fabrica.criarNotificacao("EMAIL");
        notificacao.enviar("Seu pedido foi aprovado!");

        notificacao = fabrica.criarNotificacao("WHATSAPP");
        notificacao.enviar("Seu pedido foi aprovado!");

        notificacao = fabrica.criarNotificacao("SMS");
        notificacao.enviar("Seu pedido foi aprovado!");
    }
}
