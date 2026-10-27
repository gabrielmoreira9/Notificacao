public class FabricaEmail implements CriadorNotificacao{
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
