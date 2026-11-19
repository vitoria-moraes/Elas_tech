package Lambda;

/*
2 - Interface Impressora com void imprimir(String texto).
Crie duas variáveis diferentes desse tipo usando duas lambdas — uma que imprime o texto em maiúsculo, outra que imprime em minúsculo. Chame as duas.
*/

@FunctionalInterface
public interface Impressora {
    void imprimir(String texto);
}

/*
PASSO A PASSO:
1. Interface funcional que recebe uma String como parâmetro e não retorna nada.
*/