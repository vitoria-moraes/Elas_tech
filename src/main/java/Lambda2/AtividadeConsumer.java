package Lambda2;

/*
2 - Consumer
Consumer algo entra, nada sai.
Crie um Consumer<String> que receba um nome e imprima "Olá, " + nome.
Use com .accept("Flora").
Depois crie um segundo Consumer<String> que imprima o nome em maiúsculo.
*/

import java.util.function.Consumer;

public class AtividadeConsumer {
    public static void main(String[] args) {
        Consumer<String> saudacao = nome -> System.out.println("Olá, " + nome);
        Consumer<String> maiusculo = nome -> System.out.println(nome.toUpperCase());

        saudacao.accept("Flora");
        maiusculo.accept("Flora");
    }
}

/*
PASSO A PASSO:
1. Consumer<T> recebe um parâmetro do tipo T e executa uma ação sem retornar nada.
2. O método .accept() dispara a execução passando o valor "Flora" para dentro da lambda.
*/