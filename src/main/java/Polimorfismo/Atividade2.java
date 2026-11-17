package Polimorfismo;

public class Atividade2 {
    /*
    (mesma classe — muda o TIPO do parâmetro)
    Crie a classe Painel com QUATRO métodos chamados exibir, cada um
    recebendo um tipo diferente: String, int, boolean e double.
    Cada um imprime de um jeito, dizendo que tipo recebeu.
    Chame os quatro.
    Depois pense: por que o System.out.println() aceita texto, número,
    boolean e objeto, ao invés de ter um metodo println para cada?
    É exatamente isso que vocês acabaram de fazer
    */

    public static void main(String[] args) {
        Painel painel = new Painel();

        painel.exibir("Bem-vinda ao Java!");
        painel.exibir(2026);
        painel.exibir(true);
        painel.exibir(9.8);
    }
}

/*
Explicação Passo a Passo:
1. Sobrecarga por tipo de parâmetro: Todos os quatro métodos têm exatamente
   a mesma quantidade de parâmetros (apenas 1), mas o Java consegue diferenciá-los
   pelo tipo do dado passado na chamada (String, int, boolean ou double).
2. Conexão com o System.out.println(): A classe PrintStream do Java (usada pelo
   System.out) implementa dezenas de versões sobrecarregadas do metodo println()
   — println(String), println(int), println(boolean), println(double), println(Object) —
   para que possamos chamar sempre o mesmo nome de metodo para qualquer dado.
*/