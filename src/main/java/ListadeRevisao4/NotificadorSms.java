package ListadeRevisao4;

/*
QUESTÃO 6 - ETAPA 4 (Implementação 2):
Crie a implementação NotificadorSms imprimindo a mensagem de um jeito diferente.
*/

public class NotificadorSms implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS] Enviando: " + mensagem);
    }
}

/*
PASSO A PASSO:
1. Implementa a interface Notificador com formatação própria para SMS.
*/