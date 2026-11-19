package Observer;

/*
6 - Agora monte o mesmo padrão do zero, com outro tema:
a) Crie uma interface ObservadorEstoque com o método void atualizar(int quantidade).
*/

public interface ObservadorEstoque {
    void atualizar(int quantidade);
}

/*
PASSO A PASSO:
1. Interface que representa o Observer para alterações numéricas no estoque.
*/