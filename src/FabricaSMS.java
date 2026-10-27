public class FabricaSMS implements CriadorNotificacao{
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
