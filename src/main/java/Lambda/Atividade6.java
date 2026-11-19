package Lambda;

/*
6 - Crie um metodo static void executarSe(Condicao cond, int valor, Acao acao) — se cond.testar(valor) for true, chama acao.executar().
No main, chame passando: uma condição “é par”, o valor 4, e uma ação que imprime "é par!". Depois chame de novo com valor 7 e veja que nada acontece.
*/

public class Atividade6 {
    public static void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor)) {
            acao.executar();
        }
    }

    public static void main(String[] args) {
        executarSe(n -> n % 2 == 0, 4, () -> System.out.println("é par!"));
        executarSe(n -> n % 2 == 0, 7, () -> System.out.println("é par!"));
    }
}

/*
PASSO A PASSO:
1. executarSe combina duas lambdas: uma Condicao (boolean) e uma Acao (void).
2. Com 4, 4 % 2 == 0 é true e imprime "é par!". Com 7, é false e nada é impresso.
*/
