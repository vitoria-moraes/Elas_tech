package Contrutores;

/*
EXERCÍCIO — CONSTRUTORES
1. Crie a classe Agendamento com TODOS estes atributos,
   recebidos num construtor só:
   - nomePet (String)
   - servico (String)
   - horario (String)
   - perfume (boolean)
   - laco (boolean)
   - hidratacao (boolean)
   - observacao (String)
   - desconto (double)

   Crie um método mostrar() que imprime tudo.
*/

public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public Agendamento(String nomePet, String servico, String horario,
                       boolean perfume, boolean laco, boolean hidratacao,
                       String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar() {
        System.out.println("Pet: " + nomePet + " | Serviço: " + servico + " | Horário: " + horario);
        System.out.println("Perfume: " + perfume + " | Laço: " + laco + " | Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao + " | Desconto: " + desconto + "%");
        System.out.println("--------------------------------------------------");
    }
}

/*
PASSO A PASSO:
1. Todos os 8 atributos ficam privados e são inicializados obrigatoriamente no único construtor.
2. O método mostrar() exibe todas as informações de cada agendamento formatadas no console.
*/