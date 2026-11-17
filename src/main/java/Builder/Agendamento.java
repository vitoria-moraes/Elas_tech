package Builder;

/*
ATIVIDADE BUILDER (VERSÃO COM LOMBOK)
Refatore seu código da atividade de construtor com o Builder (Pode utilizar lombok).
*/

import lombok.Builder;

@Builder
public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    @Builder.Default
    private String observacao = "";
    private double desconto;

    public void mostrar() {
        System.out.println("Pet: " + nomePet + " | Serviço: " + servico + " | Horário: " + horario);
        System.out.println("Perfume: " + perfume + " | Laço: " + laco + " | Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao + " | Desconto: " + desconto + "%");
        System.out.println("--------------------------------------------------");
    }
}

/*
PASSO A PASSO:
1. A anotação @Builder gera automaticamente toda a classe Builder, os métodos encadeados e o .build() em tempo de compilação.
2. @Builder.Default garante que observacao inicie como "" em vez de null quando não informada.
*/