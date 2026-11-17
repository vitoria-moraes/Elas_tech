package ArrayDeque;

import java.util.ArrayDeque;

public class Atividade4 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma fila com três nomes e
        atenda todos usando while (!fila.isEmpty()).
        No final, imprima "Fila vazia!"*/

        // 1. Criando a fila e adicionando três nomes
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Vitória");
        fila.add("Carlos");
        fila.add("Beatriz");

        // 2. Atendendo todos enquanto a fila NÃO estiver vazia
        while (!fila.isEmpty()) {
            String atendido = fila.poll();
            System.out.println("Atendendo: " + atendido);
        }

        // 3. Imprimindo a mensagem final após esvaziar a fila
        System.out.println("Fila vazia!");
    }

    /*while (!fila.isEmpty()): O ponto de exclamação
    (!) inverte o resultado booleano. Ou seja, o laço
    continua rodando enquanto a fila NÃO estiver vazia.
    fila.poll() dentro do laço: A cada repetição do while,
    o metodo .poll() remove e retorna a pessoa da frente
    da fila, diminuindo o tamanho da fila até que não reste mais ninguém.
    Encerramento: Assim que o último nome ("Beatriz") é
    atendido, fila.isEmpty() passa a ser true, o laço termina
    e o programa imprime "Fila vazia!".*/
}
