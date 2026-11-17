package ArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Atividade2 {
    public static void main(String[] args) {
        /*Enunciado: Crie uma fila com addAll. Use peek
        para mostrar quem é o próximo e imprima a
        fila logo depois. Repare que ela não mudou.*/

        // 1. Criando a fila e adicionando várias pessoas de uma vez com addAll
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.addAll(List.of("Vitória", "Carlos", "Beatriz", "Daniel"));

        // 2. Usando .peek() para espiar quem é o próximo da fila (o primeiro)
        System.out.println("Próximo da fila (peek): " + fila.peek());

        // 3. Imprimindo a fila logo depois para confirmar que ninguém foi removido
        System.out.println("Fila após o peek: " + fila);
    }

    /*.addAll(List.of(...)): Adiciona todos os
    nomes na fila de uma vez só (usei List.of(...)
    porque funciona direto no Java 21 sem dar erro
    de importação; basta importar java.util.List).
    .peek(): Serve apenas para espiar o primeiro
    elemento da fila (a cabeça da fila), retornando "Vitória",
    mas sem removê-la. Por isso, quando você imprime a
    fila na linha seguinte, "Vitória" continua lá na primeira posição.*/
}
