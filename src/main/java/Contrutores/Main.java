package Contrutores;

/*
Na Main, crie 3 agendamentos:
a) Thor, banho, 14h, com perfume e laço, sem hidratação,
   "alérgico a shampoo", 10% de desconto
b) Luna, tosa, 10h, sem nenhum extra, sem observação,
   sem desconto
c) Mel, banho, 16h, só com hidratação, sem observação,
   sem desconto
*/

public class Main {
    public static void main(String[] args) {
        Agendamento a = new Agendamento("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 10.0);
        Agendamento b = new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0.0);
        Agendamento c = new Agendamento("Mel", "banho", "16h", false, false, true, "", 0.0);

        a.mostrar();
        b.mostrar();
        c.mostrar();
    }
}

/*
PASSO A PASSO:
1. Instancia os 3 objetos passando todos os 8 argumentos na ordem exata do construtor.
2. Esse exercício prepara o terreno para o padrão Builder (próxima atividade), mostrando como construtores gigantes são difíceis de ler e manter.
*/
