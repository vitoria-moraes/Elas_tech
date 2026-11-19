package Lambda;

/*
4 - Antes eu guardava a ação e chamava. Agora eu entrego a ação e deixo o metodo decidir o que fazer com ela.
Interface Acao com void executar().
Crie um metodo static void repetir(Acao acao) que chama acao.executar() duas vezes.
No main, chame repetir passando uma lambda que imprime "oi".
Repare que você não cria variável, a lambda vai direto como argumento.
*/

@FunctionalInterface
public interface Acao {
    void executar();
}

/*
PASSO A PASSO:
1. Define a ação genérica sem parâmetros que será passada como argumento para métodos.
*/
