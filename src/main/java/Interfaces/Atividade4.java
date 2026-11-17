package Interfaces;

/*
Exercício 4:
Crie uma interface Notificacao com o método enviar(String mensagem).
Crie duas classes que implementam ela: Email e SMS. Cada uma
imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
e percorra com for-each, enviando a mesma mensagem.
Saída esperada:
E-mail enviado: Sua compra foi aprovada!
SMS enviado: Sua compra foi aprovada!
*/

import java.util.ArrayList;

public class Atividade4 {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Sua compra foi aprovada!");
        }
    }
}

/*
Explicação Passo a Passo:
1. Interface com parâmetro (void enviar(String mensagem)): Diferente da
   interface Animal, aqui o contrato exige que toda classe receba uma String
   como argumento ao implementar o método.
2. Polimorfismo no for-each: A lista guarda tanto Email quanto SMS sob o tipo
   genérico Notificacao. Ao chamar notificacao.enviar("Sua compra foi aprovada!"),
   cada classe formata e imprime a mesma mensagem do seu próprio jeito.
*/