package ListadeRevisao4;

/*
QUESTÃO 6 - ETAPA 4 (Contrato):
Crie uma interface Notificador com o método notificar(String mensagem).
*/

public interface Notificador {
    void notificar(String mensagem);
}

/*
PASSO A PASSO:
1. Define o contrato que qualquer canal de notificação deve seguir.
2. Permite aplicar o princípio Aberto/Fechado (OCP) e Inversão de Dependência (DIP).
*/
