package Lambda;

/*
6 - Interface Condicao com boolean testar(int n).
Crie um metodo static void executarSe(Condicao cond, int valor, Acao acao) — se cond.testar(valor) for true, chama acao.executar().
No main, chame passando: uma condição “é par”, o valor 4, e uma ação que imprime "é par!". Depois chame de novo com valor 7 e veja que nada acontece.
*/

@FunctionalInterface
public interface Condicao {
    boolean testar(int n);
}

/*
PASSO A PASSO:
1. Interface funcional que avalia um inteiro e retorna true ou false (mesma ideia do Predicate do Java).
*/
