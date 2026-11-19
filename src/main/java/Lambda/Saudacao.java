package Lambda;

/*
1 - Crie uma interface Saudacao com um metodo void executar().
Depois, em uma classe com main, crie uma variável desse tipo usando lambda e chame o metodo. O corpo da lambda deve imprimir "oi".
*/

@FunctionalInterface
public interface Saudacao {
    void executar();
}

/*
PASSO A PASSO:
1. Interface funcional com apenas um método abstrato sem parâmetros e sem retorno (void).
*/