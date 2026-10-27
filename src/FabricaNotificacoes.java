public class FabricaNotificacoes {
    public Notificacao criarNotificacao(String tipo){
        if(tipo.equals("EMAIL")){
            return new NotificacaoEmail();
        }

        if(tipo.equals("WHATSAPP")){
            return new NotificacaoWhatsapp();
        }

        if(tipo.equals("SMS")){
            return new NotificacaoSMS();
        }

        return null;
    }
}
