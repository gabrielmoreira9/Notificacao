public class FabricaWhatsapp implements CriadorNotificacao {
    @Override
    public Notificacao criarNotificacao(){
        return new NotificacaoWhatsapp();
    }
}
