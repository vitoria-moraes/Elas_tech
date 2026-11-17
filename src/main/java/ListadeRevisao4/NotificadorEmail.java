package ListadeRevisao4;

/*
QUESTÃO 6 - ETAPA 4 (Implementação 1):
Crie a implementação NotificadorEmail imprimindo a mensagem de um jeito diferente.
*/

public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[E-MAIL] Enviando: " + mensagem);
    }
}

/*
PASSO A PASSO:
1. Implementa a interface Notificador usando implements.
2. Define o comportamento específico para envio por e-mail.
*/