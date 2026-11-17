package Builder;

/*
ATIVIDADE BUILDER - TESTE NO MAIN (VERSÃO COM LOMBOK)
Refatore seu código da atividade de construtor com o Builder (Pode utilizar lombok).
*/

public class Main {
    public static void main(String[] args) {
        Agendamento a = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .observacao("alérgico a shampoo")
                .desconto(10.0)
                .build();

        Agendamento b = Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();

        Agendamento c = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        a.mostrar();
        b.mostrar();
        c.mostrar();
    }
}

/*
PASSO A PASSO:
1. Com Lombok, usamos Agendamento.builder() em vez de new Agendamento.Builder().
2. Os campos não informados assumem automaticamente os valores padrão (false, 0.0 e "").
*/